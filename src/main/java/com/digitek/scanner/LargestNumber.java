/**
 * 
 */
package com.digitek.scanner;

import java.util.Scanner;

/**
 * @author Swetha
 *
 */
public class LargestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		highestNumber();
	}
	//To find the Largest number in the set
	public static void highestNumber(){
	
	Scanner sc = new Scanner(System.in);
	
	int i,temp,max=0;
	
	for(i=1,temp=0;i<=10;i++){	
		
		System.out.println("Enter the"+i+"number:");
	    temp = sc.nextInt();
	}
	
	    if(temp>max)
	    max=temp;
	    System.out.println("The Largest Number is :"+ max);
		
	}
	
	
	

}
