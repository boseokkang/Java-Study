package ch01;

public class OperEx01 {

	public static void main(String[] args) {
		int n1, n2;
		n1 = 5;
		n2 = 3;

		// ctrl + s (컴파일) -> shift + F10
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 / n2); // 둘 다 int라서 형변환 안됨
		System.out.println(n1 * n2);
		System.out.println(n1 % n2);
	}

}
