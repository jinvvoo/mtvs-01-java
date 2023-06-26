package section02.abstractclass;

public abstract class Product {

	/* 설명. 추상클래스는 필드를 가질 수 있다. */
	private int nonStatidField;
	private static int staticFiled;
	
	/* 설명.
	 *  추상클래스는 생성자도 가질 수 있다.
	 *  하지만 직접적으로 인스턴스를 생성할 수는 없다.
	 * */
	public Product() {}
	
	/* 설명. 추상클래스는 일반적인 메소드를 가질 수 있다. */
	public void nonStaticMethod() {
		
		System.out.println("Product 클래스의 nonStaticMethod 호출함...");
	}
	
	public static void staticMethod() {
		
		System.out.println("Product 클래스의 staticMethod 호출함...");
	}
	
	/* 설명.
	 *  추가적으로 미완성 메소드(추상메소드) 또한 만들 수 있다.
	 *  추상메소드가 0개인 경우 선택적으로 클래스에 abstract 키워드를 작성해야 한다.
	 * */
	public abstract void abstMethod();
}
