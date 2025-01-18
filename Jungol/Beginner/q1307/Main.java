package q1307;


import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		char arr[][] = new char[n][n];
		
		
		char ch = 'A';
		for(int i=n-1; i >= 0; i--) {
			for(int j=n-1; j >= 0; j--) {
				arr[j][i] = ch;
				ch += 1;
				if(ch > 'Z') {
					ch = 'A';
				}
			}
			
			
		}
		
		for(int i=0; i < n; i++) {
			for(int j=0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
