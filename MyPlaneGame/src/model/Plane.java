package model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

import util.Constants;
import util.Direction;
import util.ImageUtil;

public class Plane {

	Image img;
	int x, y;
	int width, height;

	Direction dir = null;
	boolean up = false;
	boolean down = false;
	boolean left = false;
	boolean right = false;

	public void draw(Graphics g) {
		g.drawImage(img, x, y, null);
		move();

	}

	public Plane(String path, int x, int y, int width, int height) {
		this.img = ImageUtil.getZoomImage(path, width, height);
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
		this.x = x - width / 2;
		this.y = y - height / 2;

	}

	public void move() {

		if (left) {
			this.x -= Constants.PLANE_SPEED;
		}
		if (right) {
			this.x += Constants.PLANE_SPEED;
		}
		if (up) {
			this.y -= Constants.PLANE_SPEED;
		}
		if (down) {
			this.y += Constants.PLANE_SPEED;
		}
		// 让飞机不要超出边界
		if (y >= Constants.FRAME_HEIGHT - height) {
			y = Constants.FRAME_HEIGHT - height;
		}
		if (x >= Constants.FRAME_WIDTH - width) {
			x = Constants.FRAME_WIDTH - width;
		}
		if (y <= 20) {
			y = 20;
		}
		if (x <= 0) {
			x = 0;
		}

	}

	public void addDirection(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = true;
			break;
		case KeyEvent.VK_UP:
			up = true;
			break;
		case KeyEvent.VK_RIGHT:
			right = true;
			break;
		case KeyEvent.VK_DOWN:
			down = true;
			break;
		default:
			break;
		}
	}

	public void minusDirection(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = false;
			break;
		case KeyEvent.VK_UP:
			up = false;
			break;
		case KeyEvent.VK_RIGHT:
			right = false;
			break;
		case KeyEvent.VK_DOWN:
			down = false;
			break;
		default:
			break;
		}
	}
}
