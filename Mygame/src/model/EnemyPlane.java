package model;

import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import util.Constants;
import util.ImageUtil;

public class EnemyPlane {
	Image image;
	int x,y;
	int width,height;
	boolean up = false;
	public void draw(Graphics g) {
		g.drawImage(image, x, y, null);
		move();
	}	
	public EnemyPlane(String path, int x, int y, int width, int height) {
		this.image = ImageUtil.getZoomImage(path, width, height);
		this.width = image.getWidth(null);
		this.height = image.getHeight(null);
		this.x = x - width / 2;
		this.y = y - height / 2;

	}
private void move() {
		this.y += Constants.PLANE_SPEED;
	}
}
