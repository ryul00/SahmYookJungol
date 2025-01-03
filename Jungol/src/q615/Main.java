package q615;

import java.awt.print.Printable;
import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.Engineering;

class Student {
	private String name; // 멤버변수 생성
	private int kor;
	private int eng;
	
	public Student(String name, int kor, int eng) { // 생성자 
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void print() { // 프린트 메서드
		System.out.println(name + " " + kor + " " + eng);
	}
	
	public int getKor() { // 평균계산을 위해 점수를 가져오는 get메서드
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] s = new Student[2];
		
		for(int i=0; i<s.length;i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			s[i] = new Student(name, kor, eng);
			
		}
		
		sc.close();
		
		for(int i=0;i<s.length;i++) {
			s[i].print();
		}
		
		int avgKor = 0, avgEng=0;
		for(int i=0;i<s.length;i++) {
			avgEng += s[i].getEng();
			avgKor += s[i].getKor();
		}
		avgEng /= s.length;
		avgKor /= s.length;
		
		System.out.println("avg " + avgKor + " " + avgEng);
		
		
		
		
		
		sc.close();
		
		
		
		

	}

}
