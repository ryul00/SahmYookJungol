package q9055;

import java.util.Scanner;

/*1부터 차례로 누적하여 합을 구하다가 합이 입력받은 수를 넘으면 중단하고 
마지막으로 더해진 값과 그 때까지의 합을 출력하는 프로그램을 작성하시오.*/

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int sum = 0;
		for(int i=1;i<=N;i++) {
			sum += i;
//			System.out.println(sum);
			if(sum > N) {
				System.out.print(i + " ");
				break;
			}
		}
		System.out.print(sum);

	}

}
