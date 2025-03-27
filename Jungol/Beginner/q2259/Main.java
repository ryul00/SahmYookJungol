package q2259;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []x = new int[7];
		int []y = new int[7];
		x[0] = 0;
		y[0] = 0;
		for(int i=1; i<=6; i++) {
			int dir = sc.nextInt();
			int len = sc.nextInt();
			x[i] = x[i-1];
			y[i] = y[i-1];
			
			if(dir == 1) {
				x[i] = x[i] + len; 
			}
			else if (dir == 2) {
				x[i] = x[i] - len;
			}
			else if (dir == 3) {
				y[i] = y[i] - len;
			}
			else if (dir == 4) {
				y[i] = y[i] + len;
			}
		}
		
		x[6] = x[0];
		y[6] = y[0];
		
		int area = 0;
		
		for(int i=0; i<6; i++) {
			area = area + (x[i] * y[i+1]) - (x[i+1] * y[i]);
		}
		
		area = Math.abs(area)/2;
		
		System.out.println(area * n);
		
		

	}

}
