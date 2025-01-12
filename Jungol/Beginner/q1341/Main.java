package q1341;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 0;
		int e = 0;
		
		while(true) {
			s = sc.nextInt();
			e = sc.nextInt();
			
			if((s > 9 || s < 2) || (e > 9 || e < 2)) {
				continue;
			}else {
				break;
			}
		}
		
		if(s > e) {
			for(int i=s; i>=e; i--) {
				for(int j=1; j<=9; j++) {
					System.out.printf("%d * %d = %2d   ", i,j,j*i);
					if(j%3==0) {
						System.out.println();
					}
					
				}
				System.out.println();
				
			}
		}else {
			for(int i=s; i<=e; i++) {
				for(int j=1; j<=9; j++) {
					System.out.printf("%d * %d = %2d   ", i,j,j*i);
					if(j%3==0) {
						System.out.println();
					}
					
				}
				System.out.println();
			}
			
		}
		

	}

}
