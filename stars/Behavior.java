package stars;

// �߻� Ŭ������ ���� 
// �߻� �޼ҵ常 ���� ���� -> ���� ���ε��� ��ηθ� ���

public interface Behavior {
	public abstract void move(); // abstract, public ���� ����

	void repair();

	void attack(Behavior unit);

}
