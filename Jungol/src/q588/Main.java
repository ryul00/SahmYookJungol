package q588;

import java.util.Scanner;

public class Main {
	public static void Func(int N) {
		if (N==1) {
			System.out.print(1);
		}
		else {
			System.out.print(N + " ");
			Func(N-1);
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Func(N);
	}

}
