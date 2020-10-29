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
		// ���� ������ accept() �Լ��� ȣ��
		socket = new Socket("localhost", 15000); // ���ڿ� �ν��ϴ� ������ �ּ�
		// socket = new Socket("127.0.0.1", 15000); // IP ������ �ּ�
		bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		br = new BufferedReader(new InputStreamReader(System.in));

		// Ű����κ��� �Է��� �޴� ���� Write
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
