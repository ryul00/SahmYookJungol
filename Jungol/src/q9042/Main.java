package q9042;

//정수를 계속 입력을 받다가 0이 입력되면 0을 제외하고 이전에 입력된 자료의 수와 합계, 평균을 출력하는 프로그램을 작성하시오. 
//(평균은 반올림하여 소수 둘째자리까지 출력한다.)

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		
		while(true) {
			int n = sc.nextInt();
			if(n != 0) {
				cnt += 1;
				sum += n;
				avg = (double) sum/cnt; // 반올림하여 특정 소숫점까지 출력시 double 형변환 필수
			}
			if(n==0) {
				System.out.println("입력된 자료의 개수 = " + cnt);
				System.out.println("입력된 자료의 합계 = " + sum);
				System.out.print("입력된 자료의 평균 = ");
				System.out.printf("%.2f\n", avg);
				break;
			}
			
		}
		
		
	}

}
