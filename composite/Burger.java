package composite;

import lombok.Data;

@Data // Getter, Setter 생성
public class Burger {
	private int price;
	private String desc;

	public Burger() { // 고정 가격
		this(1500, "기본 버거");
	}

	// 최종 목적지
	public Burger(int price, String desc) { // new 할 때마다 인수로 들어감 - 세일기간 행사
		this.price = price;
		this.desc = desc;
		System.out.println(desc + "가 만들어졌습니다.");
	}

}
