package ch05;

abstract class Animal { // �߻� class
	abstract String getName(); // �������̵� �Ǳ� ������ �ڵ� �ۼ� ���ʿ�
}

class Mouse extends Animal {
	final String NAME = "��";

	@Override
	String getName() {
		return NAME;
	}
}

class Dog extends Animal {
	final String NAME = "������";

	@Override
	String getName() {
		return NAME;
	}
}

class Cat extends Animal {
	final String NAME = "�����";

	@Override
	String getName() {
		return NAME;
	}

}

class Bird extends Animal {
	final String NAME = "��";

	@Override
	String getName() {
		return NAME;
	}
}

public class AnimalEx01 {

	static void attack(Animal u1, Animal u2) { // �޼ҵ带 ���ؼ� ����
		System.out.println(u1.getName() + "�� " + u2.getName() + "���� ���� ���߽��ϴ�.");
	}

	public static void main(String[] args) {
		Dog d1 = new Dog(); // Dog �� Animal ��
		Cat c1 = new Cat(); // Cat �� Animal ��
		Bird b1 = new Bird(); // Bird �� Animal ��

		System.out.println(d1.NAME + " ź��");
		System.out.println(c1.NAME + " ź��");
		System.out.println(b1.NAME + " ź��");

		// ������ vs �����
		attack(d1, c1);

		// ������ vs ��
		attack(b1, d1);

		// ����� vs ��
		attack(c1, b1);

	}
}
