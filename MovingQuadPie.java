/*
 *  ===============================================================================
 *  Author: Farzad Khaleghi
 *  
 *  A shape that is a quad pie.
 *  A quad pie has 4 handles shown when it is selected (by clicking on it).  
 *  ===============================================================================
 */



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MovingQuadPie extends MovingOval {
	
	
	public MovingQuadPie() {
		super();
	}
	
	public MovingQuadPie(int x, int y, int width, int height, int marginW, int marginH, Color borderC, Color fillC, int pathType) {
		super(x, y, Math.min(width, height), Math.min(width, height), marginW, marginH, borderC, fillC, pathType);
		
	}
	
	public void setWidth(int w) { 
		super.setHeight(w);
		super.setWidth(w); 

	}
	
	
    public void setHeight(int h) {
    	super.setHeight(h);
    	super.setWidth(h); 

	}
    
    public void draw(Graphics q) {
    	Graphics2D q2d = (Graphics2D) q;
    	int minVal = Math.min(width, height);
    	int borderT = minVal - minVal/5*4;
    	q.setColor(borderColor);
		q.fillOval(topLeft.x, topLeft.y, minVal, minVal);
		q.drawOval(topLeft.x, topLeft.y, minVal, minVal);
		q.setColor(fillColor);
		q.fillOval(topLeft.x + borderT/2, topLeft.y + borderT/2, minVal/5*4, minVal/5*4);
		q.drawOval(topLeft.x + borderT/2, topLeft.y + borderT/2, minVal/5*4, minVal/5*4);
		q.setColor(Color.white);
		q.fillArc(topLeft.x + borderT/2, topLeft.y + borderT/2, minVal/5*4, minVal/5*4, 90, 90);
		q.drawArc(topLeft.x + borderT/2, topLeft.y + borderT/2, minVal/5*4, minVal/5*4, 90, 90);
		q.fillArc(topLeft.x + borderT/2, topLeft.y + borderT/2, minVal/5*4, minVal/5*4, 270, 90);
		q.drawArc(topLeft.x + borderT/2, topLeft.y + borderT/2, minVal/5*4, minVal/5*4, 270, 90);
		drawHandles(q);
		
    }

}
