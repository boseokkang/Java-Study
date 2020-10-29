package array03;

public class StarEx02 {
	static void printStars(int i) {
		int n = (4-i);
		if (i < 5) {
			for (int j = 0; j < n; j++) {
				System.out.print("_");
				}
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			printStars(i);
		}
		
	}

}
