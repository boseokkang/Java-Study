package ch13;




class DownloadThread implements Runnable{ // 강제성 부여 → run() 생성
	
	int data = 10000;
	
	@Override
	public void run() {
		try {
			Thread.sleep(3000); // 3초
		} catch (Exception e) {
			e.printStackTrace();
		} 
		data = data + 20000; 
		System.out.println("금액 다운로드 종료");
	}
}

public class ThreadEx02 {
	
	public static void main(String[] args) {
		// 메인 스레드 
		System.out.println("프로그램 시작");
		System.out.println("-------------");
		// 서브 스레드
		DownloadThread dt = new DownloadThread();
		Thread t1 = new Thread(dt);
		t1.start();
		
		System.out.println("금액 : " + dt.data);
	
	}

}
