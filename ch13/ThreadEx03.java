package ch13;

interface Callback { // �޼ҵ带 �ѱ�� ���ؼ� § �ڵ�
	void printMoney(int money);
}

class MoneyChange {
	int money = 10000;

	public void accept(Callback callback) {
		// ���� ������ 1
		// ���࿡ ���� ��û �� 20000�� ���� ���� (2�� �ҿ�)
		new Thread(new Runnable() { // Ÿ�� ����
			// ���ο� �����尡 ������
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
					money = money + 20000; // �񵿱� - 2�� �ҿ� �ð����� ó��
					callback.printMoney(money); // printMoney �� �Ʒ��� printMoney �Ѿ
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			// ���� ������ 2
		}).start(); // t1 ����
	}
}

public class ThreadEx03 {

	public static void main(String[] args) {
		MoneyChange mc = new MoneyChange();
		mc.accept(new Callback() {
			@Override
			public void printMoney(int money) {
				System.out.println("������ �ܾ��� " + money + "�� �Դϴ�.");
			}
		});

		for (int i = 1; i < 6; i++) {
			System.out.println("���� ������ : " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
