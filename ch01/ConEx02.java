package ch01;

import java.util.Scanner;

public class ConEx02 {

	public static void main(String[] args) {
		System.out.println("성적을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt(); // 정수를 입력받기
		
		if(point >= 90) {
			System.out.println("A학점입니다.");
		}else if(point >= 80) {
			System.out.println("B학점입니다.");
		}else if(point >= 70) {
			System.out.println("C학점입니다.");
		}else if(point >= 60){
			System.out.println("D학점입니다.");
		}else{
			System.out.println("F학점입니다.");
		}
}
}


