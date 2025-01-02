package q571;

import java.util.Scanner;

public class Main {
	// 내가 품 
	public void func(int num1) { 
		System.out.println("~!@#$^&*()_+|");
	}
	public static void func2(int num1) {
		System.out.println("~!@#$^&*()_+|");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		for(int i=0;i<num1;i++) {
			func2(num1);
		}
		
		// 1. instance method
		// java 내 최상위 클래스 = object, 실행가능한 모든 메서드들이 속함 
		Main m1 = new Main(); // 생성자 사용하여 직접 생성
		for (int i=0; i<num1; i++)
		m1.func(num1);
		
		// 2. static method -> 과도한 사용은 메모리 부하 가능
		func2(num1);
		Main.func2(num1);
		
	}
	
	
	

}
