package q573;

import java.util.Scanner;

public class Main {
	static int n;
	public static void func(int n) {
		int num = 1;
		for(int i=0; i<n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		func(n);
	}
	

}
