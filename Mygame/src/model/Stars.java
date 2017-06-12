package model;

import java.awt.Graphics;
import java.awt.Image;

import util.ImageUtil;

public class Stars {
	Image img;
	double x, y;
	int width, high;

	public void draw(Graphics g) {
		g.drawImage(img, (int) x, (int) y, null);

	}

	public Stars() {

	}

	public Stars(String path, double x, double y) {
		this.img = ImageUtil.getImage(path);
		this.width = img.getWidth(null);
		this.high = img.getHeight(null);
		this.x = x - width / 2;
		this.y = y - high / 2;

	}

	public Stars(Image img) {
		this.img = img;
		this.width = img.getWidth(null);
		this.high = img.getHeight(null);

	}

}
