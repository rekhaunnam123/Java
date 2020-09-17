
/*Usage of foreach loop*/
package com.main;

import java.util.stream.Stream;

public class IterateStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.iterate(0,n->n+2).filter(n->n%3==0).limit(6).forEach(System.out::println);

	}

}
