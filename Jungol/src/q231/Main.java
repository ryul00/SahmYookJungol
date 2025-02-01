package q231;


import java.util.Scanner;

public class Main {
	static int N;
	public static void division(int p) {
		if(p > N) {
			return;
		}
		if(p > 1) {
			System.out.println(p/2);
		}
		System.out.println(p);
		division(p+1);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		division(1);
		

	}

}
