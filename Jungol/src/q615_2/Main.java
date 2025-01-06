package q615_2;
/*두 명의 이름과 국어, 영어 점수를 입력받아 과목별 점수의 평균을 구하여 출력하는 프로그램을 작성해 보시오.

(이름은 20자 이하이고 평균의 소수점 이하는 버림한다.)*/
import java.util.Scanner;

class Student {
	
	private String name; 
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
			s[i] = new Student(name, kor, eng); // Student 클래스의 객체를 생성해 배열에 저장 
		}
		
		for(int i=0;i<s.length;i++){
			s[i].print();
		}
		
		int korAvg = 0;
		int engAvg = 0;
		
		for(int i=0;i<s.length;i++) {
			korAvg += s[i].getKor();
			engAvg += s[i].getEng();
		}
		
		korAvg /= s.length;
		engAvg = engAvg / s.length;
		
		System.out.println("avg " + korAvg + " " + engAvg);
		
		sc.close();
		
		
		

	}

}
