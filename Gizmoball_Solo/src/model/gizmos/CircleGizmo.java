package model.gizmos;

import java.awt.Color;

import model.physicsMIT.Circle;

public class CircleGizmo {

	private double radius;
	private double xpos;
	private double ypos;
	private Color colour;

	// x, y coordinates, radius and colour
	public CircleGizmo(double x, double y) {
		xpos = x; // Centre coordinates
		ypos = y;
		colour = Color.RED;
		radius = 10;
	}

	public double getRadius() {
		return radius;
	}

	public Circle getCircle() {
		return new Circle(xpos, ypos, radius);

	}

	// specific methods that deal with double precision.
	public double getExactX() {
		return xpos;
	}

	public double getExactY() {
		return ypos;
	}

	public void setExactX(double x) {
		xpos = x;
	}

	public void setExactY(double y) {
		ypos = y;
	}

	public Color getColour() {
		return colour;
	}

} // end of class
