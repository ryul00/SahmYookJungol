package q593;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int N = 0; // 틀렸던 부분 : 입력 값 초기화
		while(true) {
			System.out.print("ASCII code =? ");
			N = sc.nextInt();
			if (N >=33 && N <= 127) { // 틀렸던 부분 : 반복 및 탈출 조건 설정
				System.out.println((char)N); // ASCII code 변환 방법 -> (char) 타입캐스팅 
				
			}
			else { // else를 사용해 탈출 조건을 설정해주자
				break;
			}
			
			
			
		}sc.close();
		
	}


}
