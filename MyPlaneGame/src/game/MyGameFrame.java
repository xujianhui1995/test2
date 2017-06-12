package game;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import frame.MyFrame;
import model.BackGround;
import model.Plane;
import model.Stars;
import util.Constants;

public class MyGameFrame extends MyFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Stars sun = new Stars("images/sun.png", Constants.FRAME_WIDTH / 2, Constants.FRAME_HEIGHT / 2);
	Plane p = new Plane("images/LXPlane.png", Constants.PLANE_X, Constants.PLANE_Y, Constants.PLANE_SIZE,
			Constants.PLANE_SIZE);

	public void paint(Graphics g) {
		BackGround.drawMe(g);
		sun.draw(g);
		p.draw(g);
	}

	public static void main(String[] args) {
		new MyGameFrame().launchFrame();
	}

	public void launchFrame() {
		super.LaunchFrame();
		// 增加键盘的监听
		addKeyListener(new KeyMonitor());
	}

	// 定义为内部类，可以方便的使用外部类的普通属性
	class KeyMonitor extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			// System.out.println("按下："+e.getKeyCode());
			p.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			p.minusDirection(e);
		}
	}

}
