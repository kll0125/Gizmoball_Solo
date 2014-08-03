package model;

import java.awt.Color;

import model.physicsMIT.Circle;
import model.physicsMIT.Vect;

/**
 * @author Nadey Ali
 */

public class Ball {

	private Vect velocity;
	private double radius;
	private double xpos;
	private double ypos;
	private Color colour;
	private boolean stopped;
	private boolean captured;

	// x, y coordinates and x,y velocity
	public Ball(double x, double y, double xv, double yv) {
		this.xpos = x; // Centre coordinates
		this.ypos = y;
		this.colour = Color.MAGENTA;
		this.velocity = new Vect(xv, yv);
		this.radius = 10;
		this.stopped = false;
		this.captured = false;
	}

	public Vect getVelo() {
		return velocity;
	}

	public void setVelo(Vect v) {
		velocity = v;
	}

	public double getRadius() {
		return radius;
	}

	public Circle getCircle() {
		return new Circle(xpos, ypos, radius);

	}

	// Ball specific methods that deal with double precision.
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

	public void stop() {
		stopped = true;
	}

	public void start() {
		stopped = false;
	}

	public boolean stopped() {
		return stopped;
	}

	public Color getColour() {
		return colour;
	}
	
	
	
//////////////
	public void iscapture() {
		this.velocity = null;
		this.captured = true;
	}
	
	public boolean getIsCaptured() {

		return captured;
	}
//////////////
	public Object newTask(double tempTime) {
		// TODO Auto-generated method stub
		return null;
	}

}
