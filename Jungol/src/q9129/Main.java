package q9129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		String result1 = String.format("%.2f", num1); 
		String result2 = String.format("%.2f", num2); 
		String result3 = String.format("%.2f", num3); 
		
		String res = result1 + result2 + result3;
//		String result = String.join("\n", res.split("\\.")); // 기준 문자가 여러개일때 더 유용함
		
		String result = res.replace(".", "\n");
		System.out.println(result);

 
		

		

	}

}
