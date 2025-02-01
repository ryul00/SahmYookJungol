package q9103;

import java.util.Scanner;

public class Main {
	static int N;
	public static int  Factorial(int N) {
		if(N == 1) {
			return 1;
		}else {
			return Factorial(N-1) * N;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = Factorial(N);
		sc.close();
		System.out.println(result);
		

	}

}
