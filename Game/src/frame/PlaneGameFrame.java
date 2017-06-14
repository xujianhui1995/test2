package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;

import model.Plane;
import util.Constants;

public class PlaneGameFrame extends MyFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Plane p = new Plane("images/LXPlane.png", Constants.PLANE_X, Constants.PLANE_Y, Constants.PLANE_SIZE, Constants.PLANE_SIZE);

	
	public void printInfo(Graphics g,String str,int size,int x,int y,Color color){

		g.drawString(str,x,y);

	}
	
	
	public static void main(String[] args) {
		new PlaneGameFrame().launchFrame();
	}
	
	
	public void launchFrame(){
		super.LaunchFrame();
		addKeyListener(new KeyMonitor());
		
		
	}	
	
	class KeyMonitor extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
//			System.out.println("���£�"+e.getKeyCode());
			p.addDirection(e);
		}
		@Override
		public void keyReleased(KeyEvent e) {
			p.minusDirection(e);
		}
		
	}
	
	
	
}
