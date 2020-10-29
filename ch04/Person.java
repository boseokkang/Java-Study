package ch04;

// 상태와 행동
public class Person {
	String name;
	String job;
	int age;
	char gender;
	String bloodType;
	
	// 디폴트 생성자(매개변수가 없는 아이) = 초기화
	public Person() {
		
	}
	
	// 오버로딩
	// 매개변수가 있는 생성자 - 위의 디폴트 생성자와 다른 생성자와 움직인다. 
	public Person(String name, String job, int age, char gender, String bloodType) {
		this.name = name;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.bloodType = bloodType;
	
	}
	
}





