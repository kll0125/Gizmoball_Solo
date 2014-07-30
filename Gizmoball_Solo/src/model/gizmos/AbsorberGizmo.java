package model.gizmos;

import java.awt.Color;



import java.awt.Graphics;

import org.w3c.dom.css.Rect;

import model.physicsMIT.Circle;
import model.physicsMIT.LineSegment;

public class AbsorberGizmo {

	LineSegment abg;
	private int width;
	private int height;
	private int xPos, yPos;
	private Color colour;


	public AbsorberGizmo(int x, int y) {
		height = 20;
		width = 30;
		yPos = y;
		xPos = x;
		colour = Color.RED;
		createBox();
	}


	public LineSegment createBox() {
		// TODO Auto-generated method stub
		return abg = new LineSegment(1, (int) height, 2 * width, height);
	}

	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setExactX(int x) {
		xPos = x;
	}

	public void setExactY(int y) {
		yPos = y;
	}


	public LineSegment getAbsorber() {
		return new LineSegment(xPos, yPos, width,height);
	}
	
	public Color getColour() {
		return colour;
	}

	public double getExactX() {
		return xPos;
	}

	public double getExactY() {
		return yPos;
	}

} // end of class
