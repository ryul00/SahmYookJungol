package q9134;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Point p = new Point();
		
		System.out.print("중심점의 위치 = ");
		double c1 = p.getC1();
		double c2 = p.getC2();
		System.out.printf("(%.1f, ", c1);  
		System.out.printf("%.1f)", c2); 
	}

}

class Point{
	public double xs[];
	public double ys[];
		
	Scanner sc = new Scanner(System.in);
	public Point() {
		this.xs = new double[2]; 
		this.ys = new double[2]; 
		
		
		for(int i=0; i<xs.length; i++) {
			System.out.print("점의 좌표는?(x, y) ");
			xs[i] = sc.nextDouble();
			ys[i] = sc.nextDouble();
		}
		sc.close();
		
	}
	
	public double getC1() {
		return (xs[0] + xs[1])/2;
	}
	public double getC2() {
		return (ys[0] + ys[1])/2;
	}
	
	
}


