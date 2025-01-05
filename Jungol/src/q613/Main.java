package q613;

import java.util.Scanner;

/*"이름", "학교명", "학년"을 입력받아 아래와 같이 출력하는 프로그램을 작성하시오.
(이름과 학교명은 각각 20자 이하이다.)*/

class Student{
	String name;
	String schoolName;
	int grade;
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		
		s.name = sc.next();
		s.schoolName = sc.next();
		s.grade = sc.nextInt();
		
		System.out.println("Name : " + s.name);
		System.out.println("School : " + s.schoolName);
		System.out.println("Grade : " + s.grade);

	}

}
