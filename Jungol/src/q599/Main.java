package q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		// replaceAll() 사용 풀이 
		// 모든 숫자 제거 표현식
		String match = "[0-9]";
		// 모든 특수문자 제거 표현식 
		String match2 =  "[^\uAC00-\uD7A30-9a-zA-Z]";
		
		// 모든 숫자제거
		String newStr1 = str.replaceAll(match,"");
		// 모든 특수문자 제거
		String newStr2 = newStr1.replaceAll(match2, "");
		
		// 대문자 변환 
		System.out.println(newStr2.toUpperCase());

	}

}
