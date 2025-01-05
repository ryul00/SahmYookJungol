package q614;

import java.util.Scanner;

/*"학교명", "학년"을 저장할 수 있는 구조체로 2개의 변수를 선언한 후,

한 개의 변수는 학교명에 "Jejuelementary", 학년에 "6"으로 각각 초기화하고 

다른 변수에는 새로운 학교와 학년을 입력받아 아래와 같이 출력하는 프로그램을 작성하시오.

 학교명은 20자 이하의 영문자이다.*/
/*6 grade in Jejuelementary School
1 grade in Seogwipomiddle School*/

class School {
	String schoolName1;
	String schoolName2;
}

class Grade {
	int grade1;
	int grade2;
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		School s = new School();
		Grade g = new Grade();
		
		s.schoolName1 = "Jejuelementary";
		g.grade1 = 6;
		s.schoolName2 = sc.next();
		g.grade2 = sc.nextInt();
		
		System.out.println(g.grade1 + " grade in " + s.schoolName1 + " School");
		System.out.println(g.grade2 + " grade in " + s.schoolName2 + " School");
		

	}

}
