package airplane;

import java.util.HashMap;

public class HashEx01 {

	public static void main(String[] args) {
		HashMap<String, String> auth = new HashMap<>();

		auth.put("���̵�", "mink330");
		auth.put("��й�ȣ", "1234");

		System.out.println(auth.get("���̵�")); // �ؽ� key �ּҴ� �����ϴ� = Primary Key
	}

}
