package model;


import java.awt.Graphics;
import java.awt.Image;
import util.Constants;
import util.ImageUtil;

public class BackGround {
	static int x=0;
	static int y=0;
	static int y1=Constants.FRAME_HEIGHT;
	static Image bgImage = ImageUtil.getImage("images/bg.jpg");
	
	public static void drawMe(Graphics g){
		g.drawImage(bgImage,x, y, Constants.FRAME_WIDTH,Constants.FRAME_HEIGHT,  null);
		g.drawImage(bgImage, x, y1, Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT, null);
		move();
	}
	public static void move(){
		y+=Constants.BG_MOVE;
		y1+=Constants.BG_MOVE;
		if(y>Constants.FRAME_HEIGHT){
			y=y1-Constants.FRAME_HEIGHT;
		}else if(y1>Constants.FRAME_HEIGHT){
			y1=y-Constants.FRAME_HEIGHT;
		}
	}
}

