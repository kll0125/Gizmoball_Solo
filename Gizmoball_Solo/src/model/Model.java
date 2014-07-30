package model;

import java.util.ArrayList;
import java.util.Observable;

import model.gizmos.AbsorberGizmo;
import model.gizmos.CircleGizmo;
import model.gizmos.Gizmos;
import model.gizmos.HorizontalLine;
import model.gizmos.VerticalLine;
import model.gizmos.Walls;
import model.physicsMIT.Circle;
import model.physicsMIT.Geometry;
import model.physicsMIT.LineSegment;
import model.physicsMIT.Vect;

/**
 * @author Murray Wood Demonstration of MVC and MIT Physics Collisions 2014
 */

public class Model extends Observable {

	private ArrayList<VerticalLine> lines;
	private ArrayList<HorizontalLine> Hlines;
	private ArrayList<Gizmos> giz;
	private AbsorberGizmo abg;
	private CircleGizmo cg;
	private Ball ball;
	private Walls gws;

	public Model() {

		// Ball position (25, 25) in pixels. Ball velocity (100, 100) pixels per
		// tick
		ball = new Ball(19, 19, 10, 10);

		// remove later
		cg = new CircleGizmo(90, 90);

		// remove later
		abg = new AbsorberGizmo(500, 100);

		// Wall size 500 x 500 pixels
		gws = new Walls(0, 0, 500, 500);

		// Lines added in Main
		lines = new ArrayList<VerticalLine>();

		// Hline to add in main
		Hlines = new ArrayList<HorizontalLine>();

		// adds Gizmos to arrayList
	}

	public void moveBall() {

		double moveTime = 0.05; // 0.05 = 20 times per second as per Gizmoball

		if (ball != null && !ball.stopped()) {

			CollisionDetails cd = timeUntilCollision();
			double tuc = cd.getTuc();
			if (tuc > moveTime) {
				// No collision ...
				ball = movelBallForTime(ball, moveTime);
			} else {
				// We've got a collision in tuc
				ball = movelBallForTime(ball, tuc);
				// Post collision velocity ...
				ball.setVelo(cd.getVelo());
			}

			// Notify observers ... redraw updated view
			this.setChanged();
			this.notifyObservers();
		}

	}

	private Ball movelBallForTime(Ball ball, double time) {

		double newX = 0.0;
		double newY = 0.0;
		double xVel = ball.getVelo().x();
		double yVel = ball.getVelo().y();
		newX = ball.getExactX() + (xVel * time);
		newY = ball.getExactY() + (yVel * time);
		ball.setExactX(newX);
		ball.setExactY(newY);
		return ball;
	}

	private CollisionDetails timeUntilCollision() {
		// Find Time Until Collision and also, if there is a collision, the new
		// speed vector.
		// Create a physics.Circle from Ball
		Circle ballCircle = ball.getCircle();
		Vect ballVelocity = ball.getVelo();
		Vect newVelo = new Vect(1, 1);

		// create a new circle
		Circle CircleGizmo = cg.getCircle();

		// Now find shortest time to hit a vertical line or a wall line
		double shortestTime = Double.MAX_VALUE;
		double time = 0.0;

		// Time to collide with 4 walls
		ArrayList<LineSegment> lss = gws.getLineSegments();
		for (LineSegment line : lss) {
			time = Geometry.timeUntilWallCollision(line, ballCircle,
					ballVelocity);

			time = Geometry.timeUntilCircleCollision(CircleGizmo, ballCircle,
					ballVelocity);

			if (time < shortestTime) {
				shortestTime = time;
				newVelo = Geometry.reflectWall(line, ball.getVelo(), 1.0);
			}
			/*
			 * //unsure of this time =
			 * Geometry.timeUntilCircleCollision(CircleGizmo, ballCircle,
			 * ballVelocity);
			 * 
			 * newVelo = Geometry.reflectCircle(ballVelocity, ball.getVelo(),
			 * newVelo, 0.5);
			 */

		} // end of for

		return new CollisionDetails(shortestTime, newVelo);
	} // end of timeUntilCollision()

	public Ball getBall() {
		return ball;
	}

	// remove later
	public CircleGizmo getCircle() {
		return cg;
	}

	// remove later
	public AbsorberGizmo getAbsorber() {
		return abg;

	}

	// ////////////////////////////////////
	public ArrayList<Gizmos> getGizmos() {
		return giz;
	}

	public void addGizmos(Gizmos gg) {
		giz.add(gg);
	}

	// ///////////////////////////////////////

	public ArrayList<HorizontalLine> gethLines() {

		return Hlines;
	}

	public void addHLine(HorizontalLine hl) {

		Hlines.add(hl);
	}

	public ArrayList<VerticalLine> getLines() {
		return lines;
	}

	public void addLine(VerticalLine l) {
		lines.add(l);
	}

	public void setBallSpeed(int x, int y) {
		ball.setVelo(new Vect(x, y));
	}

} // end of class
