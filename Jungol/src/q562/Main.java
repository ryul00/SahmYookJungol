package q562;

import java.util.Scanner;

//10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오. 
//평균은 반올림하여 소수첫째자리까지 출력한다.
// idx : 0 1 2 3
// rea : 1 2 3 4
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int sum1 = 0;
		int sum2 = 0;
		int cnt = 0;

		for(int i=0; i<arr.length; i++) {
			if(i % 2 != 0) {
				sum1 += arr[i];
			}else {
				cnt++;
				sum2 += arr[i];
			}
		}
		double avg = (double)sum2 / cnt; // 평균 계산 시 정수/정수 형태이므로 반드시 (double)형 변환 해줘야 정상적인 반올림 가능 
		String result = String.format("%.1f",avg); 
		System.out.println("sum" + " : " + sum1);
		System.out.println("avg" + " : " + result);

	}

}
