package frame;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import model.Plane;
import util.Constants;

public class MyFrame extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image win_image = null;
	Plane p = new Plane("images/LXPlane.png", Constants.PLANE_X, Constants.PLANE_Y, Constants.PLANE_SIZE, Constants.PLANE_SIZE);

	public void LaunchFrame() {
		setTitle("飞机大战");
		setSize(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT);
		setLocation(Constants.FRAME_LOCATION_X, Constants.FRAME_LOCATION_Y);
		setVisible(true);
		setBackground(Color.BLACK);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}

		});
		new RepaintThread().start();
	}
	
	class RepaintThread extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (true) {
				try {
					sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// initView();
				repaint();
			}
		}
	}

	/*
	 * 用于制作双缓冲
	 * 
	 */
	public void update(Graphics g) {
		if (win_image == null) {
			// 创建一个画布
			win_image = createImage(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT);
			// 画笔:在新的画布上进行绘画
			Graphics gp = win_image.getGraphics();
			// 将元素画到新的画布上
			paint(gp);
			// 将画布绘制到窗体上
			g.drawImage(win_image, 0, 0, this);

			// 清空画布
			win_image = null;
		}
	}

}
