package ch13;

// 새로운 스레드
// OS 는 Runnable 타입의 heap 공간에 run 메소드를 호출해야 한다는 것을 알고 있음 (약속)
class Sub implements Runnable {

	// 스레드 이름 정해져 있어서 내 마음대로 정할 수 없다.
	// void hello() {
	// }

	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println("서브 쓰레드 : " + i);
			try {
				Thread.sleep(1000); // 1초 간격으로 실행
			} catch (Exception e) { // 부모 타입으로 적기 - Exception 통일
				e.printStackTrace();
			}
		}

	}
}

public class ThreadEx01 {

	// 메인 쓰레드
	public static void main(String[] args) {
		Sub s = new Sub();
		Thread t1 = new Thread(s); // new Sub에 있는 run() 알려줌
		t1.start(); // OS 한테 스레드 요청

		for (int i = 1; i < 6; i++) {
			System.out.println("메인 쓰레드 : " + i);
			try {
				Thread.sleep(1000); // 1초 간격으로 실행
			} catch (Exception e) { // 부모 타입으로 적기 - Exception 통일
				e.printStackTrace();
			}

		}

	}
}
