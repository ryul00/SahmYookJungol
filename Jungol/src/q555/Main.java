package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String[] s = new String[10];
	for(int i = 0; i < 10; i++ ) {
		s[i] = sc.next();
		System.out.print(s[i]);
	}
	sc.close();
			
	}

}
