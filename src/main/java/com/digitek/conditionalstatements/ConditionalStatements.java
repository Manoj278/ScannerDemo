/**
 * 
 */
package com.digitek.conditionalstatements;

import java.util.Scanner;

/**
 * @author Swetha
 *
 */
public class ConditionalStatements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gradeOfStudent();
	}
	
	public static void gradeOfStudent(){
		
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the marks in the subject1");
		int sub1=sc.nextInt();
	  
		System.out.println("Enter the marks in the subject2");
	    int sub2=sc.nextInt();
	    	
	    System.out.println("Enter the marks in the subject3");
	    int sub3=sc.nextInt();
	    	 
	    int tot=sub1+sub2+sub3;
	    System.out.println("Total Marks" + tot);
	    
	    int avg = tot/3;
	    System.out.println("Average" + avg);
	    
	    if(avg >=90)
	    	System.out.println("Grade is A"+avg);
	    
	    else if(avg>=75 && avg<90)
	    	System.out.println("Grade is Distinction"+avg);
	    
	    else if(avg>=60 && avg<75)
	    	System.out.println("Grade is First Class"+tot);
	    
	    else if(avg>=50 && avg<60)
	    	System.out.println("Grade is second class"+tot);
	    
	    else if(avg>=35 && avg<50)
	    	System.out.println("Grade is Thrid Class"+tot);
	    
	    else
	    	System.out.println("Failed");

	    sc.close();
	    
	}
}
	
