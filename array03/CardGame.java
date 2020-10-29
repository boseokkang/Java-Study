package array03;

import java.util.Random;
import java.util.Scanner;

public class CardGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int k = r.nextInt(100); // 0부터 99까지의 임의의 정수 생성
		System.out.println("수를 결정하였습니다. 맞추어 보세요");

		boolean confirm = true;
		while (confirm) {
			int num = sc.nextInt();

			for (int i = 1; i < num; i++) {
				if (i < k) {
					System.out.println("더 높게");
				} else if (i > k) {
					System.out.println("더 낮게");
				}
			}
			
			System.out.println(">>" + num);
		}

		System.out.println("다시 하시겠습니까 (y/n)");
		String check = sc.next();
		if (check.equals("n")) {
			confirm = false;
		}
	}
}
