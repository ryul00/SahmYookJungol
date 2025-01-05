package q533;

import java.util.Scanner;

//남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인이라고 하자.
//성별('M', 'F')과 나이를 입력받아 "MAN"(성인남자), "WOMAN"(성인여자), "BOY"(미성년남자), "GIRL"(미성년여자)을
//구분하여 출력하는 프로그램을 작성하시오.

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sex = sc.next();
		int age = sc.nextInt();
		
		int category = (sex.equals("M") && age>=18)? 1:
					   (sex.equals("F") && age>=18)? 2:
					   (sex.equals("M") && age<18)? 3:
					   (sex.equals("F") && age<18)? 4:5;
		
		switch (category) {
		case 1: {
			System.out.println("MAN");
			break;
		}
		case 2: {
			System.out.println("WOMAN");
			break;
		}
		case 3: {
			System.out.println("BOY");
			break;
		}
		case 4: {
			System.out.println("GIRL");
			break;
		}

		}
	}

}
