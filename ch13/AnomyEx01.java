package ch13;

// 규약!
interface Animal {
	void move(); // 추상 메소드 public abstract 생략 (추상적이니까 Obj X = new 메모리 X)
}

abstract class Person {
	abstract void eat();
}

public class AnomyEx01 {

	public static void main(String[] args) {

		// Animal a = new Animal(); 추상 메소드가 구현되어 있지 않아서 new 할 수 없다.
		// Person p = new Person(); 추상 메소드가 구현되어 있지 않아서 new 할 수 없다.
		// Person p2 = new Person(); 추상 클래스는 추상 메소드가 들어올 수 있기 때문에 new를 막아둔다.

	}

}
