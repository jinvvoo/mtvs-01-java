package section02.abstractclass;

/* 설명. 두 개 이상의 클래스를 extends로 상속받으면 컴파일 에러가 발생한다. */
public class SmartPhone extends Product /*, java.util.Scanner */ {

	/* 설명.
	 *  SmartPhone 클래스는 Product클래스를 상속받아서 구현한다.
	 *  extends 키워드로 클래스를 상속받을 때 두 개 이상의 클래스는 상속하지 못한다. (모호성 제거)
	 *  추상클래스가 가지는 추상 메소드를 반드시 오버라이딩 해야 한다. (강제성 부여)
	 * */
	public SmartPhone() {}

	@Override
	public void abstMethod() {
		
		System.out.println("Product 클래스의 abstMethod를 오버라이딩 한 메소드 호출함...");
	}
	
	/* 설명. 추가적으로 메소드도 작성할 수 있다. */
	public void printSmartPhone() {
		
		System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함...");
	}
}
