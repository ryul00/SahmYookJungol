package q235;

import java.util.Scanner;

public class Main {
	static int count;
	public static void func(int n) {
		if(n==1) {
			System.out.println(count);
		}else {
			if(n%2==0) {
				n = n/2;
				count++;
			}else {
				n = n/3;
				count++;
			}
			func(n);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		func(n);

	}

}
