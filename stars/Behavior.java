package stars;

// 추상 클래스와 유사 
// 추상 메소드만 존재 가능 -> 동적 바인딩의 통로로만 사용

public interface Behavior {
	public abstract void move(); // abstract, public 생략 가능

	void repair();

	void attack(Behavior unit);

}
