package q1304;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int arr[][] = new int[n][n];
		int num = 1;
		
		for(int i=0; i<n; i++) { // 열
			for(int j=0; j<n; j++) { // 행
				arr[j][i] = num;
				num ++;
//				System.out.print(arr[j][i] + " ");
			}
//			System.out.println();
		}
		System.out.println();
		for(int i=0; i<n; i++) { // 열 -> 행
			for(int j=0; j<n; j++) { // 행 -> 열 
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	

	}

}
