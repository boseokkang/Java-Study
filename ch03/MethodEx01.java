package ch03;

// �޼ҵ�(�Լ�)�� �޼ҵ�(�Լ�) �ȿ� �ۼ��� �� ����. 
// �޼ҵ�(�Լ�)�� Ŭ���� �ȿ� �ۼ��� �� �ִ�.

public class MethodEx01 {


	public static void main(String[] args) {
		int num = Cal.add(5, 3);
		System.out.println("add ��� : " + num);

		int num2 = Cal.minus(10, 5);
		System.out.println("minus ��� : " + num2);

		int num3 = Cal.multi(3, 3);
		System.out.println("multi ��� : " + num3);

		int num4 = Cal.divide(15, 5);
		System.out.println("divide ��� : " + num4);
	}

}
