package coffeeshop.test;

// Generic(일반적인) - 클래스 생성시 타입 결정
// E - Element, K - Key, V - Value, T - Type, N - Number
class Data<T> { // 제네릭 : 내가 객체를 만들 때 동적으로 런타임 때 형을 바꿀 수 있다.
	T value;
}

class Str<K, V> {
	K k;
	V v;
}

public class GenericEx01 {

	public static void main(String[] args) {
		Data<String> data = new Data<>();
		data.value = "문자열";
		System.out.println(data.value);

		// Wrapper 클래스 : 기본 자료형을 클래스화 시켜주는 기술
		Data<Integer> data2 = new Data<>(); // 레퍼런스 자료형만 가능
		data2.value = 10;
		System.out.println(data2.value);

		Str<String, String> s = new Str<>();
		s.k = "비밀번호";
		s.v = "bitc5500";

		System.out.println(s.k);
		System.out.println(s.v);
	}

}
