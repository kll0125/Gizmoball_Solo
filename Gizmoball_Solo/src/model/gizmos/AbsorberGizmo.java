package model.gizmos;

import java.awt.Color;
import java.awt.Shape;
import java.util.ArrayList;

import model.GizmoTypes;
import model.physicsMIT.LineSegment;

public class AbsorberGizmo extends Gizmos{
	
	public AbsorberGizmo(int X, int Y, int W, int H) {
		// TODO Auto-generated constructor stub
		super(X, Y, W, H);
		colour = Color.RED;
	}

	public GizmoTypes getType() {
		return GizmoTypes.AbsorberGizmo;
	}
	
	public ArrayList <LineSegment> createAbsorberGizmo(AbsorberGizmo abg) {
		ArrayList<LineSegment> abls = new ArrayList<LineSegment>();
		int X = abg.xpos;
		int Y = abg.ypos;
		int W = abg.width;
		int H = abg.height;
		LineSegment l1 = new LineSegment(X, W, W + X, H);
		LineSegment l2 = new LineSegment(X + W, Y, W + X, H + Y);
		LineSegment l3 = new LineSegment(X, Y + H, W + X, H + Y);
		LineSegment l4 = new LineSegment(X, Y, X, Y + H);
		abls.add(l1);
		abls.add(l2);
		abls.add(l3);
		abls.add(l4);
		
		return abls;
		
	} // end of CreateAbsorberGizmo()



} // end of class