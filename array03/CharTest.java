package array03;

import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {
		// System.out.println((char) ch); // �ƽ�Ű�ڵ�

		Scanner sc = new Scanner(System.in);
		System.out.println("���ĺ� �빮�ڸ� �Է��ϼ���.");

		String str = sc.next(); // 1�ڸ� ���� �Է�
		char ch = str.charAt(0); // char�� ��ȯ

		// �ش� ���� ������ ���ĺ�(26)�� ����Ͻÿ�.
		for (int i = ch + 1; i < 'Z'; i++) {
			System.out.print((char) i + "");
		}
	}
}
