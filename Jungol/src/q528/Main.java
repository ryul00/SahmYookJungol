package q528;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner 선언 시 끝에 close()메서드로 종료 필요
	    int n = sc.nextInt();   
	    sc.close();
	    
	    System.out.println(n);
	    if (n<0) {
	    	System.out.println("minus");
	    }
	 
	}

}
