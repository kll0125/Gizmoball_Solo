package model.gizmos;

import java.awt.Color;

public class BumpersGizmo extends Gizmos {

	// gets from Gizmos
	// needs to have the x ,y position
	// needs width and height of gizmo
	public BumpersGizmo() {
	}

	public BumpersGizmo(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
	

	@Override
	public Color colour() {
		// TODO Auto-generated method stub
		return colour;
	}
} // end of bumpersGiz
