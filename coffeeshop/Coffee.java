package coffeeshop;

import lombok.Data;

@Data
public class Coffee {

	private String name;
	private int price;

	public Coffee(MenuItem menuItem) { // �޴��� �ִ� �����۸� ���� �� �ִ�! ���� �� �����ڵ� �ʿ� ����
		this.name = menuItem.getName();
		this.price = menuItem.getPrice();
	}

}
