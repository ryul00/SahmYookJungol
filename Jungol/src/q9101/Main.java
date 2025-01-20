package q9101;

import java.util.jar.Attributes.Name;

public class Main {
	public static void Name(int n) {
		if(n==0) {
			return;
		}else {
			System.out.println("홍길동");
			Name(n-1);
		}
	}

	public static void main(String[] args) {
		int n = 10;
		Name(n);
		

	}

}
