package composite;

public class ShrimpBurger extends Burger {

	public ShrimpBurger() {
		super(5500, "새우 버거");
	}

	public ShrimpBurger(int price, String desc) {
		super(price, desc);
	}
}
