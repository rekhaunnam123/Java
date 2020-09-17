/*Usage of reduce function using streams*/

package com.main;

import java.util.ArrayList;
import java.util.List;

import com.data.Employee;

public class EmployeeReduce {
	public static void main(String[] args) {
		List<Employee>list=new ArrayList();
		list.add(new Employee(1,"Raghu",30000f));
		list.add(new Employee(2,"Virat",45000f));
		list.add(new Employee(3,"Gopi",65000f));
		list.add(new Employee(4,"Latha",76000f));
		list.add(new Employee(5,"Balaji",95000f));
		Float list2=list.stream()
				.map(p->p.getEmployeeSalary()).reduce(0.0f,(sum,employeeSalary)->sum+employeeSalary);
		System.out.println(list2);
		
	}

}
