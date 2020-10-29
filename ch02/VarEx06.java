package ch02;

class Person {
	String name = "최민경";
	int age = 28;
	char gender = '여';
	String email = "minkky330@gmail.com";
	String phone = "01039317310"; // int phone으로 입력시 앞의 0이 빠진 채로 출력된다. 
}

public class VarEx06 {
	public static void main(String[] args) {
		Person a = new Person();
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.gender);
		System.out.println(a.email);
		System.out.println(a.phone);
	}
}
