package coffeeshop;

import java.util.ArrayList;

public class CoffeeApp {

	public static void main(String[] args) {
		// 메뉴, 바리스타, 손님
		Consumer consumer = new Consumer();
		Barista barista = new Barista();

		MenuItem m1 = new MenuItem("아메리카노", 1500);
		MenuItem m2 = new MenuItem("카페라떼", 2500);
		MenuItem m3 = new MenuItem("카푸치노", 3000);

		ArrayList<MenuItem> menuItems = new ArrayList<>();

		menuItems.add(m1); // 시작 번지 0번지
		menuItems.add(m2); // 1번지
		menuItems.add(m3); // 2번지

		// Menu menu = new Menu(menuItems);
		// System.out.println(menuItems.get(1).getName()); // 1번지에 m2 담았음

		// consumer.주문("카페라떼", menu, barista);
	}
}
