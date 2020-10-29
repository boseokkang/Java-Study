package array03;

public class WhileTest01 {
	public static void main(String[] args) {
		int destination = 11271;
		int speed = 3;
		int car = 0;
		int i = 1;
		while (destination != car) {
			car = car + speed;
			i++;
		}
		System.out.println(i + "번");
		int min = i / 60;
		System.out.println(min + "분");
		int hour = min / 60;
		System.out.println(hour + "시간");

		double time = min;
		System.out.println(time / 60 + "시간");

		int real_min = min % 60;
		System.out.println(real_min + "분");

		System.out.println(hour + "시간" + real_min + "분");

	}

}
