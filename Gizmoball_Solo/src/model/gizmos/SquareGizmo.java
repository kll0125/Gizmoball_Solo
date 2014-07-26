package model.gizmos;


import java.awt.Color;
import java.awt.Graphics;

import model.physicsMIT.LineSegment;

public class SquareGizmo extends Gizmos {
	private final int L = GizmoL();
	
	private Color colour;
	// line segment used to create the square
	LineSegment squareLines[] = new LineSegment[4];
	
	public SquareGizmo(int x, int y) {
		super(x,y);
		setBoundaryBox();
	}
	private void setBoundaryBox() {
		// TODO Auto-generated method stub
		squareLines[0] = new LineSegment(x, y, x + L, y);
	}
	
	// this should work but wont know until its drawn on the board
	public Graphics paint(Graphics g){
		g.setColor(colour);
		colour = Color.GREEN;
		g.fillRect((int) x, (int) y, width, height);
		return g;
	}

	
	
}  // end of class

