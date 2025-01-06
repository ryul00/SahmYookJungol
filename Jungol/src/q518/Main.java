package q518;

import java.util.Scanner;

//세 개의 정수를 입력 받아서 합계와 평균을 출력하시오. (단 평균은 소수 이하를 버리고 정수부분만 출력한다.)
//10 25 33

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		 case1 출력으로 구하기
//		  int num1 = sc.nextInt(); 
//		  int num2 = sc.nextInt(); 
//		  int num3 = sc.nextInt();
//		  sc.close();
//		  
//		  int sum = num1 + num2 + num3; 
//		  int avg = sum / 3;
//		  
//		  System.out.println("sum : " + sum); System.out.println("avg : " + avg);
		 
		
		
//		case2 배열로 구하기
		
		int[] ar = new int[3];
		
		// 1단계
		for(int i=0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		
//		2단계 배열 입력 확인
//		for(int i=0; i<ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		}
		
//		3단계 합계 계산
		int sum = 0;
		for(int i=0; i<ar.length; i++) {
			sum += ar[i];
		}
		
//		4단계 결과 출력
		System.out.println("sum : " + sum); 
		System.out.println("avg : " + sum/ar.length);

	}

}
