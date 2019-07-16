/*
 * In this problem check number is pailndrome or not
*/

import java.util.Scanner;	//Import requried package and class

//Starting of class Test
class Test{
	//Starting of main method
	public static void main(String[] asrgs){
		int number, temp, reverse =0, rem;		
		System.out.print("Enter your number : ");
		Scanner sc = new Scanner(System.in);		//creating object of scanner class
		number = sc.nextInt();				//taking user input
		temp = number;
		while(temp > 0){				//reverse the input number
			rem = temp%10;
			reverse = (reverse*10) + rem;
			temp = temp/10;
		}
		if(number == reverse){
		 	System.out.println("Enter number is pailndrome ");
		}
		else{
			System.out.println("Enter number is not pailndrome ");
		}
	}	//End of main method
}		//End of class Test




