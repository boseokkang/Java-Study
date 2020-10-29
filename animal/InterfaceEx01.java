package animal;

// 1. 변수 : public static final 생략
// 2. 함수 : public abstract 생략
// 3. 통로의 역할 - 동적 바인딩
// 4. 무조건 추상 메소드만 존재 가능 = 강제성 부여 / 내가 만든 메소드를 반드시 구현해라 
// 5. new 할 수 없다. 자식을 new 해서 같이 띄우는 방법 뿐. 

interface Cal {
	int num = 10;
}

public class InterfaceEx01 {

	public static void main(String[] args) {
		System.out.println(Cal.num);
	}

}
