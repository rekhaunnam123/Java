
/*Usage of collectors in stream*/

package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.data.Employee;

public class EmployeeStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>list=new ArrayList();
		list.add(new Employee(1,"Raghu",30000f));
		list.add(new Employee(2,"Virat",45000f));
		list.add(new Employee(3,"Gopi",65000f));
		list.add(new Employee(4,"Latha",76000f));
		list.add(new Employee(5,"Balaji",95000f));
		List<Float>list2=list.stream().
				filter(p->p.getEmployeeSalary()>45000).
				map(p->p.getEmployeeSalary()).collect(Collectors.toList());
		 System.out.println(list2);

	}

}
