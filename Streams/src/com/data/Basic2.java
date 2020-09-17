//Sample program to demonstrate on sorted and reduce

package com.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new ArrayList();
		list.add(1);
		list.add(4);
		list.add(8);
		list.add(3);
		List<Integer>list1=list.stream().sorted().collect(Collectors.toList());
		int even=list.stream().filter(x->x%2==0).reduce(0,(sum,num)->sum+num);
		System.out.println("sum= "+even);

	}

}
