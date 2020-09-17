

/*Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors. The catch block contains the code that says what to do if exception occurs.
 
This problem will test your knowledge on try-catch block.
You will be given two integers and as input, you have to compute . If and are not bit signed integers or if is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case
 of exceptions.You will be given two integers and as input, you have to compute . If and are not bit signed integers or if is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report
  in case of exceptions.

*/
package com.main;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1 ;
		 int num2;
		 int num3;
		 
		 try
		 {
			 Scanner scanner=new Scanner(System.in);
				System.out.println("Enter number1");
				num1=scanner.nextInt();
				System.out.println("Enter number2");
				num2=scanner.nextInt();
			 num3=num1/num2;
			 System.out.println(num3);
		 }
		 
		 catch(InputMismatchException e)
		 {
			 System.err.println(e);
		 }
		 catch(ArithmeticException ae)
		 {
			 System.err.println(ae);
		 }
		

	}

}
