package q5931;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int num = 1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(num + " ");
			}
			num++;
			System.out.println();
		}

	}

}
