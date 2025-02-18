package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int arr[] = new int [10];
		Scanner sc = new Scanner(System.in);
		int minNum = -1;
		int maxNum = 10000;
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < 100 && arr[i] > minNum ) {
				minNum = arr[i];
			}
			else if(arr[i] >= 100 && arr[i] < maxNum) {
				maxNum = arr[i];
			}			
		}
		sc.close();
		 
        if (minNum == -1) {
            minNum = 100;
        }
        if (maxNum == 10000) {
            maxNum = 100;
        }
		

		
		System.out.println(minNum + " " + maxNum);

	}

}
