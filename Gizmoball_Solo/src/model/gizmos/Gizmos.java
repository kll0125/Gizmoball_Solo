package model.gizmos;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import model.GizmoTypes;
import model.IGizmo;

public class Gizmos {

	/*********************************
	 *  this is class is primarily so that I can keep all common factors about the 
	 *  gizmos in one place. 
	 * */
	

	protected static final int PIXELS = Board.PIXELSPERL;
	protected static final Color SQUARECOLOR = Board.SQUARECOLOR;
	protected static final Color CIRCLECOLOR = Board.CIRCLECOLOR;
	protected static final Color ABSORBERCOLOR = Board.ABSORBERCOLOR;

	protected Board gb;
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	private int boxSize = 1;

	public Gizmos(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidthInL() {
		return width;
	}

	public int getHeightInL() {
		return height;
	}

	public  void paint(Graphics2D g){};
	
	public Rectangle boundingBox() {
	    return new Rectangle(x, y, width*PIXELS, height*PIXELS);
	  }
	
	public int GizmoL() {
		return 30;
	}
	
} // end of class
