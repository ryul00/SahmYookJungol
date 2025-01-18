package q1840;



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int map [][] = new int[x][y];
		int cheese = 0;
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j] == 1) {
					cheese++;
				}
				
			}
		}
		
	

	}

}
