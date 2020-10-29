package ch05;

// �߻� Ŭ������ �Ǹ� new �� �� ����.  Object �� �ƴϱ� ������! 
// �߻� Ŭ������ �߻� �޼ҵ带 ���� �� �ִ�. 
// �߻� Ŭ����, �߻� �޼ҵ带 ����� �ڽ� class �� �������� �ο��� 
// �������� ���ϰ� �� �� �ִ�. 
abstract class Food1 {
	abstract void eat(); // ���� �ʱ� ������ �߰�ȣ ����
}

class ���1 extends Food1 { // extends ������ �ο�

	String name = "���1";

	@Override
	void eat() {
		System.out.println(name + "�� �Ծ����ϴ�.");
	}

}

class �Ұ��1 extends Food1 {

	String name = "�Ұ��1";

	@Override
	void eat() {
		System.out.println(name + "�� �Ծ����ϴ�.");
	}

}

class ����1 extends Food1 {

	String name = "����1";

	@Override
	void eat() {
		System.out.println(name + "�� �Ծ����ϴ�.");
	}

}

public class FoodEx01 {

	static void start(Food1 f) {
		f.eat();
	}
	public static void main(String[] args) {
		start(new ���1()); // heap�� �ٷ� ���� �޼ҵ�� �Ѱ��� 
	}

}
