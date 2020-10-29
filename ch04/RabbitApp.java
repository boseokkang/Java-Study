package ch04;

class Rabbit {
	private String name; // = 속성, heap 변수, 전역 변수, 멤버 변수, 필드, 프로퍼티
	private int power; 

	public Rabbit(String name, int power) {
		this.name = name;
		this.power = power;
	}

	// 행동 => 책임
	boolean drink() {  
		// 100이 넘어가면 동작하지 않도록!
		if (power == 100) {
			return false; // false가 걸리면 다시 아래로 복귀
		}
		power++;
		return true;
	}

	public int getPower() { // 값을 읽기만 하는 것이니 안전 -> public
		return power; // 같은 클래스 내부에 있으니 power 변수에 접근 가능
	}

	void setName(String name) { // 메소드 안의 변수는 일반 변수, 지역변수
		this.name = name; // 생성자는 최초의 객체가 만들어졌을 때 쓰는 것이고 지금은 수정
	}
	
	public String getName() {
		return name;
	}
}

public class RabbitApp {

	public static void main(String[] args) {
		Rabbit r1 = new Rabbit("토끼", 20); // 100이 max
		// System.out.println(r1.getPower()); // 위의 getPower return
		while (r1.drink()) {
		} // true 일 때까지 계속 호출함
		System.out.println(r1.getPower());
		
		// 이름 변경하기 
		r1.setName("산토끼");
		System.out.println(r1.getName());

	}
}
