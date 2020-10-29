package stars.zerg;

import stars.Behavior;

public abstract class Zerg implements Behavior {
	public void move() {
		System.out.println("이동");
	}

	public void repair() {
		System.out.println("자연 치료");
	}

	public static void upgrade() {
		Hydra.attack++;
		Ultra.attack++;
		System.out.println("저그 업그레이드 완료");

	}
}