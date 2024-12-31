package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String[] s = new String[10]; // 배열 생성, [요소개수=배열크기]
	for(int i = 0; i < 10; i++ ) {
		s[i] = sc.next(); // 입력받은 문자열을 배열에 저장한다.
		System.out.print(s[i]);
	}
	sc.close();
			
	}

}
