/*Handling a checked exception by opening a file
Write a  code opens a text file and writes its content to the standard output. What happens if the file doesn’t exist?

*/

package com.main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PrintWriter pw;  
	        try {  
	            pw = new PrintWriter("jtp.txt"); //may throw exception   
	            pw.println("saved");  
	        }  
	// providing the checked exception handler  
	 catch (FileNotFoundException e) {  
	              
	            System.out.println(e);  
	        }         
	    System.out.println("File saved successfully"); 

	}

}
