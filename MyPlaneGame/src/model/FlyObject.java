package model;

import java.awt.Graphics;
import java.awt.Image;

import util.ImageUtil;

public class FlyObject {

	Image img;
	int x, y;
	int width, height;

	public FlyObject(String path, int x, int y, int width, int height){
		this.img = ImageUtil.getImage(path);
		this.x=x;
		this.y=y;
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}

	public void draw(Graphics g) {
		g.drawImage(img, x, y, null);
	}

}
