package array03;

//char arr [] = {'��', '��', '��', '��', '��'};
//���ο� �迭�� �����ؼ� ���� ��. 
// for ���� �̿��Ͽ� {�� �� �� �� ��} �������� �����. 
// for ������ ���

public class Test {

	char arr[] = { '��', '��', '��', '��', '��' };

	public static void main(String[] args) {
		System.out.print("{");
		char arr[] = { '��', '��', '��', '��', '��' };
		char arr2[] = new char[5];

		for (char i = 4; i < arr.length; i--) {
			System.out.print("'" + arr[i] + "'");
		}
		System.out.print("}");
	}

}
