package q1314;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char arr[][] = new char[n][n];
		sc.close();
		
		char ch = 'A';
		for(int i=0; i<n; i++) {
			if(i % 2 == 0) {
				for(int j=0; j<n; j++) {
					arr[j][i] = ch;
					ch += 1;
					if(ch > 'Z') {
						ch = 'A';
					}
				}
			}else {
				for(int j=n-1; j>=0; j--) {
					arr[j][i] = ch;
					ch += 1;
					if(ch > 'Z') {
						ch = 'A';
					}
				}
			}
		}

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
