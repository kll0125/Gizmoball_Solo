package model.gizmos;

import java.awt.Color;

import model.GizmoTypes;
import model.IGizmo;

public class CircleGizmo extends BumpersGizmo implements IGizmo {
	
	private Color colour;

	public CircleGizmo(int x, int y) {
		super(x, y, 1, 1);
		colour = Color.BLUE;
	}

	public GizmoTypes getType() {
		return GizmoTypes.CircleGizmo;
	}
	
	public Color colour(){
		return colour;
		
	}

} // end of class
