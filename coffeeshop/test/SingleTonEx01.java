package coffeeshop.test;

class 대통령 {
	private static 대통령 instance = new 대통령();

	public static 대통령 getInstance() {
		return instance;
	}

	private 대통령() {
	}
}

public class SingleTonEx01 {

	public static void main(String[] args) {
		대통령 d1 = 대통령.getInstance();
		대통령 d2 = 대통령.getInstance();
	}
}
