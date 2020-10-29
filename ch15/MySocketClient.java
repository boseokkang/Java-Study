package ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MySocketClient {

	Socket socket;
	BufferedWriter bw;
	BufferedReader br;

	public MySocketClient() throws Exception {
		// 서버 소켓의 accept() 함수를 호출
		socket = new Socket("localhost", 15000); // 문자열 인식하는 루프백 주소
		// socket = new Socket("127.0.0.1", 15000); // IP 루프백 주소
		bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		br = new BufferedReader(new InputStreamReader(System.in));

		// 키보드로부터 입력을 받는 순간 Write
		String msg = "";
		while ((msg = br.readLine()) != null) {
			bw.write(msg + "\n");
			bw.flush();
		}

		bw.close();
		br.close();
		socket.close();

	}

	public static void main(String[] args) {
		try {
			new MySocketClient();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
