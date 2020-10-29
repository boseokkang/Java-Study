package gsontest;

import com.google.gson.Gson;

class Person{ // 선언만 해도 gson이 알아서 new 해줌
	String 이름;
	int 나이;
	String 성별;
	String 주소;
	String[] 특기;
	Family 가족관계;
	String 회사;
}

class Family {
	int 샵;
	String 아버지;
	String 어머니;
}
public class GsonEx01 {

	public static void main(String[] args) {
		String jsonPerson = "{\"이름\":\"홍차\",\"나이\":25,\"성별\":\"여\",\"주소\":\"서울특별시 양천구 목동\",\"특기\":[\"농구\",\"도술\"],\"가족관계\":{\"샵\":2,\"아버지\":\"홍판서\",\"어머니\":\"춘섬\"},\"회사\":\"경기 수원시 팔달구 우만동\"}\r\n" + 
				"";
		
		Gson gson = new Gson();
		Person p = gson.fromJson(jsonPerson, Person.class);
		System.out.println(p.이름);
		System.out.println(p.가족관계.아버지);
	}

}
