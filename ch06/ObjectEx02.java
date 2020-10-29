package ch06;

class Person {
	String name = "홍길동";
	int age = 15;
	String job = "학생";

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
		// toString() 모든 것을 문자로 바꿀 수 있다. 모든 Object 는 toString() 사용 가능
		Integer num = 10;
		// String s = Integer.toString(num);
		String s = num.toString(num);
		System.out.println(s);

		Person p = new Person();
		System.out.println(p.toString());
		// 자바에서는 객체를 호출하면 자동으로 toString 실행
		System.out.println(p);

		StringBuilder sb = new StringBuilder();
		sb.append("안녕");
		sb.append("반가워");

		System.out.println(sb);
		System.out.println(sb.toString());

	}

}
