package q604;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next(); 
		}
		char N = sc.next().charAt(0);
		
		for(int i=0; i<arr.length; i++) {
			char target = arr[i].charAt(arr[i].length()-1);
			if(target == N) {
				System.out.println(arr[i]);
			}
		}

	}

}
