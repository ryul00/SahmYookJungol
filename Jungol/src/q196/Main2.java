package q196;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] p = new Person[3];
		
		for(int i=0; i<p.length; i++) {
			String name = sc.next();
			String phoneNum = sc.next();
			String address = sc.next();
			p[i] = new Person(name, phoneNum, address);
		}
		
		sc.close();
		
		Person early = p[0];
		
		for(int i=0; i<p.length; i++) {
			if(p[i].getName().compareTo(early.getName())<0) {
				early = p[i];
			}
		}
		
		System.out.println("name : " +  early.getName());
		System.out.println("tel : " + early.getPhoneNum());
		System.out.println("addr : " + early.getAddress());

	}

}

class Person {
	private String name;
	private String phoneNum;
	private String address;
	
	public Person(String name, String phoneNum, String address) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public String getAddress() {
		return address;
	}
	
}
