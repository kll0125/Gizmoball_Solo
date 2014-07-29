package model.gizmos;

import java.awt.Color;
import java.util.List;

import model.physicsMIT.Vect;
import model.GizmoTypes;
import model.IGizmo;
import model.physicsMIT.LineSegment;

/*********************************
 * this is class is primarily so that I can keep all common factors about the
 * gizmos in one place.
 *********************************/

public class Gizmos implements IGizmo {

	protected int xpos;
	protected int ypos;
	protected static int width;
	protected static int height;
	public LineSegment ls;
	protected GizmoTypes type;

	protected Gizmos(int X, int Y, int W, int H) {
		xpos = X;
		ypos = Y;
		height = H;
		width = W;
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
	
	@Override
	public GizmoTypes getType() {
		// TODO Auto-generated method stub
		return type;
	}
	
	public LineSegment getLineSeg() {
		return ls;
	}
	

} // end of class
