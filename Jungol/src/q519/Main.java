package q519;

import java.util.Scanner;

//정수 2개를 입력받아서 첫 번째 수에는 100을 증가시켜 저장하고 두 번째 수는 10으로 나눈 나머지를 저장한 후 두 수를 차례로 출력하는 프로그램을 작성하시오.

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt(); 
		
		sc.close();
		
		num1 += 100;
		num2 %= 10;	
		
		System.out.println(num1 + " " + num2);
		
		

	}

}
