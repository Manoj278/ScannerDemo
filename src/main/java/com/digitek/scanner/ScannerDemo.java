/**
 * 
 */
package com.digitek.scanner;
import java.util.Scanner;

/**
 * @author Swetha
 *
 */
public class ScannerDemo {

	/**
	 * @param args
	 	 */
	public static void main(String[] args) {
// TODO Auto-generated method stub
    //readData();
    //readText();
    readTexts();
	}
	//Input the data while executing this program and using scanner API avilable in java.util pacakage
	private static void readData(){
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the Value ");
		int a= sc.nextInt();
	
		System.out.println("Enter the Value ");
		int b= sc.nextInt();
	
		int c=a+b;	
		System.out.println("The Result is :" + c);
		sc.close();
		
	}
	
	private static void readText(){
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the Text ");
		String s=sc.nextLine();
	
		System.out.println("The Result is :" + s);
		sc.close();
	
	}
	
	private static void readTexts()	{
	
	  Scanner sc = new Scanner(System.in);
	
	  while(true)
	  {
    	System.out.println("Enter the Text ");
	
    	 String s=sc.nextLine();
	     
    	   if(s.isEmpty())
    		break;
	System.out.println("The Result is :" + s);
	}
	sc.close();
	}
	
}

