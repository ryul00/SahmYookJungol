package q9018;

import java.util.Scanner;

//두 개의 정수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오. 
//두 개의 수를 입력하시오. 7 5

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 수를 입력하시오. ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		System.out.println(num1 + " + " + num2  + " = " + (num1+num2)  );
		System.out.println(num1 + " - " + num2  + " = " + (num1-num2)  );
		System.out.println(num1 + " * " + num2  + " = " + num1*num2  );
		System.out.println(num1 + " / " + num2  + " = " + num1/num2  );
		System.out.println(num1 + " % " + num2  + " = " + num1%num2  );
		

	}

}
