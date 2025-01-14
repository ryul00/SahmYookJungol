package q5932;

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
				if(i%2==0) {
					System.out.print(num + " ");
					num++;
				}else {
					System.out.print(num-1 + " ");
					num--;
				}
			}
			System.out.println();
			
		}

	}

}
