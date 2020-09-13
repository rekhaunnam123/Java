
/*Create an abstract class named Shape with the following protected attributes / member variables.
 String name
 Include a 1-argument constructor.
 Include getters and setters.
 Include an abstract method named calculateArea() . This method returns a Float value.

*/


package abt.entry;

public  abstract class Shape {
	protected String name;

	public Shape(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract float calculateArea();
	}



