package ch02;

class Person {
	String name = "�ֹΰ�";
	int age = 28;
	char gender = '��';
	String email = "minkky330@gmail.com";
	String phone = "01039317310"; // int phone���� �Է½� ���� 0�� ���� ä�� ��µȴ�. 
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
