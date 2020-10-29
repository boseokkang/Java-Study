package composite;

import lombok.Data;

@Data
public class Coke {
	private int price;
	private String desc;

	public Coke() { // 기본 생성자 - 고정 가격
		this(1500, "코카콜라");
	}

	public Coke(int price, String desc) { // 가격 일시 변동시
		this.price = price;
		this.desc = desc;
		System.out.println(desc + "가 만들어졌습니다.");
	}
}
