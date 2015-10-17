/**
 * 
 */
package com.digitek.operators;

import java.util.Scanner;

/**
 * @author Swetha
 *
 */
public class EqualityAndRelationalOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		operatorEquality();
		operatorInEquality();
		operatorGreator();
		operatorGreatorOrEqual();
		operatorLesser();
		operatorLesserOrEqual();		
			}
	
	public static void operatorEquality(){
		
	  Scanner sc = new Scanner (System.in);
       int num1,num2;
       System.out.println("Enter the Values:");
       num1=sc.nextInt();
       num2=sc.nextInt();
		boolean output = (num1==num2);
		System.out.println("The operatorEquality value is :"+output);
	}
	public static void operatorInEquality(){
		
		  Scanner sc = new Scanner (System.in);
	       int num1,num2;
	       System.out.println("Enter the Values:");
	       num1=sc.nextInt();
	       num2=sc.nextInt();
			boolean output = (num1!=num2);
			System.out.println("The operatorInEquality value is :"+output);
		}
	public static void operatorGreator(){
		
		  Scanner sc = new Scanner (System.in);
	       int num1,num2;
	       System.out.println("Enter the Values:");
	       num1=sc.nextInt();
	       num2=sc.nextInt();
			boolean output = (num1>num2);
			System.out.println("The operatorGreator value is :"+output);
		}
	public static void operatorGreatorOrEqual(){
		
		  Scanner sc = new Scanner (System.in);
	       int num1,num2;
	       System.out.println("Enter the Values:");
	       num1=sc.nextInt();
	       num2=sc.nextInt();
			boolean output = (num1>=num2);
			System.out.println("The operatorGreatorOrEqual value is :"+output);
		}
	public static void operatorLesser(){
		
		  Scanner sc = new Scanner (System.in);
	       int num1,num2;
	       System.out.println("Enter the Values:");
	       num1=sc.nextInt();
	       num2=sc.nextInt();
			boolean output = (num1<num2);
			System.out.println("The operatorLesser value is :"+output);
		}
	public static void operatorLesserOrEqual(){
		
		  Scanner sc = new Scanner (System.in);
	       int num1,num2;
	       System.out.println("Enter the Values:");
	       num1=sc.nextInt();
	       num2=sc.nextInt();
			boolean output = (num1<=num2);
			System.out.println("The operatorLesserOrEqual value is :"+output);
		}
}
