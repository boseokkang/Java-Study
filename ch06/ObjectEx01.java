package ch06;

class Animal {
	@Override
	public int hashCode() {
		return super.hashCode();
		// return 1111; 재정의하면 원하는 해쉬 코드로 만들 수 있다.
	}
}

public class ObjectEx01 {

	public static void main(String[] args) {
		// String 은 Object 상속 받고 있다.
		String d1 = "물";
		String d2 = "물";

		System.out.println(d1.equals(d2));
		System.out.println(d1 == d2);

		// new 하면 각각 다른 주소에 들어간다.
		String d3 = new String("물");
		String d4 = new String("물");

		System.out.println(d3.equals(d4));
		System.out.println(d3 == d4);

		System.out.println(d3.getClass()); // 클래스의 정보 : 경로와 이름을 리턴
		System.out.println(new ObjectEx01().getClass());

		// 해쉬 코드 → 해쉬 알고리즘 : 어떠한 값이든 동일한 길이의 숫자로 리턴
		// d3 와 d4 의 주소는 다르기 때문에 hashCode 값도 다를 것이다.
		// 같은 값 나오는 이유 : String 은 hashCode 를 재정의함
		System.out.println(d3.hashCode());
		System.out.println(d4.hashCode());

		Animal a1 = new Animal();
		Animal a2 = new Animal();

		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());

		System.out.println(a1 instanceof Animal);
		System.out.println(a2 instanceof Animal);

	}

}
