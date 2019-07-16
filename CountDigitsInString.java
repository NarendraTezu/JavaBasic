/*
 * Take input from user as string and check number of digits in string
*/

//import requried packages and class

import java.util.Scanner;

class Test{		//Test Class start
	public static void main(String[] args){			//main method start
		String str1;
		int count=0;					//counter variable
		Scanner sc = new Scanner(System.in);		//creating object of scanner class
		System.out.println("Enter your string : ");
		str1 = sc.nextLine();				//taking string as input
		for(int i=0; i<str1.length(); i++){		
			if(str1.charAt(i) >= '0' && str1.charAt(i) <= '9'){		//checking is digit or not
				count++;
			}
		}
		System.out.println("Number of digit in string is : " + count);
	}							//main method end 
}								//class test end
