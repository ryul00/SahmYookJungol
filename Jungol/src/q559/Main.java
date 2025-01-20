package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		double scores [] = {85.6,79.5,83.1,80.0,78.2,75.0};
		
		double sum = scores[n-1] + scores[m-1];
		
		System.out.printf("%.1f" , sum);
		

	}

}
