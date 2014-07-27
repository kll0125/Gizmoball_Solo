package model.gizmos;

import java.awt.Color;

import model.GizmoTypes;
import model.IGizmo;
import model.physicsMIT.LineSegment;

/*********************************
 * this is class is primarily so that I can keep all common factors about the
 * gizmos in one place.
 *********************************/

public class Gizmos implements IGizmo {

	public Gizmos(){ }
	protected int xpos;
	protected int ypos;
	protected int width;
	protected int height;
	public LineSegment ls;

	protected Gizmos(int x, int y, int w, int h) {
		xpos = x;
		ypos = y;
		height = h;
		width = w;
	}

	@Override
	public GizmoTypes getType() {
		// TODO Auto-generated method stub
		return getType();
	}

	@Override
	public int getXpos() {
		// TODO Auto-generated method stub
		return xpos;
	}

	@Override
	public int getYpos() {
		// TODO Auto-generated method stub
		return ypos;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return width;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return height;
	}

	@Override
	public Color colour() {
		// TODO Auto-generated method stub
		return colour();
	}
	
	public LineSegment getLineSeg() {
		return ls;
	}

} // end of class
