package ch06;

class Person {
	String name = "ȫ�浿";
	int age = 15;
	String job = "�л�";

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", job=" + job + "]";
	}

//	@Override
//	public String toString() {
//		return super.toString();

}

public class ObjectEx02 {

	public static void main(String[] args) {
		// toString() ��� ���� ���ڷ� �ٲ� �� �ִ�. ��� Object �� toString() ��� ����
		Integer num = 10;
		// String s = Integer.toString(num);
		String s = num.toString(num);
		System.out.println(s);

		Person p = new Person();
		System.out.println(p.toString());
		// �ڹٿ����� ��ü�� ȣ���ϸ� �ڵ����� toString ����
		System.out.println(p);

		StringBuilder sb = new StringBuilder();
		sb.append("�ȳ�");
		sb.append("�ݰ���");

		System.out.println(sb);
		System.out.println(sb.toString());

	}

}
