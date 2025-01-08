package q9135;

import java.util.Scanner;



public class Main2 {

	public static void main(String[] args) {
		Person person = new Person();
		person.inputData();
		String result = person.findMin();
		
		System.out.println(result);
		

	}

}

class Person {
	// 멤버 선언
	private int[] heights;
	private String[] names;
	private final int size = 5;
	
	// 배열 초기화
	public Person() {
		heights = new int[size];
		names = new String[size];
	}
	
	// 입력 받기
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<size;i++) {
			String name = sc.next();
			int height = sc.nextInt();
			names[i] = name;
			heights[i] = height;
		}
		sc.close();
	}
	
	// 최소값 찾기
	public String findMin() {
		int minHeight = Integer.MAX_VALUE;
		String minName = "";
		for(int i=0; i<size; i++) {
			if(minHeight > heights[i]) {
				minHeight = heights[i];
				minName = names[i];
			}
		}
		
		
	// 결과 반환
		return minName + " " + minHeight;
	}
}






