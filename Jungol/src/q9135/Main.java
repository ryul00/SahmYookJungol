package q9135;

import java.util.Scanner;

//5명의 저축액을 입력받아 저축왕의 번호와 저축액을 출력하는 프로그램을 작성하시오. 

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(i+1 + "번 저축금액은?");
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		Math math = new Math();
		int max = math.max(arr);
//		int min = math.min(arr);
		int num = math.num(arr);
		
		System.out.println("저축왕 " + num + "번 " + max + "원");
//		System.out.println(min);
		
		
		
		
		
		

	}

}
class Math{
	public int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
//	public int min(int[] arr) {
//		int min = Integer.MAX_VALUE;
//		for(int i=0; i<arr.length;i++) {
//			if(min > arr[i]) {
//				min = arr[i];
//			}
//		}
//		return min;
//	}
//	
	public int num(int[] arr) {
		int num = 0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if (arr[i] == max) {
				num = i+1;
			}
		}
		return num;
		
	}
	
	
	
}
