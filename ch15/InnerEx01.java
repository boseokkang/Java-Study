package ch15;

class MyOuterClass {
	int outerNum = 10;

//	public MyOuterClass() { // 외부 클래스에서 내부 클래스를 단독으로 쓰기 위함
//		MyInnerClass mc = new MyInnerClass();
//		System.out.println(mc.innerNum);
//	}

	static class MyInnerClass { // 클래스 이름을 변수라고 생각
		int innerNum = 20;

	}
}

public class InnerEx01 {

	public static void main(String[] args) {
		// 외부에서 쓰는 것이면 바깥에 클래스를 두면 된다. 굳이 내부에 클래스 둘 필요 X
		// 이렇게 쓰는 문법이 있다는 정도로만 알 것!
		// MyOuterClass moc = new MyOuterClass();
		// MyOuterClass.MyInnerClass d = moc.new MyInnerClass();
		new MyOuterClass.MyInnerClass();
	}

}
