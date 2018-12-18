package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import org.omg.Messaging.SyncScopeHelper;

public class Platform{
	private int x;
	private double y;
	private double yspeed;
	private int width;
	private int height;
	private Rectangle cBox = new Rectangle();
	static double tempo = 1;
	int lastScore;
	static int finishPlat;
	public Platform(int x, int y, int w, int h, double yspeed){
		this.x = x;
		this.y = y;
		this.width = w;
		this.setHeight(h);
		this.yspeed = yspeed;
		cBox.setBounds(x, y, width, getHeight());
	}

	
	public void update(){
		cBox.setBounds(x, (int) y, width, getHeight());
		y = y - yspeed*tempo;
		
		System.out.println(Level2FinalGame.platform1.x);
		if(Level2FinalGame.platform1.y <= 0) {
			Level2FinalGame.platform1.y = 550;
		}
		if(Level2FinalGame.platform2.y <= 0) {
			Level2FinalGame.platform2.y = 550;
		}
		if(Level2FinalGame.platform3.y <= 0) {
			Level2FinalGame.platform3.y = 550;
		}
		if(Level2FinalGame.platform4.y <= 0) {
			Level2FinalGame.platform4.y = 550;
		}
		/*if(Level2FinalGame.score != lastScore && Level2FinalGame.score % 5 == 0) {
			//lastScore = Level2FinalGame.score;
			//Level2FinalGame.finish.height += 10;
			finishPlat = Level2FinalGame.finishY -= 10;
			System.out.println(Level2FinalGame.finish.x + "," + Level2FinalGame.finishY + "," + "350 ," + Level2FinalGame.finish.height);
		}*/
		if(Level2FinalGame.score > 5) {
			x = (int) (x - yspeed*tempo);
			if(x > Level2FinalGame.WIDTH || x > 0) {
				tempo = -tempo;
			}
		}
		
		
		}
	
	
	public void draw(Graphics g){
		g.setColor(Color.GREEN);
		g.fillRect(x, (int) y, width, getHeight());
		//g.fillRect(1600, finishPlat, 350, 75);
	
		
		
	}
	
	public Rectangle getCBox(){
		return cBox;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return (int) y;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}
}
