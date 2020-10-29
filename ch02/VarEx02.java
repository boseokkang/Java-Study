package ch02;

public class VarEx02 {

	public static void main(String[] args) {
		double myNum = 10.5; // 8Byte
		System.out.println(myNum);

		int num1 = (int) myNum; // 다운 캐스팅
		System.out.println(num1);

		int num2 = 10;
		double num3 = num2;
		System.out.println(num3);
	}

}
