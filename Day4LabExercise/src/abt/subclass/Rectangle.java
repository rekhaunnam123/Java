package abt.subclass;

import abt.entry.Shape;

public class Rectangle extends Shape {
	private int length;
	private int breadth;
	public Rectangle(String name,int length,int breadth) {
		super(name);
		this.length=length;
		this.breadth=breadth;
		// TODO Auto-generated constructor stub
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public float calculateArea()
	{
		float result=length*breadth;
		return result;
	
	}
	
	

}
