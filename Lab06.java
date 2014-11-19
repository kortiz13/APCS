import java.awt.*;
import java.applet.*;
import java.util.*; 
// Program that creates a groups of randadom graphics and colors located in specific grids																
public class lab06 extends Applet
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
			int x1 = (int)(Math.random() *(400))+15;
			int y1 = (int)(Math.random() *(300))+10;
			int x2 = (int)(Math.random() *(400))+20;
			int y2 = (int)(Math.random() *(300))+15;
			g.setColor(new Color(c1,c2,c3));
			g.drawLine(x1,y1,x2,y2);
		}

				
		
		// Draw Random Squares




		
		// Draw Random Circles




		
		// Draw 3-D Box
	
	
	}
		
}
