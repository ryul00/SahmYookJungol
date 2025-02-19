package q564;

import java.util.Scanner;

public class Main {
	static char inp;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[26];
		
		while(true) {
			inp = sc.next().charAt(0);; 
			if (inp < 'A' || inp > 'Z') {
			    break;  
			}
			
			arr[inp-'A']++;
			
		}
		sc.close();
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] > 0) {
				System.out.println((char)(i+'A') + " : " + arr[i]);
			}
		}
		

	}

}
