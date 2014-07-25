package model.gizmos;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import model.Ball;
import model.GizmoTypes;

public class AbsorberGizmo extends Gizmos implements Observer {

	private Ball isCapturedBall;
	private Color colour;
	private int wth;

	public AbsorberGizmo(int x1, int y1, int x2, int y2) {
		super(x1, y1, x2 - x1, y2 - y1);
		isCapturedBall = null;
		colour = Color.RED;
	}
	
	public GizmoTypes getType (){
		
		return GizmoTypes.AbsorberGizmo;
	}

	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Color colour() {
		// TODO Auto-generated method stub
		return colour;
	}
	

} // end of class
