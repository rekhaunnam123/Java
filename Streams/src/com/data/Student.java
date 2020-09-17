package com.data;

import java.util.List;

public class Student {
	private int stuId; 
	private int stuAge;  
	private String stuName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stuId, int stuAge, String stuName) {
		super();
		this.stuId = stuId;
		this.stuAge = stuAge;
		this.stuName = stuName;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public static List<Student> getStudents() {
		// TODO Auto-generated method stub
		return null;
	} 

}
