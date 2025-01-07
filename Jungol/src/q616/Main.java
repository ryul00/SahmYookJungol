package q616;

import java.util.Scanner;

// 세 꼭지점이 (x1 y1), (x2 y2), (x3 y3)인 삼각형의 무게중심 = ((x1+x2+x3)/3 (y1+y2+y3)/3)

class Triangle{
	double x1,x2,x3,y1,y2,y3;
	
	public Triangle(double x1,double x2, double x3, double y1, double y2, double y3) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		sc.close();
		
		double center_x = (x1 + x2 + x3) / 3;
		double center_y = (y1 + y2 + y3) / 3;
		
		System.out.print("(");
		System.out.print(String.format("%.1f", center_x ));
		System.out.print("," + " ");
		System.out.print(String.format("%.1f", center_y));
		System.out.print(")");

	}

}
