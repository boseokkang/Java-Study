package ch05;

class A {
	void run() {
		System.out.println("A 달린다.");
	}
}

class B extends A {
	@Override
	void run() {
		System.out.println("B 달린다.");
	}
}

class C extends B {
	String name = "C";
	@Override
	void run() {
		System.out.println(name +" 달린다.");
	}
}

public class OverrideEx01 {

	public static void main(String[] args) {
		A a1 = new C(); // A B C 
		a1.run();
		
		A a2 = new A();
		a2.run();
		
		C c1 = new C();
		c1.run();
		
	
		// System.out.println(a1.name); // 변수로 접근하면 오류 
		// 함수로 접근 가능하다 -> 동적 바인딩
	}

}
