package q198;

import java.util.Scanner;

//어떤 학생의 키는 아버지와 어머니의 키의 평균보다 5cm 크고 몸무게는 아버지와 어머니의 몸무게의 평균보다 4.5kg 가볍다고 한다. 
//키와 몸무게를 멤버변수로 갖는 구조체를 정의하고 아버지와 어머니의 키와 몸무게를 입력받아 학생의 키와 몸무게를 출력하는 프로그램을 작성하시오. 
//키는 정수미만 버림하고 몸무게는 반올림하여 소수 첫째자리까지 나타낸다.

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Parent[] p = new Parent[2]; 
		
		
		for(int i=0; i<p.length; i++) {
			double height = sc.nextDouble();
			double weight = sc.nextDouble();
			p[i] = new Parent(height, weight);
			
		}
		
		sc.close();
		
		double heightSum = 0;
		double weightSum = 0;
		
		for(int i=0; i<p.length;i++) {
			heightSum += p[i].getHeight();
			weightSum += p[i].getWeight();
		}
		
		
		double heightavg = (heightSum / p.length) + 5;
		double weightavg = (weightSum / p.length) - 4.5;
		
		System.out.println("height : " + (int)heightavg + "cm");
		System.out.printf("weight : " + "%.1f",weightavg);
		System.out.print("kg");
		

	}

}

class Parent{
	double height;
	double weight;
	
	public Parent(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	
	
	
	
	
}
