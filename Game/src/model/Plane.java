package model;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import util.Constants;

public class Plane extends FlyObject {

	boolean up = false;
	boolean down = false;
	boolean left = false;
	boolean right = false;
	boolean fire;
	List<Bullet> bulletlist = new ArrayList<Bullet>();

	public List<Bullet> getBulletlist() {
		return bulletlist;
	}

	public void setBulletlist(List<Bullet> bulletlist) {
		this.bulletlist = bulletlist;
	}

	public void draw(Graphics g) {
		if (isLive == true) {
			g.drawImage(img, x, y, width, height, null);
			move();
			fire(g);  
		}

	}

	public Plane(String path, int x, int y, int width, int height) {
		super(path, x, y, width, height);
		this.x = x - width / 2;
		this.y = y - height / 2;
		this.width = Constants.PLANE_SIZE;
		this.height = Constants.PLANE_SIZE;
	}

	public void fire(Graphics g) {
		for (Bullet bullet : bulletlist) {
			bullet.drawBullet(g);
		}
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
		case KeyEvent.VK_SPACE:
			Bullet b = new Bullet("images/MyBullet.png", (int) (x + 0.5 * width), y, 0, 0);
			bulletlist.add(b);
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
		case KeyEvent.VK_SPACE:
			fire = false;
			break;
		default:
			break;
		}
	}
}
