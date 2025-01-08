package Book.Ch7.p167;

public class MethodCall {

	public static void main(String[] args) {
		Method.pringName(); // static 메서드는 인스턴스 생성 없이 바로 호출 가능 
		
		Method method = new Method();
		method.printEmail();

	}

}

class Method{
	static void pringName() {
		System.out.println("printName() 실행");
	}
	void printEmail() {
		System.out.println("printEmail() 실행");
	}
	void printId() {
		System.out.println("printId() 실행");
	}
}
