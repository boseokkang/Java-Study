package dataex;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		// 6개의 번호 (1~45)

		// HashSet 순서가 없음 (엄청 빠름)
		// TreeSet 순서대로 정렬 (HashSet 보다 느림)
		Set<Integer> lottoSet = new TreeSet<>();
		Random r = new Random();
		while (lottoSet.size() < 6) {
			int value = r.nextInt(45) + 1;
			lottoSet.add(value);
		}

		System.out.print(lottoSet);

	}

}
