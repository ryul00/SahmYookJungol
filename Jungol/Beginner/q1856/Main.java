package q1856;

//사각형의 높이 n과 너비 m을 입력받은 후, 사각형 내부에 지그재그 형태로 1부터 n*m번까지 숫자가 차례대로 출력되는 프로그램을 작성하시오. 


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		int arr[][] = new int [n][m];
		int num = 1; // 배열 내 실제 값 초기화
		
		
		// 배열 구성
		for(int i=0;i<n;i++) {
			if(i % 2 == 0) {
				for(int j=0;j<m;j++) {
					arr[i][j] = num;
					num++;
					
				}	
			}else {
				for(int j=m-1; j>=0; j--) {
					arr[i][j] = num;
					num++;
				}
			}
			
		}
		
		// 값 출력 -> 배열 구성과 출력을 동일한 반복문에 진행하지 않는다!
		for(int i=0;i<n;i++) {
			for(int j=0; j<m;j++) {
				System.out.printf(arr[i][j] + " ");
			}
			System.out.println();
		}
		 
	}

}
