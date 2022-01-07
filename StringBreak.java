import java.util.Iterator;
import java.util.Scanner;

public class StringBreak {

	public static void main(String[] args) {
		System.out.println("Enter the String to be split");
		Scanner theValue = new Scanner(System.in);
		String myString = theValue.nextLine();
		String delimiter = "akshay";
		toSplit(myString,delimiter);
		
		
		
	}
	static void toSplit(String myString, String delimiter) {
		for(int  i = 0 ; i <=myString.length(); i++)
		if(myString.charAt(i) == 1) {
			System.out.println();
			continue;
		}
			
			System.out.println(myString.charAt(2));
		
	}

}
