package array03;

public class StringEx01 {

	public static void main(String[] args) {
		String s1 = new String("唱公");
		String s2 = new String("唱公");

		System.out.println(s1 == s2);

		String s3 = "唱公";
		String s4 = "唱公";
		System.out.println(s3 == s4);

		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
	}

}
