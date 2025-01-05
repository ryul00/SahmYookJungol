package q123;

import java.util.Scanner;

/*100 이하의 자연수 n을 입력받고 n개의 정수를 입력받아 평균을 출력하는 프로그램을 작성하시오. 
(평균은 반올림하여 소수 둘째자리까지 출력하도록 한다.)*/

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		double avg = 0;
		
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			avg = (double) sum/arr.length;
		}
		sc.close();
		System.out.printf("%.2f\n", avg);

	}

}
