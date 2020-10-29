package airplane;

public class TestEx01 {

	public static void main(String[] args) {
		String addr = "충청남도 홍성군 갈산면 상촌로 12-1";
		
		if(addr.contains("충청남도")) {
			System.out.println("있어요");
		}else {
			System.out.println("없어요");
		}
	}
}
