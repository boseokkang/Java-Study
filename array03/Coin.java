package array03;

// 남은 동전의 개수를 구하는 프로그램 (500, 100, 50, 10)
// 2,680 
public class Coin {
	public static void main(String[] args) {
		int money = 5555;
		int count = 0;
		int coin[] = { 500, 100, 50, 10, 1 };
		System.out.println("시작 금액 : " + money);

		for (int i = 0; i < coin.length; i++) {
			count = money / coin[i];
			money = money % coin[i];
			System.out.println(coin[i] + "원 개수 : " + count);
			System.out.println("남은 금액 : " + money);
			
			/*count = money / 500;
			money = money % 500;
			System.out.println("500원 개수 : " + count);
			System.out.println("남은 금액 : " + money); */

		}

	}

}
