import java.awt.*;
import java.util.*;
public class PrintDots{
	public static void main(String[] args){
		DrawingPanel panel = new DrawingPanel(514, 514);
		Graphics g = panel.getGraphics();
		try {
			Thread.sleep(6000); //to be able to record from start
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawOval(0, 0, 512,512);			
		for(float r = 0; r<=256; r+=1){ //increase r
			for(float theta = 0; theta<=360; theta+=.4){ //for a set r, draw a single dot, of radius 1 px, with color scheme HSB at location using sin and cos
				g.setColor(Color.getHSBColor((float)(theta/360), r/256, 1));
				g.drawOval((int)(256+r*Math.cos(theta*Math.PI/180)), 256+(int)(r*Math.sin(theta*Math.PI/180)), 1,1);
			}
		}

	}
}