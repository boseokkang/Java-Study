package coffeeshop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Ŭ���� �ڷ��� :  Beans. å�� ����. �����͸� �����ϴ� Object
@Data // Getter Setter
@NoArgsConstructor // �Ű����� ���� ������
@AllArgsConstructor // �Ű����� �ִ� ������
public class MenuItem {
	private String name;
	private int price;

}
