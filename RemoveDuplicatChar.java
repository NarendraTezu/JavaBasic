// importing Scanner class
import java.util.Scanner;

class Test{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//Creating Scanner class object
		System.out.println("Enter your string : ");
		String str = sc.nextLine();		//Taking user input as string
		char[] chararr = str.toCharArray();
		int length = chararr.length;
		System.out.println("String with duplicates : " + str);
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (chararr[i] == chararr[j]) {
					int temp = j;//set duplicate element index

					//delete the duplicate element by shifting the elements to left
					for (int k = temp; k < length - 1; k++) {
						chararr[k] = chararr[k + 1];
					}
					j--;
					length--;//reduce char array length
				}
			}
		}
		String newstr = new String(chararr);
		newstr = newstr.substring(0, length);
		System.out.println("String with distinct char : " + newstr);
		System.out.println("New String length with distinct char is  : " + newstr.length());

	}
}
