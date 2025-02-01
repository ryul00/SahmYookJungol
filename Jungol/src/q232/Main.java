package q232;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	static int n;
	static void func(int p) {
		if(p > n) {
			return;
		}
		else {
				System.out.print(p + " ");
				func(p+2);
			}
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n%2==0) {
			func(2);
		}
		else {
			func(1);
		}
	}

}
