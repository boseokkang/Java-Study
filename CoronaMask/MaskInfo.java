package CoronaMask;

import java.util.List;

import lombok.Data;


@Data
class StoreInfos {
	private String addr;
	private long code;
	private double lat;
	private double lng;
	private String name;
	private int type;
}

@Data
public class MaskInfo {
	private int count;
	private String page;
	private List<StoreInfos> storeInfos;
	private int totalCount;
	private int totalPages;
}
