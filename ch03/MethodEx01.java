package ch03;

// 메소드(함수)는 메소드(함수) 안에 작성할 수 없다. 
// 메소드(함수)는 클래스 안에 작성할 수 있다.

public class MethodEx01 {


	public static void main(String[] args) {
		int num = Cal.add(5, 3);
		System.out.println("add 결과 : " + num);

		int num2 = Cal.minus(10, 5);
		System.out.println("minus 결과 : " + num2);

		int num3 = Cal.multi(3, 3);
		System.out.println("multi 결과 : " + num3);

		int num4 = Cal.divide(15, 5);
		System.out.println("divide 결과 : " + num4);
	}

}
