package coffeeshop;

// 책임 : 주문 
public class Consumer {

	public void 주문(String menuName, Menu menu, Barista barista) {

		// 손님 → 메뉴판에게 메시지를 보낸다. (메뉴 선택해줘)
		MenuItem menuItem = menu.메뉴선택(menuName);

		if (menuItem == null) {
			System.out.println(menuName + "는 우리 커피숍에 없습니다.");
		} else {
			// 손님 → 바리스타에게 메시지를 보낸다. (커피 생성해줘)
			Coffee coffee = barista.커피생성(menuItem);
			System.out.println("커피 나왔습니다.");
			System.out.println(coffee.getName());
			System.out.println(coffee.getPrice());
		}
	}
}
