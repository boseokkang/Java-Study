package gsontest;

import com.google.gson.Gson;

public class GsonEx02 {

	public static void main(String[] args) { // 한글이라서 변경 불가 ▶ GsonEx03
		String jsonPerson = "{\"이름\":\"홍차\",\"나이\":25,\"성별\":\"여\",\"주소\":\"서울특별시 양천구 목동\",\"특기\":[\"농구\",\"도술\"],\"가족관계\":{\"샵\":2,\"아버지\":\"홍판서\",\"어머니\":\"춘섬\"},\"회사\":\"경기 수원시 팔달구 우만동\"}\r\n" + 
				"";
		
		Gson gson = new Gson();
		
	}

}
