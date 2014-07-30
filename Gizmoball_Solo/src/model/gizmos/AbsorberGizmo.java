package model.gizmos;

import java.awt.Color;



import java.awt.Graphics;

import model.physicsMIT.LineSegment;

public class AbsorberGizmo extends Gizmos {

	LineSegment abg;
	private int width;
	private int height;
	private Color colour;


	public AbsorberGizmo(int x, int y) {
		super(x,y, 0, 0);
		height = 20;
		width = 30;
		colour = Color.RED;
		createBox();
		
	}


	public void createBox() {
		// TODO Auto-generated method stub
		abg = new LineSegment(1, (int) height, 2 * width, height);
	}

	public Color getColour() {
		// TODO Auto-generated method stub
		return colour;
	}


} // end of class
