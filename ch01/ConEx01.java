package ch01;

import java.util.Scanner;

public class ConEx01 {

	public static void main(String[] args) { // ������� �Է¿� ���� ���� �ٸ��� �� �� ����
		Scanner sc = new Scanner(System.in);
		boolean check = sc.nextBoolean();

		if (check) { // boolean 1 bit ����� �� 2����, true �� false
			System.out.println("���Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
	}
}
