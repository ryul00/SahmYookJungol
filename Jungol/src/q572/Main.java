package q572;

import java.util.Scanner;

public class Main {
	static double r;
	
	public static void Circle(double r) {
		
		double result = r * r * 3.14;
		System.out.printf("%.2f" ,result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		sc.close();
		Circle(r);

	}

}
