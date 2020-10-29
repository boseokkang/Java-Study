package ch05;

class A {
	void run() {
		System.out.println("A �޸���.");
	}
}

class B extends A {
	@Override
	void run() {
		System.out.println("B �޸���.");
	}
}

class C extends B {
	String name = "C";
	@Override
	void run() {
		System.out.println(name +" �޸���.");
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
		
	
		// System.out.println(a1.name); // ������ �����ϸ� ���� 
		// �Լ��� ���� �����ϴ� -> ���� ���ε�
	}

}
