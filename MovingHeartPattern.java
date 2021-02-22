/*
 *  ===============================================================================
 *  Author: Farzad Khaleghi
 *  
 *  A shape that is a heart.
 *  A heart has 4 handles shown when it is selected (by clicking on it).
 *  ===============================================================================
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MovingHeartPattern extends MovingSquare {
	
	public MovingHeartPattern() {
		super();
	}
	
	public MovingHeartPattern(int x, int y, int width, int height, int marginW, int marginH, Color borderC, Color fillC, int pathType) {
		super(x, y, Math.min(width, height), Math.min(width, height), marginW, marginH, borderC, fillC, pathType);
		
	}
	
    public void draw(Graphics h) {
		Graphics2D h2d = (Graphics2D) h;
		h.setColor(borderColor);
		
		h.drawLine(topLeft.x, topLeft.y + height/3, topLeft.x + width/2, topLeft.y + height);
		h.drawLine(topLeft.x + width, topLeft.y + height/3, topLeft.x + width/2, topLeft.y + height);
		
		h.drawArc(topLeft.x, topLeft.y + height/972, width/2, height/3*2, 0, 180);
		h.drawArc(topLeft.x + width/2, topLeft.y + height/972, width/2, height/3*2, 0, 180);
		
		h.setColor(fillColor);
		h.fillArc(topLeft.x, topLeft.y + height/972, width/2, height/3*2, 0, 180);
		h.fillArc(topLeft.x + width/2, topLeft.y + height/972, width/2, height/3*2, 0, 180);
		
		int xPoints[] = {topLeft.x, topLeft.x + width/2, topLeft.x + width};
		int yPoints[] = {topLeft.y + height/3, topLeft.y + height, topLeft.y + height/3};
		h.fillPolygon(xPoints, yPoints, 3);
	    
		drawHandles(h);
	}

}
