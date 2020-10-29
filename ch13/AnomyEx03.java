package ch13;

class Car {
	void run() { // 함수가 정적 - 익명 클래스 쓸 필요 X
		System.out.println("자동차는 달린다.");
	}
}

class Sonata extends Car {

}

class Granger extends Car {

}

public class AnomyEx03 {

	static void start(Car c) {
		c.run();
	}

	public static void main(String[] args) {
		start(new Sonata());
	}

}
