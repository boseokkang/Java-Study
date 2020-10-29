package ch13;

abstract class Ani {
	abstract void sound();
}

class Cat extends Ani {
	@Override
	void sound() {
		System.out.println("야옹");

	}
}

class Bird extends Ani {
	@Override
	void sound() {
		System.out.println("짹짹");
	}
}

class Fish extends Ani {
	@Override
	void sound() {
		System.out.println("뻐끔");
	}
}

public class AnomyEx04 {

	static void start(Ani a) {
		a.sound();
	}

	public static void main(String[] args) {
		start(new Cat()); 
		start(new Fish());
		start(new Ani() {
			// 함수 구현시 동적일 때 익명 클래스를 사용한다. 익명으로 만들면서 바로 구현!
			@Override
			void sound() {
				System.out.println("음메");
			}
		});

	}

}
