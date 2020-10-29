package airplane2;

import java.util.ArrayList;

import lombok.Data;

@Data
class Header {
	private String resultCode;
	private String resultMsg;
}

@Data
class Item {
	private String airlineNm;
	private String arrAirportNm;
	private long arrPlandTime;
	private String depAirportNm;
	private long depPlandTime;
	private int economyCharge;
	private int prestigeCharge;
	private String vihicleId;
}

@Data
class Items {
	private ArrayList<Item> item;
}

@Data
class Body {
	private Items items;
	private int numOfRows;
	private int pageNo;
	private int totalCount;
}

@Data
class Response {
	private Header header;
	private Body body;
}

@Data
public class FlightInfo {
	private Response response;
}