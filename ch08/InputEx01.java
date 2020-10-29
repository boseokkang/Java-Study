package ch08;

import java.io.IOException;
import java.io.InputStream;

// 스트림 (Byte) → 물의 흐름
// 물이 흐를 때 수도꼭지를 잠궈두면 물이 흐르지 않는다. 
// 물이 흐를 때 수도꼭지를 열면 물이 흐른다. → 통신 시작!
// 물 = 바이트(통신에서 논리적인 개념)
public class InputEx01 {

	public static void main(String[] args) {
		InputStream in = System.in; // 키보드에 연결된 바이트 스트림
		try {
			int data = in.read();
			System.out.println((char) data);
		} catch (IOException e) {
			System.out.println("IO 오류가 발생");
		}

	}
}