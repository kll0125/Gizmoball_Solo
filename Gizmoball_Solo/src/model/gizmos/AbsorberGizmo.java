package model.gizmos;

import java.awt.Color;



import model.physicsMIT.LineSegment;

public class AbsorberGizmo extends Gizmos {

	LineSegment abg;
	int length = 30;
	private Color colour;


	public AbsorberGizmo(int x, int y, int w, int h) {
		super(x,y,w,h);
		colour = Color.RED;
		
	}


	public Color getColour() {
		// TODO Auto-generated method stub
		return colour;
	}


} // end of class
