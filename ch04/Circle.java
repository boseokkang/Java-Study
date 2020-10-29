package ch04;

class CircleApp {
	private int radius; // ���� ������
	private String name; // ���� �̸�

	public CircleApp(int radius, String name) { // ������
		this.radius = radius;
		this.name = name;
	}

	public void setName(String name) { // �̸� set �޼ҵ�
		this.name = name;
	}

	public String getName() { // �̸� get �޼ҵ�
		return name;
	}

	public void setRadius(int radius) { // �������� set �޼ҵ�
		this.radius = radius;
	}

	public int getRadius() { // �������� get �޼ҵ�
		return radius;
	}

	public double getArea() { // ���� ���� ��� �޼ҵ�
		return 3.14 * radius * radius;
	}
}

public class Circle {

	public static void main(String[] args) {
		CircleApp pizza = new CircleApp(10, "�ڹ�����"); // Circle ��ü ����
//		pizza.radius = 10; // ������ �������� 10���� ����
//		pizza.name = "�ڹ�����"; // ������ �̸� ����
		String n = pizza.getName(); // ������ �̸� ����
		double a = pizza.getArea(); // ������ ���� ����
		System.out.println(n + "�� ������ " + a);

		CircleApp donut = new CircleApp(2, "�ڹٵ���"); // Circle ��ü ����
//		donut.radius = 2; // ������ �������� 10���� ����
//		donut.name = "�ڹٵ���"; // ������ �̸� ����
		String m = donut.getName(); // ������ �̸� ����
		double b = donut.getArea(); // ������ ���� ����
		System.out.println(m + "�� ������ " + b);

	}

}
