/*
 * this program taking string as user input, reverse the string and print as output
*/

//importing the requried package and class

import java.util.Scanner;

// Start class Test
class Test{
	//Starting of main method
	public static void main(String[] args){
		String s;
		String temp ="";
		System.out.println("Enter Your String : ");
		Scanner sc =new Scanner(System.in);	//Creating object of scanner class for taking user input
		s = sc.nextLine();			// Taking input from user
		for(int i = s.length()-1; i>=0; i--){
			temp = temp + s.charAt(i);
		}
		System.out.println(temp);
	}	//end of main method
}		//end of Test class
