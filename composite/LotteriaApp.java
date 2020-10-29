package composite;

public class LotteriaApp {
	public static void main(String[] args) {
		// BigBurgerSet 추가
		BigBurgerSet set1 = new BigBurgerSet();

		// Burger 추가
		Burger burger1 = new Burger();

		// Coke 추가
		Coke coke1 = new Coke();

		// BigBurgerSet 추가, 버거 1000원 할인 쿠폰
		BigBurgerSet set2 = 
				new BigBurgerSet(
						new BigBurger(3000, "빅 버거 할인"),
						new Coke(), 
						new FrenchFried()
						);
		System.out.println(set1.getBigburger().getPrice());
		System.out.println(set2.getBigburger().getPrice());
		System.out.println();
		// BigBurgerSet 추가, 버거 2000원 할인 쿠폰
		BigBurgerSet set3 = 
				new BigBurgerSet(
						new BigBurger(2000, "빅 버거 할인")
						);
		System.out.println(set3.getBigburger().getPrice());

		// 새우버거 세트 추가
		ShrimpBurgerSet set4 = 
				new ShrimpBurgerSet();
		System.out.println(set4.getShrimpburger().getPrice());
	}
}
