package coffeeshop;

import java.util.ArrayList;

import lombok.Data;

// 책임 : 메뉴 선택 
@Data
public class Menu {

	// 메뉴 아이템들 (컬렉션)
	private ArrayList<MenuItem> menuItems; // 변수니까 직접 접근 못하게 private

	private Menu(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	public MenuItem 메뉴선택(String menuName) { // MenuItem을 리턴
		for (MenuItem menuItem : menuItems) {
			if (menuItem.getName().equals(menuName)) {
				return menuItem;
			}
		}
		return null;
	}
}
