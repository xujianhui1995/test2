package model;

import java.awt.Graphics;
import java.awt.Image;

import util.ImageUtil;

/*
 * 爆炸类
 */
public class Explode{
	int x,y;
	static Image[] imgs = new Image[16];
	static {
		for(int i=0;i<16;i++){
			imgs[i] = ImageUtil.getImage("images/e"+(i+1)+".gif");
			imgs[i].getWidth(null);
		}
	}
	
	int count=0;
	
	public void draw(Graphics g){
		if(count<=15){
			g.drawImage(imgs[count], (int)x, (int)y, null);
			count++;
		}else{
			count=0;
		}
	}
	
	public Explode(int x,int y){
		this.x = x;
		this.y = y;
	}

	

}
