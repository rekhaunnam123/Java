 /*You are required to compute the power of a number by implementing a calculator. Create a class MyCalculator which consists of a single method long power(int, int). This method takes two integers, and , as parameters and finds . If either or is negative, then the method must throw an exception which says "". Also, if both and are zero, then the method must throw an exception which says ""
For example, -4 and -5 would result in .
Complete the function power in class MyCalculator and return the appropriate result after the power operation or an appropriate exception as detailed above
*/


package com.fun;

public class MyCalculator {
	public long power(int num, int pow) throws Exception  {
		            if(num==0 && pow==0) {
		                
							throw new Exception("n and p should not be zero.");
			
						}
		                 else if(num<0 || pow<0) {
		                
							throw new Exception("n or p should not be negative.");
						
		            }
					return (long)Math.pow(num, pow);
		        }
	}