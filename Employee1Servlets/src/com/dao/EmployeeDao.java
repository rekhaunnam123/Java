package com.dao;

import java.util.List;

import com.model.Emp;

public interface EmployeeDao {
	 public int save(Emp emp);
	 public int update(Emp emp);
	 public int delete(int id);
	 public Emp getEmployeeById(int id);
	 public List<Emp> getAllEmployees();

}
