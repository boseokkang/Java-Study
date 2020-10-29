package airplane;

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
			// 1�� �ּ� ��ü �����
			URL url = new URL(
					"http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=BTERlPQquIzWPNPwhyG74H1Q%2FoDrHpnubL%2FXCu%2FHneA%2BYSKX%2FstOJrcTUGI7BZX%2BClPcZ8DgeT5h2SAfhqvr6w%3D%3D&numOfRows=50&pageNo=1&depAirportId="+FlightInfoService.airPortId.get(depAirportId)+"&arrAirportId="+FlightInfoService.airPortId.get(arrAirportId)+"&depPlandTime=20200407&_type=json");

			// 2�� ��Ʈ�� ����
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			// 3�� ���� ���� (���ڿ�)
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

			// 4�� ���� ���ϱ�
			StringBuilder sb = new StringBuilder();

			String input = "";
			while ((input = br.readLine()) != null) {
				sb.append(input);
			}
			System.out.println(sb.toString());

			br.close(); // ���� �ݱ�
			con.disconnect(); // ��Ʈ�� �ݱ�

			// 5�� �ڹ� ������Ʈ�� ��ȯ 
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
			// 1�� �ּ� ��ü �����
			URL url = new URL(
					"http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=BTERlPQquIzWPNPwhyG74H1Q%2FoDrHpnubL%2FXCu%2FHneA%2BYSKX%2FstOJrcTUGI7BZX%2BClPcZ8DgeT5h2SAfhqvr6w%3D%3D&numOfRows=50&pageNo="+page+"&depAirportId="+FlightInfoService.airPortId.get(depAirportId)+"&arrAirportId="+FlightInfoService.airPortId.get(arrAirportId)+"&depPlandTime=20200407&_type=json");

			// 2�� ��Ʈ�� ����
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			// 3�� ���� ���� (���ڿ�)
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

			// 4�� ���� ���ϱ�
			StringBuilder sb = new StringBuilder();

			String input = "";
			while ((input = br.readLine()) != null) {
				sb.append(input);
			}
			System.out.println(sb.toString());
			System.out.println();

			br.close(); // ���� �ݱ�
			con.disconnect(); // ��Ʈ�� �ݱ�

			// 5�� �ڹ� ������Ʈ�� ��ȯ
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
		System.out.println("������� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		String depAirportId = sc.next(); // ����
		
		System.out.println("�������� �Է��ϼ���.");
		String arrAirportId = sc.next();
		
		System.out.println("��� ���ڸ� �Է��ϼ���."); 
		// ����ڿ��� �Է¹��� ���� String ���� �޴� ���� ���� ����. ���� ��
		String depPlandTimeTemp= sc.next(); 
		
		// String �� �Լ��� �ٲ��ֱ� 
		long depPlandTime = Long.parseLong(depPlandTimeTemp);
		// Int �� �����ϱ�
		Integer depPlandTimeInteger = Integer.parseInt(depPlandTimeTemp);
		// double �� �����ϱ�
		Double depPlandTimeDouble = Double.parseDouble(depPlandTimeTemp);
		
		int page = 1;
		// ����ȭ �ϱ� : ���� + ���� ���ϸ� ������ ����ȯ 
		String strTemp = depPlandTime + ""; 
		String strTemp2 = depPlandTimeInteger.toString();
		String strTemp3 = depPlandTimeDouble.toString();
		
		int totalCount = getTotalCount(depAirportId, arrAirportId, depPlandTime);
		
		int count = 0;
		if (totalCount % 50 == 0) {
			count = totalCount / 50;	
		}else {
			count = totalCount / 50 + 1; 
		}
		
		ArrayList<FlightInfo> flightInfos = new ArrayList<>();
		
		for (int i = 0; i < count; i++) {
			FlightInfo flightInfo = 
					getFlightInfo(depAirportId, arrAirportId, depPlandTime, page);
			page++;
			flightInfos.add(flightInfo);
		}
		
		for (FlightInfo flightInfo : flightInfos) { // �����ʹ� �� 122���ϱ� 3�� ����.
			List<Item> flightItems = flightInfo.getResponse().getBody().getItems().getItem();
			
			// forEach�� : iterable (�ݺ�) �Ǵ� ��� ���۷����� �� �� �ִ�
			for (Item item : flightItems) { 
				System.out.println("�װ��� : " + item.getAirlineNm());
				System.out.println("����� : " + item.getDepAirportNm());
				System.out.println("������ : " + item.getArrAirportNm());
				System.out.println("��߽ð� : " + item.getDepPlandTime());
				System.out.println("�����ð� : " + item.getArrPlandTime());
				System.out.println("��� : " + item.getEconomyCharge());
				System.out.println();
			}
	
		}
		
		
	}

}
