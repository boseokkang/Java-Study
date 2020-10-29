package ch05;

abstract class Animal { // 추상 class
	abstract String getName(); // 오버라이딩 되기 때문에 코드 작성 불필요
}

class Mouse extends Animal {
	final String NAME = "쥐";

	@Override
	String getName() {
		return NAME;
	}
}

class Dog extends Animal {
	final String NAME = "강아지";

	@Override
	String getName() {
		return NAME;
	}
}

class Cat extends Animal {
	final String NAME = "고양이";

	@Override
	String getName() {
		return NAME;
	}

}

class Bird extends Animal {
	final String NAME = "새";

	@Override
	String getName() {
		return NAME;
	}
}

public class AnimalEx01 {

	static void attack(Animal u1, Animal u2) { // 메소드를 통해서 접근
		System.out.println(u1.getName() + "가 " + u2.getName() + "에게 공격 당했습니다.");
	}

	public static void main(String[] args) {
		Dog d1 = new Dog(); // Dog 와 Animal 뜸
		Cat c1 = new Cat(); // Cat 과 Animal 뜸
		Bird b1 = new Bird(); // Bird 와 Animal 뜸

		System.out.println(d1.NAME + " 탄생");
		System.out.println(c1.NAME + " 탄생");
		System.out.println(b1.NAME + " 탄생");

		// 강아지 vs 고양이
		attack(d1, c1);

		// 강아지 vs 새
		attack(b1, d1);

		// 고양이 vs 새
		attack(c1, b1);

	}
}
