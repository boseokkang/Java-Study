package ch04;

class Rabbit {
	private String name; // = �Ӽ�, heap ����, ���� ����, ��� ����, �ʵ�, ������Ƽ
	private int power; 

	public Rabbit(String name, int power) {
		this.name = name;
		this.power = power;
	}

	// �ൿ => å��
	boolean drink() {  
		// 100�� �Ѿ�� �������� �ʵ���!
		if (power == 100) {
			return false; // false�� �ɸ��� �ٽ� �Ʒ��� ����
		}
		power++;
		return true;
	}

	public int getPower() { // ���� �б⸸ �ϴ� ���̴� ���� -> public
		return power; // ���� Ŭ���� ���ο� ������ power ������ ���� ����
	}

	void setName(String name) { // �޼ҵ� ���� ������ �Ϲ� ����, ��������
		this.name = name; // �����ڴ� ������ ��ü�� ��������� �� ���� ���̰� ������ ����
	}
	
	public String getName() {
		return name;
	}
}

public class RabbitApp {

	public static void main(String[] args) {
		Rabbit r1 = new Rabbit("�䳢", 20); // 100�� max
		// System.out.println(r1.getPower()); // ���� getPower return
		while (r1.drink()) {
		} // true �� ������ ��� ȣ����
		System.out.println(r1.getPower());
		
		// �̸� �����ϱ� 
		r1.setName("���䳢");
		System.out.println(r1.getName());

	}
}
