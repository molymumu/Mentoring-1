package input;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		System.out.println("Enter any number:");
		Scanner sc = new Scanner (System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		sc.close();
		int result1 = input1 + input2 -input3;
		int result2 = input1 - input2 +input3;
		int result3 = input1 * input2* input3;
		int result4 = input1 / input2 *input3 ;
		int result5 = input1 % input2 % input3;
		System.out.println(" Total addition of two inputs: "+ result1);
		System.out.println(" Total subtruct of two inputs: "+ result2);
		System.out.println(" Total multiply of two inputs: "+ result3);
		System.out.println(" Total divide of two inputs: " + result4);
		System.out.println(" Total remainder of two inputs: "+ result5);
	}

}
