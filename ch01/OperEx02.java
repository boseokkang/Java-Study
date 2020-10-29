package ch01;

public class OperEx02 {

	public static void main(String[] args) {
		int sum = 0; // 선언만 하면 값은 0
		int distance = 100;
		int move = 20;
		
		sum = sum + move; // 값 누적
		System.out.println(sum);
		
		sum = sum + move; 
		System.out.println(sum);
		
		sum = sum + move; 
		System.out.println(sum);
		
		sum = sum + move; 
		System.out.println(sum);
		
		sum = sum + move; 
		System.out.println("움직인 거리 : " + sum); // 문자(String) + 숫자(int) -> 결합 (묵시적 형변환)
		System.out.println("도착지 : " + distance);
	}

}
