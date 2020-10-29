package array03;

//char arr [] = {'가', '나', '다', '라', '마'};
//새로운 배열에 복사해서 만들 것. 
// for 문을 이용하여 {마 라 다 나 가} 역순으로 만들기. 
// for 문으로 출력

public class Test {

	char arr[] = { '가', '나', '다', '라', '마' };

	public static void main(String[] args) {
		System.out.print("{");
		char arr[] = { '가', '나', '다', '라', '마' };
		char arr2[] = new char[5];

		for (char i = 4; i < arr.length; i--) {
			System.out.print("'" + arr[i] + "'");
		}
		System.out.print("}");
	}

}
