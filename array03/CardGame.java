package array03;

import java.util.Random;
import java.util.Scanner;

public class CardGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int k = r.nextInt(100); // 0���� 99������ ������ ���� ����
		System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");

		boolean confirm = true;
		while (confirm) {
			int num = sc.nextInt();

			for (int i = 1; i < num; i++) {
				if (i < k) {
					System.out.println("�� ����");
				} else if (i > k) {
					System.out.println("�� ����");
				}
			}
			
			System.out.println(">>" + num);
		}

		System.out.println("�ٽ� �Ͻðڽ��ϱ� (y/n)");
		String check = sc.next();
		if (check.equals("n")) {
			confirm = false;
		}
	}
}
