package model.gizmos;

import java.awt.Color;

import model.GizmoTypes;

public class SquareGizmo extends BumpersGizmo {

	// size is 1 by 1 
	public SquareGizmo(int x, int y) {
		super(x, y, 1, 1);
		
		colour = Color.GREEN;
	}

	public GizmoTypes getType() {
		return GizmoTypes.SquareGizmo;
	}
	
	public Color colour(){
		return colour;
		
	}
	
} //end of class
