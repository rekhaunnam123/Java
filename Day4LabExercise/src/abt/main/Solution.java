package abt.main;

import java.util.Scanner;

 class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyCalculator mycalculator=new MyCalculator();
		   System.out.print("I implemented: ");
		   ImplementedInterfaceNames(mycalculator);
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("Enter number");
		   int number = scanner.nextInt();
		   System.out.print(mycalculator.divisorSum(number) + "\n");

		  }
		  /*
		   *  ImplementedInterfaceNames method takes an object
		   */
		 static void ImplementedInterfaceNames(Object o) {

		  Class[] theInterfaces = o.getClass().getInterfaces();
		  for (int i = 0; i < theInterfaces.length; i++) {
		   String interfaceName = theInterfaces[i].getName();
		   System.out.println(interfaceName);
		  }

	}

}
