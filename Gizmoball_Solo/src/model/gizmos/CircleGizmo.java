package model.gizmos;

import java.awt.Color;

import model.physicsMIT.Circle;

public class CircleGizmo {

	private double radius;
	private double xpos;
	private double ypos;
	private Color colour;
	
	public CircleGizmo( double x , double y){
		xpos = x; // Centre coordinates
		ypos = y;
		colour = Color.GREEN;
		radius = 15;
	}
	
	
	public double getRadius() {
		return radius;
	}
	
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


	public Circle getCircle() {
		return new Circle(xpos, ypos, radius);

	}
	
	public Color getColour() {
		return colour;
	}
	
} // end of class
