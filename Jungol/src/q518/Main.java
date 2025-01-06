package q518;

import java.util.Scanner;

//세 개의 정수를 입력 받아서 합계와 평균을 출력하시오. (단 평균은 소수 이하를 버리고 정수부분만 출력한다.)
//10 25 33

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		 case1 
//		  int num1 = sc.nextInt(); 
//		  int num2 = sc.nextInt(); 
//		  int num3 = sc.nextInt();
//		  sc.close();
//		  
//		  int sum = num1 + num2 + num3; 
//		  int avg = sum / 3;
//		  
//		  System.out.println("sum : " + sum); System.out.println("avg : " + avg);
		 
		
//		case2
		
		int[] ar = new int[3];
		int sum = 0;
		int avg = 0;
		
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
			sum += ar[i];
			avg = sum / ar.length;
		}
		System.out.println("sum : " + sum); 
		System.out.println("avg : " + avg);

	}

}
