package abt.subclass;

import abt.entry.Shape;

public  class Circle extends Shape {
	private int radius;

	public Circle(String name,int radius) {
		super(name);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public float calculateArea()
	{
	
		float result= (float) (3.14*radius*radius);
		return result;
	}
	

}
