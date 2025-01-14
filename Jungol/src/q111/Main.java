package q111;

import java.util.Scanner;


//국어 영어 수학 컴퓨터 과목의 점수를 정수로 입력받아서 총점과 평균을 구하는 프로그램을 작성하시오. (단 평균의 소수점 이하는 버림 한다.)

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scores [] = new int[4];
		int sum = 0;
		
		for (int i=0;i<scores.length;i++) {
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		
		int avg = sum / scores.length;
		
		System.out.println("sum " + sum);
		System.out.printf("avg " +  avg);
		
	}

}
