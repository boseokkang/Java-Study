package coffeeshop;

import lombok.Data;

@Data
public class Coffee {

	private String name;
	private int price;

	public Coffee(MenuItem menuItem) { // 메뉴에 있는 아이템만 만들 수 있다! 따라서 빈 생성자도 필요 없음
		this.name = menuItem.getName();
		this.price = menuItem.getPrice();
	}

}
