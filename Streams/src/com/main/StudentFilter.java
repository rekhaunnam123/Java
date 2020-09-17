/*Usage of filter in stream*/

package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.data.Student;

public class StudentFilter {
	public static void main(String[] args)
	{
		
		List<Student>list1=new ArrayList();
		 list1.add(new Student(11, 28, "Lucy")); 
	     list1.add(new Student(28, 27, "Tim")); 
	      list1.add(new Student(32, 30, "Daniel")); 
	      list1.add(new Student(49, 27, "Steve")); 
	     list1.stream().filter(p->p.getStuId()>10).forEach(p-> System.out.println(p.getStuId()));    
      
	    		 
}
}
