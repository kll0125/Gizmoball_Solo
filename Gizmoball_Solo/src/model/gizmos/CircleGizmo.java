package model.gizmos;

import java.awt.Color;

import model.GizmoTypes;
import model.IGizmo;
import model.physicsMIT.Circle;

public class CircleGizmo extends BumpersGizmo implements IGizmo {
	
/*	private Color colour;
	private double radius;

	public CircleGizmo(int x, int y) {
		xPos = x; // Centre coordinates
		yPos = y;
		colour = Color.BLUE;
		radius = 12;
		
	}

	public GizmoTypes getType() {
		return GizmoTypes.CircleGizmo;
	}
	
	public Color colour(){
		return colour;
	}
	
	public Circle getCircle() {
		return new Circle(xPos, yPos, radius);
	}

	public double getRadius() {
		// TODO Auto-generated method stub
		return radius;
	}*/

	
	public CircleGizmo(int x, int y) {
		super(x, y, 1, 1);
	}

	public GizmoTypes getType() {
		return GizmoTypes.CircleGizmo;
	}

	
	
} // end of class
