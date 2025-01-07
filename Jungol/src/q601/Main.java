package q601;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		int r = str.length();
//		System.out.println(r);
		
		for(int i=0; i<r; i++) {
//			System.out.println(str.charAt(i));
			String rotated = str.charAt(r-1) + str.substring(0,r-1);
			System.out.println(rotated);
			str = rotated; // 재할당 중요!! 재할당 후 값이 바뀐 str이 다시 반복문 집입 !
		}
	}
}
