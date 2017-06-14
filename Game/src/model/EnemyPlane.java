package model;

import java.awt.Graphics;

import util.Constants;

public class EnemyPlane extends FlyObject {
	public void draw(Graphics g) {
		if(isLive==true){
			g.drawImage(img, x, y, width, height, null);
		}
//		move();
	}

	public EnemyPlane(String path, int x, int y, int width, int height) {
		super(path, x, y, width, height);
		this.width =width;
		this.height =height;
	}

	private void move() {
		this.y += Constants.PLANE_SPEED;
	}

}
