package q555;

import java.util.Scanner;
import java.io.*;

public class Main {

	// Scanner 사용 
	public static void main(String[] args)throws IOException {
	Scanner sc = new Scanner(System.in);
	String[] ar = new String[10]; // 배열 생성, [요소개수=배열크기]
	for(int i = 0; i < ar.length; i++ ) {
		ar[i] = sc.next(); // 입력받은 문자열을 배열에 저장한다.
		System.out.print(ar[i]);
	}
	sc.close();
	
	// BufferedReader / BufferedWriter 사용
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String input[] = br.readLine().split(" ");
    for(int i=0;i < input.length;i++){
        bw.write(String.valueOf(input[i]));
    }
    bw.flush();
	bw.close();
			
	}

}
