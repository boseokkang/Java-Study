package array03;

//숫자 1000000000(10억)을 3자리마다 콤마를 찍어서 출력!
// 1,000,000,000

import java.util.Scanner;

public class ArrayEx05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String tempNum = num + "";
		String tempNum2[] = tempNum.split("");

		// 방법 1
		int len = tempNum2.length; // len = 4

		for (int i = 0; i < len; i++) { // 4번 도는 for문
			if ((len - i) % 3 == 0 && i != 0) { // 4%3, 3%3, 2%3, 1%3
				System.out.print(",");
			}
			System.out.print(tempNum2[i]);
		}

		System.out.println();

		// 방법 2
		// 자릿수 계산을 위한 변수
		int p = (tempNum2.length % 3);
		for (int i = 0; i < tempNum2.length; i++) {
			// 첫째 자리 앞에 , 가 붙으면 안되니까 첫 조건
			if (i == 0) tempNum2[i] = "" + tempNum2[i];
			// i를 3으로 나눈 것이 p값과 같으면 앞에 , 를 붙임
			else if (i % 3 == p) tempNum2[i] = "," + tempNum2[i];
			// 자릿수대로 출력하기
			System.out.print(tempNum2[i]);
		}
	}
}
// 실패한 코드
// for (int i = 0; i < tempNum2.length; i++) { System.out.print(tempNum2[i]);
// if (i % 3 == 0) { System.out.print(",");
 
// System.out.println(tempNum2[0]);
// System.out.println("길이 : " + tempNum2.length);
