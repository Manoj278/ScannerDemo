/**
 * 
 */
package com.digitek.datastructure;

/**
 * @author Swetha
 *
 */
public class ArrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      
		//array();
		arrayLoop();

	}

	public static void array(){
		
		int []number ={1,2,3,4};
		System.out.println("Number of elements"+number.length);
		System.out.println("elements"+number[0]);
		System.out.println("elements"+number[1]);
		System.out.println("elements"+number[2]);
		System.out.println("elements"+number[3]);
		
	}
		
		public static void arrayLoop(){
		
		int []number ={1,2,3,4};
		System.out.println("Number of elements"+number.length);
		for (int counter=0;counter<number.length;counter++)
		{
		 System.out.println("elements"+number[counter]);
		}
	}
}
