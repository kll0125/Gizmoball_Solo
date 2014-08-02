package model;

import java.util.ArrayList;
import java.util.Observable;

import model.gizmos.AbsorberGizmo;
import model.gizmos.Gizmos;
import model.gizmos.HorizontalLine;
import model.gizmos.VerticalLine;
import model.gizmos.Walls;
import model.physicsMIT.Circle;
import model.physicsMIT.Geometry;
import model.physicsMIT.LineSegment;
import model.physicsMIT.Vect;

/**
 * @author Nadey Ali
 */

public class Model extends Observable {

	private ArrayList<VerticalLine> lines;
	private ArrayList<HorizontalLine> Hlines; // horizontal lines
	private ArrayList<Gizmos> giz; // gizmos
	private ArrayList <AbsorberGizmo>abg; // absorber
	private Ball ball;
	private Walls gws;

	public Model() {

		// Ball position (25, 25) in pixels. Ball velocity (100, 100) pixels per
		// tick
		ball = new Ball(25, 25, 100, 100);

		// Wall size 500 x 500 pixels
		gws = new Walls(0, 0, 500, 500);
		
		//absorber
		abg = new ArrayList<AbsorberGizmo>();

		// Lines added in Main
		lines = new ArrayList<VerticalLine>();

		// Hline to add in main
		Hlines = new ArrayList<HorizontalLine>();

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

		// Now find shortest time to hit a vertical line or a wall line
		double shortestTime = Double.MAX_VALUE;
		double time = 0.0;

		// Time to collide with 4 walls
		ArrayList<LineSegment> lss = gws.getLineSegments();
		for (LineSegment line : lss) {
			time = Geometry.timeUntilWallCollision(line, ballCircle,
					ballVelocity);

			if (time < shortestTime) {
				shortestTime = time;
				newVelo = Geometry.reflectWall(line, ball.getVelo(), 1.0);
			}

		} // end of for
		// Collision detection for gizmos here
		//absorber collision
		for(AbsorberGizmo line : abg){
			ArrayList<LineSegment> als = line.getLineSeg();
			//time = Geometry.timeUntilWallCollision(line,ball,ballVelocity);
			
		}// end of for

		return new CollisionDetails(shortestTime, newVelo);
	} // end of timeUntilCollision()

	public Ball getBall() {
		return ball;
	}

	///////////////
	public ArrayList<AbsorberGizmo> getAbsorber() {
		return abg;
	}
	///////////////

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

	public ArrayList<Gizmos> getGiz() {
		return giz;
	}

	public void setGiz(ArrayList<Gizmos> giz) {
		this.giz = giz;
	}

} // end of class
