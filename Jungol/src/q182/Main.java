package q182;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(0);
		sc.close();
		
		int ch11 = (int)ch1;
		int ch22 = (int)ch2;
		System.out.print(ch11 + ch22 + " ");
//		System.out.println(ch11);
//		System.out.println(ch12);
		System.out.print(Math.abs(ch22 - ch11));

	}

}
