package chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class MySocketServer {

	ServerSocket serverSocket;
	Vector<NewSocketThread> vt; // 미리 만들어둔 클래스를 담음으로써 편하게 사용

	public MySocketServer() throws Exception {
		vt = new Vector<>();
		serverSocket = new ServerSocket(3000); // 서버 소켓 생성

		while (true) {
			Socket socket = serverSocket.accept(); // 요청 대기
			// while 이 돌 때마다 socket 은 가장 최근에 연결된 socket 만 가르킴
			// 즉, stack 의 socket(지역변수) 이 사라짐
			System.out.println("요청이 들어옴");
			NewSocketThread nt = new NewSocketThread(socket); // Target
			Thread newWorker = new Thread(nt); // Target 지정
			newWorker.start(); // OS 에게 run() 실행 요청
			vt.add(nt);
		}
	}

	// 내부 클래스 : 다른 곳에서 쓸 일이 없음
	// Runnable 타입이라서 Target 이 된다
	// 새로운 스레드에게 버퍼를 연결할 수 있게 socket 전달!
	class NewSocketThread implements Runnable {

		Socket socket;
		BufferedReader br;
		BufferedWriter bw;

		public NewSocketThread(Socket socket) {
			this.socket = socket;

		}

		@Override
		public void run() {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

				String msg = "";
				while ((msg = br.readLine()) != null) {
					for (NewSocketThread newSocketThread : vt) { // 모든 소켓에 다 접근
						System.out.println("클라이언트 : " + msg);
						if (newSocketThread != this) { // 자기 자신한테는 보내지 않음
							newSocketThread.bw.write(msg + "\n"); // \n : readLine 할 때 안 읽어지기 때문에 사용
							newSocketThread.bw.flush();
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		try {
			new MySocketServer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
