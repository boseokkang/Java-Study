package composite;

// �θ� Burger �� �����ް� BigBurger ���� ������ �߰�
public class BigBurger extends Burger {

	public BigBurger() {
		super(4000, "�� ����"); // �������� ���� ������ 4õ�� �� ���Ÿ� ���� �� ����
	}

	public BigBurger(int price, String desc) {
		super(price, desc); // �����ϰ� ���� ����! new BigBurger(3000, "�� ���� ����")
	}

}
