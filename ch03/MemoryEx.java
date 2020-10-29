package ch03;

	class 자판기 {

	static String cola = "코카콜라";
	static String water = "물";

	static String 작동(int money) {
		System.out.println("자판기가 작동합니다.");
		System.out.println(money + "원을 받았습니다.");
		return cola;
	}
	}

	class MemoryExample {

	int money = 500;

	int 용돈받기(String msg) {
		System.out.println(msg);
		System.out.println("용돈을 받았습니다.");
		return money;
	}

	public static void main(String[] args) {
		MemoryExample me = new MemoryExample();
		int money = me.용돈받기("아빠 만수무강하세요.");
		String output = 자판기.작동(money);
		System.out.println(output + "를 받았습니다. 잘 마실께요!!");
	}
	}
