package q613;

import java.util.Scanner;

class School {
	 String name;
	 String schoolName;
	 int grade;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        School s = new School();
        s.name = sc.next();
        s.schoolName = sc.next();
        s.grade = sc.nextInt();

        System.out.println("Name : " + s.name);
        System.out.println("School : " + s.schoolName);
        System.out.println("Grade : " + s.grade);
    }
}
