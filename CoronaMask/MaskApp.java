package CoronaMask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.google.gson.Gson;

public class MaskApp {

	public static MaskInfo getMaskInfo(int page) {

		try {
			// 1. 주소 객체 만들기
			URL url = new URL("https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/stores/json?page=1");

			// 2. 스트림 연결
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			
			// 3. 버퍼 연결
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			
			// 4. 문자 더하기 공간
			StringBuilder sb = new StringBuilder();
			
			String input = "";
			while((input = br.readLine()) != null) {
				sb.append(input);
			}
			
			System.out.println(sb.toString());
			System.out.println();

			br.close(); // 버퍼 닫기
			con.disconnect(); // 스트림 닫기 
			
			// 5. 자바 오브젝트로 변환 
			Gson gson = new Gson();
			MaskInfo maskInfo = gson.fromJson(sb.toString(), MaskInfo.class);
			
			return maskInfo;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static void main(String[] args) {
		System.out.println("지역을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String addr = sc.next();
		
		ArrayList<MaskInfo> maskInfos = new ArrayList<>();
		for (int i = 0; i < 54; i++) {
			
		}
		
	
//		for (Store store : StoreInfos) {
//			System.out.println("위치 : " + store.getAddr());
//			System.out.println("약국 : " + store.getName());
//			
		}
	}

