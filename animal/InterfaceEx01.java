package animal;

// 1. ���� : public static final ����
// 2. �Լ� : public abstract ����
// 3. ����� ���� - ���� ���ε�
// 4. ������ �߻� �޼ҵ常 ���� ���� = ������ �ο� / ���� ���� �޼ҵ带 �ݵ�� �����ض� 
// 5. new �� �� ����. �ڽ��� new �ؼ� ���� ���� ��� ��. 

interface Cal {
	int num = 10;
}

public class InterfaceEx01 {

	public static void main(String[] args) {
		System.out.println(Cal.num);
	}

}
