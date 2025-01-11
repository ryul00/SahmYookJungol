package q9130;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		person.Person();
		person.print();
		
		

	}

}

class Person{
	private int age;
	private String name;
	
	Scanner sc = new Scanner(System.in);
	
	
	public void Person() {
		System.out.print("당신의 이름은 무엇입니까? ");
		name = sc.next();
		System.out.print("당신의 나이는 몇 살입니까? ");
		age = sc.nextInt();
	}
	public void print() {
		System.out.println("당신의 이름은 " + getName() + "이고 나이는 " + getAge() + "세이군요.");
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}