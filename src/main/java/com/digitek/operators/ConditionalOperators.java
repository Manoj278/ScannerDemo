/**
 * 
 */
package com.digitek.operators;

import java.util.Scanner;

/**
 * @author Swetha
 *
 */
public class ConditionalOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		operatorAndOr();

	}
    
	public static void operatorAndOr(){
		
		int year;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the year");
		year=sc.nextInt();
		if((modulusFour(year)&&modulusHundred(year))||modulusFourHundred(year))
			System.out.println("The "+year+" is a leap year");
		else
			System.out.println("The"+year+"is not a leap year");
	}
	
	public static void ternaryOperator(){
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Age");
		age=sc.nextInt();
		String s=(age>=18)?"Major":"Minor";
		System.out.println("the Result is :"+s);
		
	}

	private static boolean modulusFourHundred(int year) {
		return year%400==0;
	}

	private static boolean modulusFour(int year) {
		return year%4==0;
	}

	private static boolean modulusHundred(int year) {
		return year%100!=0;
	}
}
