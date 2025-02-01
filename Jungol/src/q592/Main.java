package q592;

import java.util.Scanner;

public class Main {
	static int sum;
	
	public static void func(int N) {
		if(N < 10) {
			System.out.println(sum + N*N);
		}else {
			sum += (N%10)*(N%10);
			func(N/10);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		func(N);
		sc.close();

	}

}
