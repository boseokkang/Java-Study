package array03;

// 숫자 1000000000 를 입력받고 3자리마다 콤마를 찍어서 출력! 1,000,000,000

public class countTest {
	public static void main(String[] args) {
		System.out.println("1" + "," + " 000" + "," + "000" + "," + "000");
		System.out.println();

		// 1,000 10,000 100,000 1,000,000
		//System.out.println("1" + "," + "" );
	
		String s[] = {"000", "000", "000"};

		char c = ',';
		for ( char i = 1; i < s.length; i++) {
			for (char j = 1; j < s.length; j++) {
				System.out.println(s[j]);
			}
		System.out.println("1" + c + s[i]);

		}
	}

}
