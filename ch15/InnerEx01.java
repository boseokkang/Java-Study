package ch15;

class MyOuterClass {
	int outerNum = 10;

//	public MyOuterClass() { // �ܺ� Ŭ�������� ���� Ŭ������ �ܵ����� ���� ����
//		MyInnerClass mc = new MyInnerClass();
//		System.out.println(mc.innerNum);
//	}

	static class MyInnerClass { // Ŭ���� �̸��� ������� ����
		int innerNum = 20;

	}
}

public class InnerEx01 {

	public static void main(String[] args) {
		// �ܺο��� ���� ���̸� �ٱ��� Ŭ������ �θ� �ȴ�. ���� ���ο� Ŭ���� �� �ʿ� X
		// �̷��� ���� ������ �ִٴ� �����θ� �� ��!
		// MyOuterClass moc = new MyOuterClass();
		// MyOuterClass.MyInnerClass d = moc.new MyInnerClass();
		new MyOuterClass.MyInnerClass();
	}

}
