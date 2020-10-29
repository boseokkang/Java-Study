package ch13;

// ���ο� ������
// OS �� Runnable Ÿ���� heap ������ run �޼ҵ带 ȣ���ؾ� �Ѵٴ� ���� �˰� ���� (���)
class Sub implements Runnable {

	// ������ �̸� ������ �־ �� ������� ���� �� ����.
	// void hello() {
	// }

	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println("���� ������ : " + i);
			try {
				Thread.sleep(1000); // 1�� �������� ����
			} catch (Exception e) { // �θ� Ÿ������ ���� - Exception ����
				e.printStackTrace();
			}
		}

	}
}

public class ThreadEx01 {

	// ���� ������
	public static void main(String[] args) {
		Sub s = new Sub();
		Thread t1 = new Thread(s); // new Sub�� �ִ� run() �˷���
		t1.start(); // OS ���� ������ ��û

		for (int i = 1; i < 6; i++) {
			System.out.println("���� ������ : " + i);
			try {
				Thread.sleep(1000); // 1�� �������� ����
			} catch (Exception e) { // �θ� Ÿ������ ���� - Exception ����
				e.printStackTrace();
			}

		}

	}
}
