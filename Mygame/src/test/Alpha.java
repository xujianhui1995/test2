package test;

import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Alpha {
	public static void main1(String[] args) {
		new Alpha();
	}
	// protected static Logger logger = Logger.getLogger(ClientSocket.class);

	public byte[] transferAlpha(Image image) {

		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

		try {
			ImageIcon imageIcon = new ImageIcon(image);
			BufferedImage bufferedImage = new BufferedImage(imageIcon.getIconWidth(), imageIcon.getIconHeight(),
					BufferedImage.TYPE_4BYTE_ABGR);
			Graphics2D g2D = (Graphics2D) bufferedImage.getGraphics();
			g2D.drawImage(imageIcon.getImage(), 0, 0, imageIcon.getImageObserver());
			int alpha = 0;
			for (int j1 = bufferedImage.getMinY(); j1 < bufferedImage.getHeight(); j1++) {
				for (int j2 = bufferedImage.getMinX(); j2 < bufferedImage.getWidth(); j2++) {
					int rgb = bufferedImage.getRGB(j2, j1);

					int R = (rgb & 0xff0000) >> 16;
					int G = (rgb & 0xff00) >> 8;
					int B = (rgb & 0xff);
					if (((255 - R) < 30) && ((255 - G) < 30) && ((255 - B) < 30)) {
						rgb = ((alpha + 1) << 24) | (rgb & 0x00ffffff);
					}

					bufferedImage.setRGB(j2, j1, rgb);

				}
			}

			g2D.drawImage(bufferedImage, 0, 0, imageIcon.getImageObserver());
			// ImageIO.write(bufferedImage, "png", new File("d:/test.png.png"));

			ImageIO.write(bufferedImage, "png", byteArrayOutputStream);
		} catch (Exception e) {
			// logger.error(e.toString());
		} finally {

		}

		return byteArrayOutputStream.toByteArray();

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int width = 100;

		int height = 100;

		// 1.创建一个不带透明色的BufferedImage对象

		BufferedImage bimage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		// 2.创建一个带透明色的BufferedImage对象

		bimage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

		// 3.创建一个与屏幕相适应的BufferedImage对象

		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

		GraphicsDevice gs = ge.getDefaultScreenDevice();

		GraphicsConfiguration gc = gs.getDefaultConfiguration();

		// Create an image that does not support transparency

		bimage = gc.createCompatibleImage(width, height, Transparency.OPAQUE);

		// Create an image that supports transparent pixels

		bimage = gc.createCompatibleImage(width, height, Transparency.BITMASK);

		// Create an image that supports arbitrary levels of transparency

		bimage = gc.createCompatibleImage(width, height,

				Transparency.TRANSLUCENT);

	}
}