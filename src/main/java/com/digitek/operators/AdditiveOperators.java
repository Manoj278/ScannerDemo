/**
 * 
 */
package com.digitek.operators;

/**
 * @author Swetha
 *
 */
public class AdditiveOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		postIncrement();
		preIncrement();
		postDecrement();
		preDecrement();
		stringConcat();
	}
	
	public static void postIncrement(){
		
		int num =5;
		System.out.println("The Initial value "+num);
		int num1= num++;
		System.out.println("The value after Post Increment: "+num1);
		System.out.println("The value after Post Increment: "+num);
		
	}
    
	public static void preIncrement(){
		
		int num =5;
		System.out.println("The Initial value "+num);
		int num1= ++num;
		System.out.println("The value after Pre Increment: "+num1);
		System.out.println("The value after Pre Increment: "+num);
		
	}
  public static void postDecrement(){
		
		int num =5;
		System.out.println("The Initial value "+num);
		int num1= num--;
		System.out.println("The value after Post Decrement: "+num1);
		System.out.println("The value after Post Decrement: "+num);
		
	}
    
	public static void preDecrement(){
		
		int num =5;
		System.out.println("The Initial value "+num);
		int num1= --num;
		System.out.println("The value after Pre Decrement: "+num1);
		System.out.println("The value after Pre Decrement: "+num);
		}

	public static void stringConcat(){
		
		String s= "hi";
		int num =10;
		String result = s+num;
		System.out.println("The result is:"+ result);
		
	}
	
	}
