package model.gizmos;

import java.awt.Color;

import model.GizmoTypes;
import model.IGizmo;

public abstract class Gizmos implements IGizmo{
		
	  protected int xPos;
	  protected int yPos;
	  protected int width;
	  protected int height;
	  protected Color colour;
	  
	  public Gizmos() { }
	  
	  // all gizmos have this: x, y, width, height
	  public Gizmos(int x, int y, int width, int height) {
			this.xPos = x;
			this.yPos = y;
			this.width = width;
			this.height = height;
		}
	  
	@Override
	public GizmoTypes getType() {
		// TODO Auto-generated method stub
		return getType();
	}
	@Override
	public int getXpos() {
		// TODO Auto-generated method stub
		return xPos;
	}
	@Override
	public int getYpos() {
		// TODO Auto-generated method stub
		return yPos;
	}
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return width;
	}
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return height;
	}
	
	public Color getColour(){
		return colour;
	}
	
	
	
} //end of class
