package animal;

interface Animal {
	void run();

	void sound();
}

class Dog implements Animal {

	@Override
	public void run() {
		System.out.println("강아지 달린다.");
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Bird implements Animal {

	@Override
	public void run() {
		System.out.println("새는 달린다.");
	}

	@Override
	public void sound() {
		System.out.println("짹짹");

	}

	public void fly() {
		System.out.println("새는 난다.");

	}
}

public class AnimalEx02 {

	static void start(Animal a) {
		a.run();
		a.sound();
		if (a instanceof Bird) {
			// fly 메소드를 가진 놈이라는 걸 확신
			((Bird)a).fly();
		}
	}

	public static void main(String[] args) {
		start(new Dog());
		start(new Bird());

	}
}
