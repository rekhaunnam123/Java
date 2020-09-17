//Sample program using map,foreach.

package com.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new ArrayList();
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(3);
		//usage of map method
		list.stream().map(x->x*x).forEach(System.out::println);
		List<Integer>Square=
		list.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(Square);
		

	}

}
