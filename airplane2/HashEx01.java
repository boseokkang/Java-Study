package airplane2;

import java.util.HashMap;

public class HashEx01 {

	public static void main(String[] args) {
		HashMap<String, String> auth =
				new HashMap<>();
		
		auth.put("아이디", "mink330");
		auth.put("비밀번호", "1234");
		
		System.out.println(auth.get("아이디")); // 해쉬 key 주소는 유일하다 = Primary Key
	}

}
