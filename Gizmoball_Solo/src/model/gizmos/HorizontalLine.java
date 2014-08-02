package model.gizmos;

import model.physicsMIT.LineSegment;

/**
 * @author Nadey Ali Demonstration of MVC and MIT Physics Collisions 2014
 */

public class HorizontalLine {

	private int xpos;
	private int ypos;
	private int height;
	private LineSegment ls;
	
	public HorizontalLine(int x, int y, int h) {
		xpos = x;
		ypos = y;
		height = h;
		ls = new LineSegment(x, y, y + h, x);
	}
	
	public LineSegment getLineSeg() {
		return ls;
	}

	public int getX() {
		return xpos;
	}

	public int getY() {
		return ypos;
	}
	
	public int getHeight() {
		return height;
	}
	
} // end of class
