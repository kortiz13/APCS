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
			int x1 = (int)(Math.random() *(200)+9); //200
			int y1 = (int)(Math.random() *(90)+300); //250
			
			g.setColor(new Color(c1,c2,c3));
			g.drawOval(x1, y1, sz, sz);
		}

		// Draw 3-D Box
		Polygon penta = new Polygon();
		penta.addPoint(456,506); //626
		penta.addPoint(326,506); //756
		penta.addPoint(466,456);
		penta.addPoint(396,456);
		
		g.setColor(new Color(250,0,0));
		g.fillPolygon(penta);
	
	}
}
