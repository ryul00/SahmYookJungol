package q565;

import java.util.Scanner;

//100 미만의 양의 정수들이 주어진다. 
//입력받다가 0 이 입력되면 마지막에 입력된 0 을 제외하고 
//그 때까지 입력된 정수의 십의 자리 숫자가 각각 몇 개인지 
//작은 수부터 출력하는 프로그램을 작성하시오. (0개인 숫자는 출력하지 않는다.)

public class Main {
	static int inp;
	static int sp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		while(true) {
			inp = sc.nextInt();
			if(inp == 0) {
				break;
			}
			sp = inp / 10;
			arr[sp]++;

		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 0) {
				System.out.println(i + " : " + arr[i]);
			}
		}
	}

}
