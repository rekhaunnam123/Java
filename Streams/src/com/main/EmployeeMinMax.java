/*Stream program to find min and max values*/

package com.main;

import java.util.ArrayList;
import java.util.List;

import com.data.Employee;

public class EmployeeMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>list=new ArrayList();
		list.add(new Employee(1,"Raghu",30000f));
		list.add(new Employee(2,"Virat",45000f));
		list.add(new Employee(3,"Gopi",65000f));
		list.add(new Employee(4,"Latha",76000f));
		list.add(new Employee(5,"Balaji",95000f));
		Employee list1=list.stream()
				.max((emp1,emp2)->emp1.getEmployeeSalary()>emp2.getEmployeeSalary() ? 1: -1).get();
		System.out.println(list1.getEmployeeSalary());
		Employee list2=list.stream()
				.max((emp1,emp2)->emp1.getEmployeeSalary()<emp2.getEmployeeSalary() ? 1: -1).get();
		System.out.println(list2.getEmployeeSalary());
        

	}

}
