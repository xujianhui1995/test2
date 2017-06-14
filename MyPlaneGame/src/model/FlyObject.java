package model;

import java.awt.Image;
import java.awt.Rectangle;

import util.ImageUtil;

public class FlyObject {

	public Image img;
	public int x;
	public int y;
	public int width, height;
	public boolean isLive = true;
	public int flag = 0;
	
	public boolean isLive() {
		return isLive;
	}

	public void setLive(boolean isLive) {
		this.isLive = isLive;
	}

	public FlyObject() {
	}

	public FlyObject(String path, int x, int y, int width, int height) {
		this.img = ImageUtil.getImage(path);
		this.x = x;
		this.y = y;
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}

	public Rectangle getSize() {
		return new Rectangle(x, y, width, height);
	}

	public boolean isIntersected(FlyObject object) {
		if (this.getSize().intersects(object.getSize())) {
			 this.setLive(false);
			 object.setLive(false);
			return true;
		}
		return false;
	}

}
