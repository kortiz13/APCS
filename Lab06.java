import java.awt.*;
import java.applet.*;
import java.util.*; 
// Program that creates a groups of random graphics and colors located in specific grids																
public class Lab06 extends Applet
{
	public void paint(Graphics g) 	
	{
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);
	
		// Draw Random Lines
		for (int k = 1; k <= 100; k++)
		{
			int c1 = (int)(Math.random() *(255));
			int c2 = (int)(Math.random() *(255));
			int c3 = (int)(Math.random() *(255));
			int x1 = (int)(Math.random() *(350))+10;
			int y1 = (int)(Math.random() *(250))+10;
			int x2 = (int)(Math.random() *(380))+20;
			int y2 = (int)(Math.random() *(280))+15;
			g.setColor(new Color(c1,c2,c3));
			g.drawLine(x1,y1,x2,y2);
		}

		// Draw Random Squares

		for(int x = 1; x <=100 ; x++)
		{
			int c1 = (int)(Math.random() *(255));
			int c2 = (int)(Math.random() *(255));
			int c3 = (int)(Math.random() *(255));
			int x1 = (int)(Math.random() *(340))+400;
			int y1 = (int)(Math.random() *(240))+10;
			g.setColor(new Color(c1, c2, c3));
			//Squares are 50x50 pixels, and squares are given random starting points
			g.fillRect(x1, y1, 50, 50);
			
		}
		
		//Draw Circles
		for(int x = 1; x <= 100; x++)
		{
			int c1 = (int)(Math.random() *(255));
			int c2 = (int)(Math.random() *(255));
			int c3 = (int)(Math.random() *(255));
			int sz = (int)(Math.random() * 200);
			int x1 = (int)(Math.random() *(200)+9);
			int y1 = (int)(Math.random() *(90)+300);
			
			g.setColor(new Color(c1,c2,c3));
			g.drawOval(x1, y1, sz, sz);
		}

		// Draw 3-D Box
		Polygon penta = new Polygon();
		penta.addPoint(675+35,425); //top right corner
		penta.addPoint(625-35,425); //top left
		penta.addPoint(625-35,425+100);
		penta.addPoint(675+35,425+100);
		Polygon penta1 = new Polygon();
		penta1.addPoint(710,425);
		penta1.addPoint(((700-600)*6)+65,375);
		penta1.addPoint(((700-600)*6)+65,425);
		Polygon penta2 = new Polygon();
		penta2.addPoint(((700-600)*6)+65,375);
		penta2.addPoint(((700-600)*6)+65,425);
		penta2.addPoint(625-35,425);
		penta2.addPoint(((700-600)*6)-55,375);
		Polygon penta3 = new Polygon();
		penta3.addPoint(((700-600)*6)-55,375);
		penta3.addPoint((625-25)-10,425);
		penta3.addPoint((625-25)-10,425+100);
		penta3.addPoint(((700-600)*6)-55,475);
		g.setColor(Color.green);
		g.fillPolygon(penta3);
		g.setColor(Color.yellow);
		g.fillPolygon(penta2);
		g.setColor(new Color(0,0,250));
		g.fillPolygon(penta1);
		g.setColor(new Color(250,0,0));
		g.fillPolygon(penta);
	
	}
}
