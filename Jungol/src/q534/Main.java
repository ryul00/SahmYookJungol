package q534;


//영문 대문자를 입력받아 
//
//'A'이면 “Excellent”, 
//
//'B'이면 “Good”, 
//
//'C'이면 “Usually”, 
//
//'D'이면 “Effort”, 
//
//'F'이면 “Failure”, 
//
//그 외 문자이면 “error” 라고 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		
		int category = (a.equals("A"))? 1:
					   (a.equals("B"))? 2:
					   (a.equals("C"))? 3:
					   (a.equals("D"))? 4:
					   (a.equals("F"))? 5:6;
		
		
		switch (category) {
		case 1: {
			System.out.println("Excellent");
			break;
		}
		case 2: {
			System.out.println("Good");
			break;
		}
		case 3: {
			System.out.println("Usually");
			break;
		}
		case 4: {
			System.out.println("Effort");
			break;
		}
		case 5: {
			System.out.println("Failure");
			break;
		}
		case 6: {
			System.out.println("error");
			break;
		}
	
		}
	}
}
