/*
 * This program take user as integer nuumber and find the sum of all digits of that number
*/

//import requried package and class

import java.util.Scanner;

class Test{			//Starting of test class
	public static void main(String[] args){		//starting of main method
		int number, rem, sum = 0;		
		Scanner sc = new Scanner(System.in);	//creating object of Scanner class
		System.out.print("Enter your number : ");
		number = sc.nextInt();			//Taking interger input from user 
		while(number > 0){			
			rem = number%10;		//Finding last digits of number 
			sum = sum + rem;		//sum of digits
			number = number/10;			
		}
		System.out.println("Sum of digits is : " + sum);
	}		//End of main method 
}			//End of Test class
