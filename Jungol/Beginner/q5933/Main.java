package q5933;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n]; 
		sc.close();
		
		for(int i=0; i<n; i++) {
			int num = 1;
			for(int j=0; j<n; j++) {
				num = num + i;
				arr[i] = num;
				System.out.print(num + " ");
				num++;
				
			}
			
			System.out.println();
		}

	}

}
