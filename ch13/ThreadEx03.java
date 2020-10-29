package ch13;

interface Callback { // 메소드를 넘기기 위해서 짠 코드
	void printMoney(int money);
}

class MoneyChange {
	int money = 10000;

	public void accept(Callback callback) {
		// 메인 스레드 1
		// 은행에 인출 요청 → 20000원 받을 예정 (2초 소요)
		new Thread(new Runnable() { // 타겟 생성
			// 새로운 스레드가 실행함
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
					money = money + 20000; // 비동기 - 2초 소요 시간동안 처리
					callback.printMoney(money); // printMoney 는 아래의 printMoney 넘어감
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			// 메인 스레드 2
		}).start(); // t1 생략
	}
}

public class ThreadEx03 {

	public static void main(String[] args) {
		MoneyChange mc = new MoneyChange();
		mc.accept(new Callback() {
			@Override
			public void printMoney(int money) {
				System.out.println("통장의 잔액은 " + money + "원 입니다.");
			}
		});

		for (int i = 1; i < 6; i++) {
			System.out.println("메인 쓰레드 : " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
