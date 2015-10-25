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
		//arrayLoop();
		//stringArrayLoop();
		getArray();

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

		public static void stringArrayLoop(){
			
		String []day ={"sun","mon","Tue","wed","thr","fri","sat"};
		System.out.println("Number of elements"+day.length);
	    for (int counter=0;counter<day.length;counter++)
		{
		 System.out.println("The day is :"+day[counter]);
			}
		}
		
		public static void getArray(){
			
		String []day= new String[5];
		for (int counter=0;counter<day.length;counter++)
		{
		 day[counter]="Added Value"+counter;
		
		 System.out.println("The day is :"+day[counter]);
		}
		}
}