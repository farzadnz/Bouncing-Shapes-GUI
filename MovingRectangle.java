/*
 *  ===============================================================================
 *  Author: Farzad Khaleghi
 *  
 *  A shape that is a rectangle.
 *  A rectangle has 4 handles shown when it is selected (by clicking on it).
 *  ===============================================================================
 */


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class MovingRectangle extends MovingShape {
	
	public MovingRectangle(){
		super();
	}
	
	public MovingRectangle(int x, int y, int width, int height, int marginW, int marginH, Color borderC, Color fillC, int pathType) {
		super(x, y, width, height, marginW, marginH, borderC, fillC, pathType);
		
	}
	
	public void draw(Graphics r) {
		Graphics2D r2d = (Graphics2D) r;
		r.setColor(fillColor);
		r.fillRect(topLeft.x, topLeft.y, width, height);
		r.setColor(borderColor);
		r.drawRect(topLeft.x, topLeft.y, width, height);
		drawHandles(r);
	}

	public boolean contains(Point mousePt) {
		Point EndPt = new Point(topLeft.x + width, topLeft.y + height);
		return mousePt.x > topLeft.x && mousePt.x < EndPt.x && mousePt.y > topLeft.y && mousePt.y < EndPt.y;
	}

}
