package composite;

import lombok.Data;

@Data
public class FrenchFried {
	private int price;
	private String desc;

	public FrenchFried() {
		this(2000, "감자튀김");
	}

	public FrenchFried(int price, String desc) {
		this.price = price;
		this.desc = desc;
		System.out.println(desc + "이 만들어졌습니다.");
	}

}
