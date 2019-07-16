/*
 * Swap two variable using third variale
*/

//import requried package and class
import java.util.Scanner;
class Test{			//class Test start
	public static void main(String[] args){
		int var1, var2, temp;
		Scanner sc = new Scanner(System.in);		//Creating object of Scanner class
		System.out.print("Enter your var1 : ");
		var1 = sc.nextInt();				//taking input from user
		System.out.print("Enter your var2 : ");
		var2 = sc.nextInt();
		System.out.println("Before swaping var1 is : " + var1);
		System.out.println("Before swaping var2 is : " + var2);
		temp = var1;					//swaping var1 from var2
		var1 = var2;
		var2 = temp;
		System.out.println("After swaping var1 is : " + var1);
		System.out.println("After swaping var2 is : " + var2);
	}		// end of main methods
}			//end of class Test
