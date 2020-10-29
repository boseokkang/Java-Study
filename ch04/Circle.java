package ch04;

class CircleApp {
	private int radius; // 원의 반지름
	private String name; // 원의 이름

	public CircleApp(int radius, String name) { // 생성자
		this.radius = radius;
		this.name = name;
	}

	public void setName(String name) { // 이름 set 메소드
		this.name = name;
	}

	public String getName() { // 이름 get 메소드
		return name;
	}

	public void setRadius(int radius) { // 반지름의 set 메소드
		this.radius = radius;
	}

	public int getRadius() { // 반지름의 get 메소드
		return radius;
	}

	public double getArea() { // 원의 면적 계산 메소드
		return 3.14 * radius * radius;
	}
}

public class Circle {

	public static void main(String[] args) {
		CircleApp pizza = new CircleApp(10, "자바피자"); // Circle 객체 생성
//		pizza.radius = 10; // 피자의 반지름을 10으로 설정
//		pizza.name = "자바피자"; // 피자의 이름 설정
		String n = pizza.getName(); // 피자의 이름 변수
		double a = pizza.getArea(); // 피자의 면적 변수
		System.out.println(n + "의 면적은 " + a);

		CircleApp donut = new CircleApp(2, "자바도넛"); // Circle 객체 생성
//		donut.radius = 2; // 도넛의 반지름을 10으로 설정
//		donut.name = "자바도넛"; // 도넛의 이름 설정
		String m = donut.getName(); // 도넛의 이름 변수
		double b = donut.getArea(); // 도넛의 면적 변수
		System.out.println(m + "의 면적은 " + b);

	}

}
