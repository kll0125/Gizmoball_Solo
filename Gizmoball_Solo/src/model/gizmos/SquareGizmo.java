package model.gizmos;

import java.awt.Color;
import java.util.ArrayList;

import model.GizmoTypes;
import model.physicsMIT.Circle;
import model.physicsMIT.LineSegment;

public class SquareGizmo extends Gizmos {

	public SquareGizmo(int X, int Y, int W, int H) {
		super(X, Y, W, H);
		colour = Color.BLUE;
		// TODO Auto-generated constructor stub
	}
	
	public GizmoTypes GetType(){
		return GizmoTypes.SquareGizmo;
	}
	
	public ArrayList <LineSegment> CreateSquareGizmo(SquareGizmo sg) {
		ArrayList<LineSegment> sls = new ArrayList<LineSegment>();
		ArrayList<Circle> slss = new ArrayList<Circle>();
		int X = sg.xpos;
		int Y = sg.ypos;
		
		LineSegment l1 = new LineSegment(X, Y, X + 1, Y);
		LineSegment l2 = new LineSegment(X + 1, Y, X + 1, Y + 1);
		LineSegment l3 = new LineSegment(X, Y + 1, X + 1, Y + 1);
		LineSegment l4 = new LineSegment(X, Y, X, Y + 1);
		sls.add(l1);
		sls.add(l2);
		sls.add(l3);
		sls.add(l4);
		
	/*	Circle c1 = new Circle (X,Y,0);
		Circle c2 = new Circle (X+1,Y,0);
		Circle c3 = new Circle (X + 1, Y + 1, 0);
		Circle c4 = new Circle (X, Y + 1, 0);
		slss.add(c1);
		slss.add(c2);
		slss.add(c3);
		slss.add(c4);*/
	
		return sls;
		
	} // end of CreateAbsorberGizmo()
	
	

}
