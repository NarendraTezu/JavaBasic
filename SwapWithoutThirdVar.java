/*
 * Taking two variable from user as input and swap it without third variable
*/

//import requried packages and class

import java.util.Scanner;

class Test{		//class Test start
	public static void main(String[] args){		//main method start
		int var1, var2;
		Scanner sc = new Scanner(System.in);	//Object creation of Scanner class
		System.out.print("Enter var1 : ");
		var1 = sc.nextInt();			//Takin input var1 from user
		System.out.print("Enter var2 : ");
		var2 = sc.nextInt();			//taking input var2 from user
		System.out.println("Before swaping var1 is : " + var1);
		System.out.println("Before swaping var2 is : " + var2);
		var1 = var1 + var2;					//Swaping variable without using third variable
		var2 = var1 - var2;
		var1 = var1 - var2;
		System.out.println("After swaping var1 is : " + var1);
		System.out.println("After swaping var2 is : " + var2);
	}		//end of main method
}			//end of Test class
