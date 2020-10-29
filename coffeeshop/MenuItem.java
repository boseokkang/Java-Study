package coffeeshop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 클래스 자료형 :  Beans. 책임 없음. 데이터만 존재하는 Object
@Data // Getter Setter
@NoArgsConstructor // 매개변수 없는 생성자
@AllArgsConstructor // 매개변수 있는 생성자
public class MenuItem {
	private String name;
	private int price;

}
