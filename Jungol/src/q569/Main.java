package q569;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[5][4];
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		int cnt = 0;
		for(int i=0; i<5; i++) {
			int sum = 0;
			for(int j=0; j<4; j++) {
				sum += arr[i][j];
				
			}
			int avg = sum / arr[i].length;
			if(avg >= 80) {
				System.out.println("pass");
				cnt++;
			}else {
				System.out.println("fail");
			}
		}
		
		System.out.println("Successful" + " : " + cnt);
		
		
	}

}
