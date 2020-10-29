package ch05;

class Car {
	void run() {
		System.out.println("기본 움직임");
	}
}

class Sonata extends Car {
	void run() {
		// super.run();
		System.out.println("소나타만의 움직임");
	}
}


public class CarEx01 {

	public static void main(String[] args) {
		Car s1 = new Sonata();
		s1.run();
	}

}
