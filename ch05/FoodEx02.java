package ch05;

// �߻� Ŭ������ �߻� �޼ҵ�� �Ϲ� �޼ҵ� �� �� ���� �� �ִ�.
// �߻� Ŭ������ ���� ������ �� ���� �޼ҵ带 Object���� �̷� �� �ִ�. 
// �߻� Ŭ������ abstract �� ���δ�.
// �߻� Ŭ������ ���ؼ� ������ ���� �� �ִ�. 
abstract class Food {

	abstract void standby();

	void eat() {
		System.out.println("������ �Ծ����ϴ�.");
	}

	abstract void cook();

	void auto() {
		standby();
		cook();
		eat();
	}
}

class ��� extends Food {

	@Override
	void cook() {
		System.out.println("���� ���Դϴ�.");
	}

	@Override
	void standby() {
		System.out.println("���� ������ ���� �غ��մϴ�.");
	}

}

class ���� extends Food {

	@Override
	void cook() {
		System.out.println("���ǿ� �����ϴ�.");
	}

	@Override
	void standby() {
		System.out.println("���ǰ� ���� ���ʸ� �غ��մϴ�.");
	}

}

public class FoodEx02 {

	static void start(Food f) {
		f.auto();
	}

	public static void main(String[] args) {
		start(new ���());
	}

}
