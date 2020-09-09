package com.hcl.iter;

public class Name {
	private int id;
	private String employeeName;
	public Name(int id,String employeeName)
	{
		this.id=id;
		this.employeeName=employeeName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Name [id=" + id + ", employeeName=" + employeeName + "]";
	}
	
	

}
