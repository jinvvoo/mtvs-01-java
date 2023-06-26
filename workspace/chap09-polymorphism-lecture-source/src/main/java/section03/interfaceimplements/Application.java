package section03.interfaceimplements;

public class Application {

	public static void main(String[] args) {

		/* 수업목표. 인터페이스(interface)에 대해 이해할 수 있다. */
		/* 필기.
		 *  인터페이스(interface)
		 *  여기서 다루게 되는 인터페이스는 자바의 클래스와 유사한 형태이지만
		 *  추상메소드와 상수 필드만 가질 수 있는 클래스의 변형체를 말한다.
		 * */
		
		/* 필기.
		 *  인터페이스의 사용 목적
		 *  1. 추상클래스와 비슷하게 필요한 기능을 공통화 해서 강제성을 부여할 목적으로 사용한다. (표준화)
		 *  2. 자바의 단일상속의 단점을 극복할 수 있다. (다중 상속)
		 *
		 * 설명.
		 *  참고로 인터페이스는 정말 많은 의미로 사용된다.
		 *  지금 학습하는 인터페이스 말고도 클래스에 작성한 public method 또한
		 *  객체들이 상호작용을 하기 위한 통로의 의미로 인터페이스라고 불린다.
		 * */
		
		/* 설명. 추상클래스와 인터페이스의 특징과 차이점도 면접 질문에서 단골 질문으로 등장하니 잘 정리해두자 */
		
		/* 설명. 인스턴스를 생성하지 못하고, 생성자 자체가 존재하지 않는다. */
//		InterProduct interProduct = new InterProduct();		//에러남
		
		/* 설명. 레퍼런스 타입으로만 사용이 가능하다. */
		InterProduct interProduct = new Product();
		
		/* 설명. 인터페이스의 추상메소드 오버라이딩한 메소드로 동적바인딩에 의해 호출됨 */
		interProduct.nonStaticMethod();
		interProduct.abstMethod();
		
		/* 설명. 오버라이딩 하지 않으면 인터페이스의 default 메소드로 호출됨 */
		interProduct.defaultMethod();
		
		/* 설명. static 메소드는 인터페이스명.메소드명(); 으로 호출함 */
		InterProduct.staticMethod();
		
		/* 설명. 상수 필드 접근도 인터페이스명.필드명 으로 접근함 */
		System.out.println(InterProduct.MAX_NUM);
		System.out.println(InterProduct.MIN_NUM);
	}
}
