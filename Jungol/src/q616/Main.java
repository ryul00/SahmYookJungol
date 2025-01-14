package q616;

import java.util.Scanner;

class Triangle {
    private int[] point1, point2, point3;

    public Triangle() {
        point1 = new int[2];
        point2 = new int[2];
        point3 = new int[2];
    }
    
    public void PointInfo() {
    	Scanner sc = new Scanner(System.in);
    	for(int i=0; i<2;i++) {
    		point1[i] = sc.nextInt();
    	}
    	for(int i=0; i<2;i++) {
    		point2[i] = sc.nextInt();
    	}
    	for(int i=0; i<2;i++) {
    		point3[i] = sc.nextInt();
    	}
    	sc.close();
    }
    
 
    
    public double getCenterX() {
    	double centerX = (point1[0] + point2[0] + point3[0]) / 3.0;
    	return centerX;
    	
    }
    
    public double getCenterY() {
    	double centerY = (point1[1] + point2[1] + point3[1]) / 3.0;
		return centerY;
    }
	    
    
    
}

public class Main {
	public static void main(String[] args){
		
		Triangle tr = new Triangle();
		tr.PointInfo();
		System.out.print("(");
		System.out.print(String.format("%.1f", tr.getCenterX() ));
		System.out.print(", ");
		System.out.print(String.format("%.1f", tr.getCenterY()));
		System.out.print(")");

	}

}
