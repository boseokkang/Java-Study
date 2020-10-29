package ch03;

class Data {
	int num = 10;
}

public class MethodEx02 {

	static int 증가(int num) {
		num++;
		System.out.println("증가 num : " + num);
		return num;
	}

	static void 감소(Data d) {
		d.num--;
		System.out.println("감소 num : " + d.num);
	}

	public static void main(String[] args) {
		// Value passing
		int myNum = 100;
		myNum = 증가(myNum);
		System.out.println("myNum : " + myNum);
	
		// Reference passing
		Data data = new Data();
		감소(data);
		System.out.println("data.num : " + data.num);
	
	}

}
