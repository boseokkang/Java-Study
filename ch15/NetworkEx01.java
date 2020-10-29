package ch15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class NetworkEx01 {

	public static void main(String[] args) {
		try {
			// 1번 주소 객체 만들기
			URL url = new URL("http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=BTERlPQquIzWPNPwhyG74H1Q%2FoDrHpnubL%2FXCu%2FHneA%2BYSKX%2FstOJrcTUGI7BZX%2BClPcZ8DgeT5h2SAfhqvr6w%3D%3D&numOfRows=50&pageNo=1&depAirportId=NAARKJJ&arrAirportId=NAARKPC&depPlandTime=20200407&_type=json");
			
			// 2번 스트림 연결
			HttpURLConnection con = 
					(HttpURLConnection)url.openConnection();
			
			// 3번 버퍼 연결 (문자열)
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			
			// tip : 파일에 스트림 연결
			//FileWriter fr = new FileWriter("c:\\utils\\test.html");
			
			// 4. 문자 더하기
			StringBuilder sb = new StringBuilder();
			
			String input = "";
			while((input = br.readLine()) != null) {
				sb.append(input);
			}
			// br.write(sb.toString());
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace(); // 오류 추적
		} // URL 자체가 다 약어이기 때문에 파스칼 표기법 X
	}

}
