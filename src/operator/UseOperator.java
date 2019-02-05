package operator;

public class UseOperator {

	public static void main(String[] args) {
		int num1=201;
		int num2=100;
		//if ((num1>num2)||(num1 %2 ==0)) {
		if (num1>num2) {
			//if ((num1>num2)&&(num1 %2 ==0)) {
			System.out.println (num1 + " is biggeer than "+ num2);// + " " +num1 + " is even number");
		}else if (num1<num2) {
			System.out.println(num2 + " is bigger than "+num1);
		}else if (num1==num2) {
			System.out.println(num2 + "is equal to " +num1);
		}

	}

}
