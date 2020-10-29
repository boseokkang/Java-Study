package ch03;

public class Cal {
	
	// 전역공간(메소드 입력 공간)
	static int add(int n1, int n2) {
		int result = n1 + n2;
		// System.out.println("result : " + result);
		return result; // return 가장 마지막에!!
	}

	// minus (매개 변수는 int형 2개) (return은 int형)
	static int minus(int n3, int n4) {
		int result = n3 - n4;
		return result;
	}

	// multi
	static int multi(int n5, int n6) {
		int result = n5 * n6;
		return result;
	}

	// divide
	static int divide(int n7, int n8) {
		int result = n7 / n8;
		return result;
	}

	public static void main(String[] args) {

	
	}

}
