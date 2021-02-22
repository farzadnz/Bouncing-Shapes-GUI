/*
 *  ===============================================================================
 *  Author: Farzad Khaleghi
 *  
 *  creating a square shape with the given values
 *  ===============================================================================
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class MovingSquare extends MovingRectangle {

	
	public MovingSquare(){
		super();
	}
	
	public MovingSquare(int x, int y, int width, int height, int marginW, int marginH, Color borderC, Color fillC, int pathType) {
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
	
}
