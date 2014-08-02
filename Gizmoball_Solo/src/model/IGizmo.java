package model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import model.physicsMIT.LineSegment;

public interface IGizmo {
	
	//type of gizmo
	GizmoTypes getType();

	//coordinates
	int getXpos();
	int getYpos();

	//dimensions
	int getWidth();
	int getHeight();
	
	// for circle
	int getRadius();
	
	//colour of gizmo's
	Color getcolour();

	// use line segment for square and absorber
	public ArrayList<LineSegment> getLineSeg();

	


}
