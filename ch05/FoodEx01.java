package ch05;

// 추상 클래스가 되면 new 할 수 없다.  Object 가 아니기 때문에! 
// 추상 클래스는 추상 메소드를 가질 수 있다. 
// 추상 클래스, 추상 메소드를 만들면 자식 class 에 강제성을 부여해 
// 오류없이 편하게 쓸 수 있다. 
abstract class Food1 {
	abstract void eat(); // 쓰지 않기 때문에 중괄호 삭제
}

class 라면1 extends Food1 { // extends 강제성 부여

	String name = "라면1";

	@Override
	void eat() {
		System.out.println(name + "을 먹었습니다.");
	}

}

class 불고기1 extends Food1 {

	String name = "불고기1";

	@Override
	void eat() {
		System.out.println(name + "을 먹었습니다.");
	}

}

class 갈비1 extends Food1 {

	String name = "갈비1";

	@Override
	void eat() {
		System.out.println(name + "을 먹었습니다.");
	}

}

public class FoodEx01 {

	static void start(Food1 f) {
		f.eat();
	}
	public static void main(String[] args) {
		start(new 라면1()); // heap을 바로 위의 메소드로 넘겨줌 
	}

}
