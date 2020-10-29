package ch15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocketServer {
	ServerSocket serverSocket; // 서버 소켓 선언
	Socket socket; // 소켓 선언
	BufferedReader br;

	public MySocketServer() throws Exception { 
		serverSocket = new ServerSocket(15000); // (연결 받는) 서버 소켓 생성
		socket = serverSocket.accept(); // 요청 대기
		System.out.println("요청이 들어옴");

		// 소켓 - 소켓 Stream 연결
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		String msg = "";
		while ((msg = br.readLine()) != null) {
			System.out.println("상대방 : " + msg);

		}
		br.close();
		socket.close();
		serverSocket.close();
	}

	public static void main(String[] args) {
		try {
			new MySocketServer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
