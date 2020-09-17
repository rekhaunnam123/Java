
/*Stream program to get salary greater than 30000 and finding count of employees*/

package com.main;

import java.util.ArrayList;
import java.util.List;

import com.data.Employee;

public class EmployeeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>list=new ArrayList();
		list.add(new Employee(1,"Raghu",30000f));
		list.add(new Employee(2,"Virat",45000f));
		list.add(new Employee(3,"Gopi",65000f));
		list.add(new Employee(4,"Latha",76000f));
		list.add(new Employee(5,"Balaji",95000f));
		long list1=list.stream().filter(p->p.getEmployeeSalary()>30000).count();
		System.out.println(list1);

	}

}
