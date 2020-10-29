package array03;

import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {
		// System.out.println((char) ch); // 아스키코드

		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 대문자를 입력하세요.");

		String str = sc.next(); // 1자리 문자 입력
		char ch = str.charAt(0); // char로 전환

		// 해당 문자 이후의 알파벳(26)을 출력하시오.
		for (int i = ch + 1; i < 'Z'; i++) {
			System.out.print((char) i + "");
		}
	}
}
