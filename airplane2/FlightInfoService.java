package airplane2;

import java.util.HashMap;

public class FlightInfoService { // ��ƿ���� class (��¿ �� ���� ����)
	public static HashMap<String, String> airLinedId = new HashMap<>();

	public static HashMap<String, String> airPortId = new HashMap<>();

	public static void setAirLineId() {
		airLinedId.put("�ƽþƳ��װ�", "AAR");
		airLinedId.put("����λ�", "ABL");
		airLinedId.put("�̽�Ÿ�װ�", "ESR");
		airLinedId.put("�����װ�", "JJA");
		airLinedId.put("�� ����", "JNA");
		airLinedId.put("���� �װ�", "KAL");
		airLinedId.put("Ƽ�����װ�", "TWB");

	}

	public static void setAirPortId() {
		airPortId.put("����", "NAARKJB");
		airPortId.put("����", "NAARKJJ");
		airPortId.put("����", "NAARKJK");
		airPortId.put("����", "NAARKJY");
		airPortId.put("����", "NAARKNW");
		airPortId.put("���", "NAARKNY");
		airPortId.put("����", "NAARKPC");
		airPortId.put("����", "NAARKPK");
		airPortId.put("��õ", "NAARKPS");
		airPortId.put("���", "NAARKPU");
		airPortId.put("��õ", "NAARKSI");
		airPortId.put("����", "NAARKSS");
		airPortId.put("����", "NAARKTH");
		airPortId.put("�뱸", "NAARKTN");
		airPortId.put("û��", "NAARKTU");

	}
}
