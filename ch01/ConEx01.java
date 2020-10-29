package ch01;

import java.util.Scanner;

public class ConEx01 {

	public static void main(String[] args) { // 사용자의 입력에 따라서 값을 다르게 할 수 있음
		Scanner sc = new Scanner(System.in);
		boolean check = sc.nextBoolean();

		if (check) { // boolean 1 bit 경우의 수 2가지, true 와 false
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}
	}
}
