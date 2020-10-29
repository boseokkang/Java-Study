package gsontest;

import com.google.gson.Gson;

// {"name":"코스", "age":40}
public class GsonEx03 {

	public static void main(String[] args) {
		// 1. 다운 받은 json 데이터
		String jsonData = "{\"name\":\"코스\", \"age\":40}";
		System.out.println(jsonData);

		// 2. json 데이터 → java 오브젝트 변환
		Gson gson = new Gson();
		People people = gson.fromJson(jsonData, People.class);
		System.out.println(people.getName());
		System.out.println(people.getAge());
	}

}
