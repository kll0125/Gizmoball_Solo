package model;

import java.awt.Color;

public interface IGizmo {
	
	//type of gizmo
	GizmoTypes getType();

	//coordinates
	int getXpos();
	int getYpos();

	//dimensions
	int getWidth();
	int getHeight();
	
	//colour of gizmo's
	public Color colour();

	
	
}
