package composite;

// 부모 Burger 는 물려받고 BigBurger 만의 정보를 추가
public class BigBurger extends Burger {

	public BigBurger() {
		super(4000, "빅 버거"); // 유동성이 없음 무조건 4천원 빅 버거만 만들 수 있음
	}

	public BigBurger(int price, String desc) {
		super(price, desc); // 변경하고 싶을 때만! new BigBurger(3000, "빅 버거 세일")
	}

}
