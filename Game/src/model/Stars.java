package model;

import java.awt.Graphics;

public class Stars extends FlyObject{
	

	public void draw(Graphics g) {
		g.drawImage(img, x, y,width,height, null);

	}

	public Stars(String path, int x, int y, int width, int height) {
		super(path, x, y, width, height);
		this.x = x - width / 2;
		this.y = y - height / 2;
	}


}
