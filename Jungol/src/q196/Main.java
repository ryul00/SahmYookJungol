package q196;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PersonInfo[] p = new PersonInfo[3];
		
		for(int i=0; i<p.length; i++) {
			String name = sc.next();
			String tel = sc.next();
			String addr = sc.next();
			p[i] = new PersonInfo(name, tel, addr);
		}
		
		PersonInfo earlyPerson = p[0];
		for(int i=0;i<p.length;i++) {
			if(p[i].getName().compareTo(earlyPerson.getName())<0) {
				earlyPerson = p[i];
			}
		}
		System.out.println("name : " + earlyPerson.getName());
		System.out.println("tel : " + earlyPerson.getTel());
		System.out.println("addr : " + earlyPerson.getAddr());
		
		
		
		

	}

}

class PersonInfo{
	private String name;
	private String tel;
	private String addr;
	
	
	
	
	public PersonInfo(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr; 
	}


	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	
	public String getAddr() {
		return addr;
	}
	
	
	
}







