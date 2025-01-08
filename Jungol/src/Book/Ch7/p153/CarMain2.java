package Book.Ch7.p153;

import javax.security.auth.callback.ConfirmationCallback;

public class CarMain2 {

	public static void main(String[] args) {
		Car[] cars = new Car[3]; // stack에 Car 생성 -> Heap에 크기 3짜리 배열 할당
		
		Car tico = new Car(); // Stack에 tico 생성 -> Heap에 color,company,type 영역 할당
		tico.color = "화이트";
		tico.company = "대우";
		tico.type = "경차";
		
		for(int i=0;i<cars.length;i++) { // Null로 초기화되어 할당 된 배열의 주소를 tico와 동일하게 설정 
			cars[i] = tico;
		}
		System.out.println("2번 인덱스 color : " + cars[2].color);
		cars[0].color = "블랙";
		
		System.out.println("2번 인덱스 color : " + cars[2].color);

	}

}
