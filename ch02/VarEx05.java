package ch02;

class 동물 {
	String name = "사자";
	String color = "노랑";
	int speed = 100;
	char gender = '여';
}

public class VarEx05 {
	static int num = 10;

	public static void main(String[] args) {
		System.out.println("동물 생성 준비");
		System.out.println(VarEx05.num);

		동물 a = new 동물();
		System.out.println(a.name);
		System.out.println(a.color);
		System.out.println(a.speed);
		System.out.println(a.gender);
	}
}
