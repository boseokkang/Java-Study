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
			// 1. �ּ� ��ü �����
			URL url = new URL("https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/stores/json?page=1");

			// 2. ��Ʈ�� ����
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			
			// 3. ���� ����
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			
			// 4. ���� ���ϱ� ����
			StringBuilder sb = new StringBuilder();
			
			String input = "";
			while((input = br.readLine()) != null) {
				sb.append(input);
			}
			
			System.out.println(sb.toString());
			System.out.println();

			br.close(); // ���� �ݱ�
			con.disconnect(); // ��Ʈ�� �ݱ� 
			
			// 5. �ڹ� ������Ʈ�� ��ȯ 
			Gson gson = new Gson();
			MaskInfo maskInfo = gson.fromJson(sb.toString(), MaskInfo.class);
			
			return maskInfo;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		String addr = sc.next();
		
		ArrayList<MaskInfo> maskInfos = new ArrayList<>();
		for (int i = 0; i < 54; i++) {
			
		}
		
	
//		for (Store store : StoreInfos) {
//			System.out.println("��ġ : " + store.getAddr());
//			System.out.println("�౹ : " + store.getName());
//			
		}
	}

