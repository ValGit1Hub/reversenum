package convertUserInput;

import java.util.Scanner;

public class ConvertValues {
	
	public static void main(String[] args) {
		//create object for input
		Scanner input = new Scanner(System.in);
		
		//output the prompt for user to enter numeric data
		System.out.println("Please enter a numeric value: ");
		
		//wait for the user to enter the value
		int value = input.nextInt();
		
		//reverse the value
		int reverse = 0;
		int tempVal = value;
		while (tempVal != 0){
			reverse = reverse * 10;
			reverse = reverse + tempVal%10;
			tempVal = tempVal/10;
		}
		//display the converted value
		System.out.println(" Your value of: " + value + " is now converted to "  + reverse);
		
	}

}
