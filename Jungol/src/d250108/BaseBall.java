package d250108;

import java.util.Iterator;
import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		int[] ar = new int[3];
		int[] my = new int[3];
		Scanner sc = new Scanner(System.in);
		int stc = 0;
		int bc = 0;
		
		// 중복 제외 난수 배열 생성
		boolean b; 
		do {
			for(int i=0; i<ar.length; i++) {
				ar[i] = (int) (Math.random()*9)+1;
			}
			
			b=false;
			for(int i=0;i<ar.length;i++) {
				for(int j=0; j<ar.length; j++) {
					if(ar[i] == ar[j] && i!=j) {
						b=true;
					}
				}
			}
			
		} while (b);

		
		
	// Strike / Ball 판정
		while(true) {
			System.out.println("숫자를 입력하세요 : ");
			for(int i=0; i<my.length;i++) {
				my[i] = sc.nextInt();
				
			}
			for(int i=0; i<ar.length;i++) {
				for(int j=0; j<my.length;j++) {
					if(ar[i] == my[j] && i == j) {
						stc++;
					}
					else if(ar[i]==my[j] && i!=j) {
							bc++;
					}
				}
			}
			System.out.println(stc + " 스트라이크" );
			System.out.println(bc + " 볼");
			if(stc == 0 && bc == 0) {
				System.out.println("아웃입니다. 멍청이세요?");
			}
			if(stc == 3) {
				System.out.println("승리하였습니다.");
				break;
			}
			stc = 0;
			bc = 0;
			}	
		sc.close();
		}


}
