package array03;

import java.util.Scanner;

//임의의 6자리 수를 입력 받는다.
//해당하는 숫자가 들어가면 문구를 출력한다.
public class ArrayEx07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("6자리 숫자를 입력하세요.");
		int num = sc.nextInt(); // 6자리 숫자 입력 123456

		String strNum = num + "";
		// System.out.println(strNum.charAt(0));
		// System.out.println(strNum.length());

		int len = strNum.length();
		boolean check = false;
		for (int i = 0; i < len; i++) {
			if (strNum.charAt(i) == '3') {
				check = true;
			}
		}
		if (check) {
			System.out.println("3이 존재합니다.");
		} else {
			System.out.println("3이 존재하지 않습니다.");
		}
	}
}