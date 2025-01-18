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
// 이상적인 코드 
// package q9134;
//
// import java.util.Scanner;
//
// public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        // 첫 번째 점 입력
//        System.out.print("첫 번째 점의 좌표는? (x, y) ");
//        Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
//
//        // 두 번째 점 입력
//        System.out.print("두 번째 점의 좌표는? (x, y) ");
//        Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
//        
//        sc.close();
//
//        // 중심점 계산 및 출력
//        Point center = CenterCalculator.calculateCenter(p1, p2);
//        System.out.printf("중심점의 위치 = (%.1f, %.1f)%n", center.getX(), center.getY());
//    }
//}
//
//  하나의 점을 표현하는 클래스
// class Point {
//    private double x;
//    private double y;
//
//    // 생성자: 좌표를 입력받아 초기화
//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    // x 좌표 반환
//    public double getX() {
//        return x;
//    }
//
//    // y 좌표 반환
//    public double getY() {
//        return y;
//    }
//}
//
// 중심점 계산하는 클래스
// class CenterCalculator {
//
//    // 두 점의 중심 좌표를 계산하여 Point 객체로 반환
//    public static Point calculateCenter(Point p1, Point p2) {
//        double centerX = (p1.getX() + p2.getX()) / 2;
//        double centerY = (p1.getY() + p2.getY()) / 2;
//        return new Point(centerX, centerY); // 중심 좌표를 가진 새로운 Point 객체 반환
//    }
// }



