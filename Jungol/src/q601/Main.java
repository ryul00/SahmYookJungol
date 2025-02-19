package q601;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		int r = str.length();
		
		for(int i=0; i<r; i++) {
			String rotateStr = str.charAt(r-1) + str.substring(0,r-1);
			System.out.println(rotateStr);
			str = rotateStr; // 출력 후 재할당 필수
		}

	}

}
