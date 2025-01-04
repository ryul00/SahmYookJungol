package q531;

import java.text.BreakIterator;

/*복싱체급은 몸무게가 

50.80kg 이하를 Flyweight, 

61.23kg 이하를 Lightweight, 

72.57kg 이하를 Middleweight, 

88.45kg 이하를 Cruiserweight, 

88.45kg 초과를 Heavyweight 라고 하자.
몸무게를 입력받아 체급을 출력하는 프로그램을 작성하시오*/

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		sc.close();
		
		int weight = (w <= 50.80) ? 1 :
					 (w <= 61.23) ? 2 :
					 (w <= 72.57) ? 3 :
					 (w <= 88.45) ? 4 : 5;
		
		switch (weight) {
		case 1: {
			System.out.println("Flyweight");
			break;
		}
		case 2: {
			System.out.println("Lightweight");
			break;
		}
		case 3: {
			System.out.println("Middleweight");
			break;
		}
		case 4: {
			System.out.println("Cruiserweight");
			break;
		}
		case 5:{
			System.out.println("Heavyweight");
			break;
		}
		

	}
	}

}
