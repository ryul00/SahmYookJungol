package q617;

import java.util.Scanner;

//5명의 이름과 키를 입력받아 키가 가장 작은 사람의 이름과 키를 출력하는 프로그램을 작성하시오. 이름은 20자 이하이다.

public class Main {

	public static void main(String[] args) {
		String[] narr = new String[5];
		int[] harr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			narr[i] = sc.next();
			harr[i] = sc.nextInt();
//			sc.nextLine();
//			System.out.println(narr[i] + " " + harr[i]);
	
			
		}
		sc.close();
		
		Person person = new Person();
		person.min(harr, narr);
		
		
		

	}

}

class Person{
	int minHeight = Integer.MAX_VALUE;
	String minName;
	public void min(int[] harr, String[] narr){
		for(int i=0;i<5;i++) {
			if (minHeight > harr[i]) {
			minHeight = harr[i];
			minName = narr[i];
		}
			
	}
		System.out.println(minName + " " + minHeight);
	}
}

	
















