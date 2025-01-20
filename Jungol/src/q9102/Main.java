package q9102;

import java.util.Scanner;

public class Main {
	
	
	public static void Recur(int N) {
		if(N==0) {
			return;
		}else {
			System.out.println("recursive");
			Recur(N-1);
		}
		
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Recur(N);
		sc.close();
		

	}

}
