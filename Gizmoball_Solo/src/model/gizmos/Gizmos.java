package model.gizmos;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import model.physicsMIT.Vect;
import model.GizmoTypes;
import model.IGizmo;
import model.physicsMIT.LineSegment;

/**
 * @author Nadey Ali
 */

/*********************************
 * This is class is primarily so that I can keep all common factors about the
 * gizmos in one place.
 *********************************/

public class Gizmos implements IGizmo {

	protected int xpos;
	protected int ypos;
	protected int width;
	protected int height;
	protected int radius;
	public Color colour;
	public ArrayList<LineSegment> lineSeg;
	public GizmoTypes type;

	public Gizmos(int X, int Y, int W, int H) {
		this.xpos = X;
		this.ypos = Y;
		this.height = H;
		this.width = W;
		//lineSeg  = new LineSegment(xpos, ypos, width, height);
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
	public Color getcolour() {
		// TODO Auto-generated method stub
		return colour;
	}

	@Override
	public GizmoTypes getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public ArrayList<LineSegment> getLineSeg() {
		
		return lineSeg;
	}

	@Override
	public int getRadius() {
		return radius;
	}

} // end of class
