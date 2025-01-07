package q600;

import java.util.Scanner;

//공백을 포함한 100글자 이하의 문자열을 입력받아 문장을 이루는 단어의 개수를 출력하는 프로그램을 작성하시오.

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		int n = 0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				n+=1;
			}
			
		}
		System.out.println(n+1);

	}

}
