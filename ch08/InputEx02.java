package ch08;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// 문자로 읽고 싶다
// 한 개 이상을 받고 싶다 
public class InputEx02 {

	public static void main(String[] args) {
		InputStream in = System.in;

		InputStreamReader reader = new InputStreamReader(in);

		char[] data = new char[3]; // data(레퍼런스 변수) 는 heap 에 뜬다. 그래서 return 할 필요 X
		try {
			reader.read(data);
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
