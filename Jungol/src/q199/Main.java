package q199;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Student[] s = new Student[n];
		
		for(int i=0; i<s.length; i++) {
			String name = sc.next();
			int score1 = sc.nextInt();
			int score2 = sc.nextInt();
			int score3 = sc.nextInt();
			int sum = score1 + score2 + score3;
			s[i] = new Student(name, score1, score2, score3, sum);
		}
		sc.close();
		
		Arrays.sort(s, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getSum() - o1.getSum();
			}
			
		});
		
		for(int i=0; i<s.length; i++) {
			 System.out.println(s[i].getName()+ " "+s[i].getScore1() + " " + s[i].getScore2() + " " 
					  + s[i].getScore3() +" " + s[i].getSum());
		}
		
		
//		Student maxSum = s[0];
//		
//		for(int i=0; i<s.length; i++) {
//			if(s[i].getSum() > maxSum.getSum()) {
//				maxSum = s[i];
//			}
//			
//		}
		
	}

}

class Student{
	private String name;
	private int score1;
	private int score2;
	private int score3;
	private int sum = score1 + score2 + score3;
	
	public Student(String name, int score1, int score2, int score3, int sum) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		this.sum = sum;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore1() {
		return score1;
	}
	
	public int getScore2() {
		return score2;
	}
	
	public int getScore3() {
		return score3;
	}
	
	public int getSum() {
		return sum;
	}
	
	
	
	
	
	
	
}
