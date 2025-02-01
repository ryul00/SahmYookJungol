package q589;

import java.util.Scanner;

public class Main {
	static int sum;
	public static void Sum(int N) {
		if(N == 1) {
			sum += 1;
			System.out.println(sum);
		}else {
			sum += N;
			Sum(N-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Sum(N);

	}

}
