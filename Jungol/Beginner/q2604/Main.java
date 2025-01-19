package q2604;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		
		int height = 0;
		// 첫번째 높이는 무조건 10, 이후 이전과 같은 방향이면 +5, 다른 방향이면 +10 
			for(int i=0; i<inp.length(); i++) {
				if(i==0) {
					height += 10;
					
				}
				else if(i-1 >= 0 && inp.charAt(i) == inp.charAt(i-1)) {
					height += 5;
				}else {
					height += 10;
				}
			
	}
			System.out.println(height);
	}
}
