package airplane2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

public class FlightApp {

	public static int getTotalCount(String depAirportId, String arrAirportId, long depPlandTime) {
		try {
			// 1번 주소 객체 만들기
			URL url = new URL(
					"http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=BTERlPQquIzWPNPwhyG74H1Q%2FoDrHpnubL%2FXCu%2FHneA%2BYSKX%2FstOJrcTUGI7BZX%2BClPcZ8DgeT5h2SAfhqvr6w%3D%3D&numOfRows=50&pageNo=1&depAirportId="
							+ FlightInfoService.airPortId.get(depAirportId) + "&arrAirportId="
							+ FlightInfoService.airPortId.get(arrAirportId) + "&depPlandTime=20200407&_type=json");

			// 2번 스트림 연결
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			// 3번 버퍼 연결 (문자열)
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

			// 4번 문자 더하기
			StringBuilder sb = new StringBuilder();

			String input = "";
			while ((input = br.readLine()) != null) {
				sb.append(input);
			}
			System.out.println(sb.toString());

			br.close(); // 버퍼 닫기
			con.disconnect(); // 스트림 닫기

			// 5번 자바 오브젝트로 변환
			Gson gson = new Gson();
			FlightInfo flightInfo = gson.fromJson(sb.toString(), FlightInfo.class);

			return flightInfo.getResponse().getBody().getTotalCount();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static FlightInfo getFlightInfo(String depAirportId, String arrAirportId, long depPlandTime, int page) {
		try {
			// 1번 주소 객체 만들기
			URL url = new URL(
					"http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=BTERlPQquIzWPNPwhyG74H1Q%2FoDrHpnubL%2FXCu%2FHneA%2BYSKX%2FstOJrcTUGI7BZX%2BClPcZ8DgeT5h2SAfhqvr6w%3D%3D&numOfRows=50&pageNo="
							+ page + "&depAirportId=" + FlightInfoService.airPortId.get(depAirportId) + "&arrAirportId="
							+ FlightInfoService.airPortId.get(arrAirportId) + "&depPlandTime=20200407&_type=json");

			// 2번 스트림 연결
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			// 3번 버퍼 연결 (문자열)
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

			// 4번 문자 더하기
			StringBuilder sb = new StringBuilder();

			String input = "";
			while ((input = br.readLine()) != null) {
				sb.append(input);
			}
			System.out.println(sb.toString());
			System.out.println();

			br.close(); // 버퍼 닫기
			con.disconnect(); // 스트림 닫기

			// 5번 자바 오브젝트로 변환
			Gson gson = new Gson();
			FlightInfo flightInfo = gson.fromJson(sb.toString(), FlightInfo.class);

			return flightInfo;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		FlightInfoService.setAirLineId();
		FlightInfoService.setAirPortId();
		for (String key : FlightInfoService.airPortId.keySet()) {
			System.out.print(key + " ");
		}
		System.out.println();
		System.out.println("출발지를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String depAirportId = sc.next(); // 김포

		System.out.println("도착지를 입력하세요.");
		String arrAirportId = sc.next();

		System.out.println("출발 일자를 입력하세요.");
		// 사용자에게 입력받을 때는 String 으로 받는 것이 제일 좋다. 오류 ↓
		String depPlandTimeTemp = sc.next();

		// String 을 함수로 바꿔주기
		long depPlandTime = Long.parseLong(depPlandTimeTemp);
		// Int 로 변경하기
		Integer depPlandTimeInteger = Integer.parseInt(depPlandTimeTemp);
		// double 로 변경하기
		Double depPlandTimeDouble = Double.parseDouble(depPlandTimeTemp);

		// 문자화 하기 : 문자 + 숫자 더하면 묵시적 형변환
		String strTemp = depPlandTime + "";
		String strTemp2 = depPlandTimeInteger.toString();
		String strTemp3 = depPlandTimeDouble.toString();

		int totalCount = getTotalCount(depAirportId, arrAirportId, depPlandTime);

		int count = 0;
		if (totalCount % 50 == 0) {
			count = totalCount / 50;
		} else {
			count = totalCount / 50 + 1;
		}

		ArrayList<FlightInfo> flightInfos = new ArrayList<>();
		
		int page = 1;
		for (int i = 0; i < count; i++) {
			FlightInfo flightInfo = getFlightInfo(depAirportId, arrAirportId, depPlandTime, page);
			page++;
			flightInfos.add(flightInfo);
		}

		for (FlightInfo flightInfo : flightInfos) { // 데이터는 총 122개니까 3번 돈다.
			List<Item> flightItems = flightInfo.getResponse().getBody().getItems().getItem();

			// forEach문 : iterable (반복) 되는 모든 레퍼런스가 들어갈 수 있다
			for (Item item : flightItems) {
				System.out.println("항공사 : " + item.getAirlineNm());
				System.out.println("출발지 : " + item.getDepAirportNm());
				System.out.println("도착지 : " + item.getArrAirportNm());
				System.out.println("출발시간 : " + item.getDepPlandTime());
				System.out.println("도착시간 : " + item.getArrPlandTime());
				System.out.println("요금 : " + item.getEconomyCharge());
				System.out.println();
			}

		}

	}

}
