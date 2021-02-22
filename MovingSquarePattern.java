/*
 *  ===============================================================================
 *  Author: Farzad Khaleghi
 *  
 *  A shape that is a square pattern.
 *  A square pattern has 4 handles shown when it is selected (by clicking on it).
 *  ===============================================================================
 */

import java.awt.Color;
import java.awt.*;

public class MovingSquarePattern extends MovingSquare {
	
	public MovingSquarePattern(){
		super();
	}
	
	public MovingSquarePattern(int x, int y, int width, int height, int marginW, int marginH, Color borderC, Color fillC, int pathType) {
		super(x, y, Math.min(width, height), Math.min(width, height), marginW, marginH, borderC, fillC, pathType);

	}
	
	public void draw(Graphics sp) {
		Graphics2D sp2d = (Graphics2D) sp;
		sp.setColor(fillColor);
		sp.drawRect(topLeft.x, topLeft.y, width, height);
		int size = 0;
		for (int i = 0; i<10; i++) {
			size += width/10;
			sp.setColor(fillColor);
			sp.drawLine(topLeft.x, topLeft.y+ size, topLeft.x+ size, topLeft.y+height);
			sp.drawLine(topLeft.x+size, topLeft.y, topLeft.x+width, topLeft.y+ size);
		}
		drawHandles(sp);
	}
		
		
}
