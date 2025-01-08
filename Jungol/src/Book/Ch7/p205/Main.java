package Book.Ch7.p205;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Math math = new Math();
		int arr[] = {9,5,24,13,3,21};
		int max = math.max(arr);
		int min = math.min(arr);
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		

	}

}

class Math{
	public int max(int[] arr) {
		int max = 0;
		for(int i=0; i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public int min(int[] arr) {
		int min = 25;
		for(int i=0; i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
}
