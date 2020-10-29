package ch05;

// 추상 클래스는 추상 메소드와 일반 메소드 둘 다 가질 수 있다.
// 추상 클래스는 내가 구현할 수 없는 메소드를 Object에게 미룰 수 있다. 
// 추상 클래스는 abstract 를 붙인다.
// 추상 클래스를 통해서 순서를 정할 수 있다. 
abstract class Food {

	abstract void standby();

	void eat() {
		System.out.println("음식을 먹었습니다.");
	}

	abstract void cook();

	void auto() {
		standby();
		cook();
		eat();
	}
}

class 라면 extends Food {

	@Override
	void cook() {
		System.out.println("냄비에 끓입니다.");
	}

	@Override
	void standby() {
		System.out.println("라면과 가스와 냄비를 준비합니다.");
	}

}

class 삼겹살 extends Food {

	@Override
	void cook() {
		System.out.println("불판에 굽습니다.");
	}

	@Override
	void standby() {
		System.out.println("불판과 고기와 버너를 준비합니다.");
	}

}

public class FoodEx02 {

	static void start(Food f) {
		f.auto();
	}

	public static void main(String[] args) {
		start(new 라면());
	}

}
