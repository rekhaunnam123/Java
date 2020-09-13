package abt.subclass;

import abt.entry.Shape;

public class Square extends Shape{
	private int side;

	public Square(String name,int side) {
		super(name);
		this.side=side;
		// TODO Auto-generated constructor stub
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	public float calculateArea()
	{
		float result=side*side;
		return result;
	}
	

}
