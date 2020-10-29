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
	Vector<NewSocketThread> vt; // �̸� ������ Ŭ������ �������ν� ���ϰ� ���

	public MySocketServer() throws Exception {
		vt = new Vector<>();
		serverSocket = new ServerSocket(3000); // ���� ���� ����

		while (true) {
			Socket socket = serverSocket.accept(); // ��û ���
			// while �� �� ������ socket �� ���� �ֱٿ� ����� socket �� ����Ŵ
			// ��, stack �� socket(��������) �� �����
			System.out.println("��û�� ����");
			NewSocketThread nt = new NewSocketThread(socket); // Target
			Thread newWorker = new Thread(nt); // Target ����
			newWorker.start(); // OS ���� run() ���� ��û
			vt.add(nt);
		}
	}

	// ���� Ŭ���� : �ٸ� ������ �� ���� ����
	// Runnable Ÿ���̶� Target �� �ȴ�
	// ���ο� �����忡�� ���۸� ������ �� �ְ� socket ����!
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
					for (NewSocketThread newSocketThread : vt) { // ��� ���Ͽ� �� ����
						System.out.println("Ŭ���̾�Ʈ : " + msg);
						if (newSocketThread != this) { // �ڱ� �ڽ����״� ������ ����
							newSocketThread.bw.write(msg + "\n"); // \n : readLine �� �� �� �о����� ������ ���
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
