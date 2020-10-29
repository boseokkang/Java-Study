package composite;

import lombok.Data;

@Data // Getter, Setter ����
public class Burger {
	private int price;
	private String desc;

	public Burger() { // ���� ����
		this(1500, "�⺻ ����");
	}

	// ���� ������
	public Burger(int price, String desc) { // new �� ������ �μ��� �� - ���ϱⰣ ���
		this.price = price;
		this.desc = desc;
		System.out.println(desc + "�� ����������ϴ�.");
	}

}
