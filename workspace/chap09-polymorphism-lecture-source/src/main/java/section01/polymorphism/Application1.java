package section01.polymorphism;

public class Application1 {

	public static void main(String[] args) {

		/* 수업목표. 다형성과 타입 형변환에 대해 이해할 수 있다. */
		/* 필기.
		 *  다형성
		 *  다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있는 것을 의미한다.
		 *  그렇기 때문에 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있기도 하고,
		 *  하나의 메소드 호출로 객체별로 각기 다른 방법으로 동작하게 할 수도 있다.
		 * 
		 * 필기.
		 *  다형성은 객체지향 프로그래밍의 3대 특징 (캡슐화, 상속, 다형성) 중 하나이며,
		 *  객체지향 프로그래밍의 꽃이라고 불리울 정도로 활용성이 높고 장점이 많다.
		 *  하지만 학습하기 어렵다는 단점을 가지고 있다.
		 * */
		
		/* 필기.
		 *  다형성의 장점
		 *  1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있기 때문에 유지보수성과 생산성이 증가된다.
		 *  2. 상속을 기반으로 한 기술이기 때문에 상속관계에 있는 모든 객체는 동일한 메세지를 수신할 수 있다.
		 *     이런 동일한 메세지를 수신받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점을 가지고 있다.
		 *     (다양한 기능을 사용하는데 있어서 관리해야 할 메세지 종류가 줄어들게 된다.)
		 *     하나의 호출로 여러 가지 동작을 수행할 수 있다는 측면에서 오버로딩을 다형성으로 보기도 한다.
		 *     다형성을 이해하기 쉬운 가장 좋은 예 이기도 하다.
		 *     하지만 이 부분은 이견이 많이 존재하기 때문에 다형성을 이해하는데 참고로만 활용하자.
		 *  3. 확장성이 좋은 코드를 작성할 수 있다.
		 *  4. 결합도를 낮춰서 유지보수성을 증가시킬 수 있다.
		 * */

		/* 설명.
		 *  하지만 다형성은 장점이 잘 와닿지도 않고 개념도 정말 많이 어렵다.
		 *  철학적인 부분과 설계적인 부분보다 우선 다형성의 문법적 특징에 집중해서 학습하도록 하자
		 * */
		
		/* 설명.
		 *  우선적으로 살펴볼 것은 다형성이란 서로 다른 형태를 가지고 있는 성질을 의미한다는 것이다.
		 *  다형성은 상속을 기반은로 한 기술이다.
		 *  상속은 부모클래스가 가지는 속성과 기능(필드와 메소드)를 물려받아 자신의 것 처럼 사용하며
		 *  확장도 가능한 개념이라고 했다.
		 *  하지만 이 때 물려받는 것이 한 가지 더 있다. 바로 타입이다.
		 *  클래스는 사용자 정의의 타입이다. 이렇게 사용자가 정의한 타입 또한 함께 물려받는 것이
		 *  다형성이 서로 다른 여러 형태를 가지고 있다는 개념이다.
		 * 
		 * 설명.
		 *  Car 클래스와 FireCar, RacingCar를 기억하는가?
		 *  FireCar는 FireCar 이면서 Car 이기도 하다.
		 *  RacingCar 역시 RacingCar 이기도 하면서 Car이기도 하다
		 *  FireCar와 RacingCar로 생성한 인스턴스는 각각 FireCar, RacingCar 타입이라고 볼 수 있다.
		 *  하지만 FireCar와 RacingCar 모두 Car라는 타입도 함께 가지고 있다.
		 *  이것이 서로 다른 타입을 여러 개 가지고 있다는 의미이다.
		 *  */
		
		/* 목차. 1. Animal, Rabbit, Tiger 클래스를 만들어보자 */

		/* 목차. 2. Animal 인스턴스 생성 후 메소드 호출 확인 */
		System.out.println("Animal 생성 ----------------------------");
		Animal animal = new Animal();
		animal.eat();
		animal.run();
		animal.cry();
		
		/* 목차. 3. Rabbit 인스턴스 생성 후 메소드를 호출 확인 */
		System.out.println("Rabbit 생성 ------------------------------");
		Rabbit rabbit = new Rabbit();
		rabbit.eat();
		rabbit.run();
		rabbit.cry();
		rabbit.jump();
		
		/* 목차. 4. Tiger 인스턴스 생성 후 메소드 호출 확인 */
		System.out.println("Tiger 생성 --------------------------------");
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.run();
		tiger.cry();
		tiger.bite();
		
		/* 설명.
		 *  Rabbit과 Tiger는 Animal 클래스를 상속받았다.
		 *  따라서 Rabbit은 Rabbit 타입이기도 하면서 Animal 타입이기도 하며
		 *  Tiger는 Tiger 타입이면서 Animal 타입이기도 하다.
		 * */
		
		/* 목차. 5. 부모 타입으로 자식 인스턴스 주소값 저장 */
		Animal a1 = new Rabbit();
		Animal a2 = new Tiger();
		
		/* 설명.
		 *  하지만 반대로 Animal은 Animal이지 Tiger나 Rabbit이 아니다.
		 *  그래서 이렇게 하면 에러난다.
		 * */
//		Rabbit r = new Animal();		//에러남
//		Tiger t = new Animal();			//에러남

		/* 목차. 6. 동적 바인딩 확인 */
		/* 필기.
		 *  동적바인딩
		 *  컴파일 당시에는 해당 타입의 메소드와 연결되어 있다가.
		 *  런타임 당시 실제 객체가 가진 오버라이딩된 메소드로 바인딩이 바뀌어 동작하는 것을 의미한다.
		 * */
		System.out.println("동적바인딩 확인 ------------------------------");
		a1.cry();
		a2.cry();
		
		/* 설명. 하나의 메소드 호출로 각기 다른 객체의 다른 메소드를 동작시키게 한다. */
		
		/* 설명.
		 *  하지만 현재 레퍼런스변수의 타입은 Animal 이기 때문에
		 *  Rabbit과 Tiger가 가지고 있는 고유한 기능을 동작시키지 못한다.
		 * */
//		a1.jump();		//에러남
//		a2.bite();		//에러남

		/* 목차. 7. 타입 형변환 확인 */
		/* 설명.
		 *  객체별로 고유한 기능을 동작시키기 위해서는 레퍼런스 변수를 형변환하여 Rabbit과 Tiger로 변경해야
		 *  메소드 호출이 가능하다.
		 *  class type casting : 클래스 형변환
		 *  타입 형변환 시 실제 인스턴스와 타입이 일치하지 않는 경우 ClassCastException 발생할 수 있다.
		 * */
		System.out.println("클래스타입 형변환 확인 --------------------------");
		((Rabbit) a1).jump();
		((Tiger) a2).bite();
		
		/* 필기.
		 *  타입 형변환을 잘못 하는 경우
		 *  컴파일시에는 문제가 되지 않지만 런타임시 Exception 발생한다.
		 * */
//		((Tiger) a1).bite();		//에러남	//토끼는 호랑이가 될 수 없다.

		/* 목차. 8. instanceof 연산자 사용 확인 */
		/* 설명. 레퍼런스변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자 instanceof */
		System.out.println("instanceof 확인 ----------------------------");
		System.out.println("a1이 Tiger 타입인지 확인 : " + (a1 instanceof Tiger));
		System.out.println("a1이 Rabbit 타입인지 확인 : " + (a1 instanceof Rabbit));
		/* 설명. 상속 받은 타입도 함께 가지고 있다(다형성) */
		System.out.println("a1이 Animal 타입인지 확인 : " + (a1 instanceof Animal));
		/* 설명. 모든 클래스는 Object의 후손이다. */
		System.out.println("a1이 Object 타입인지 확인 : " + (a1 instanceof Object));
		
		/* 설명. instanceof 연산자를 이용해서 해당 타입이 맞는 경우에만 클래스형변환을 적용한다. */
		if(a1 instanceof Rabbit) {
			((Rabbit) a1).jump();
		}
		
		if(a1 instanceof Tiger) {
			((Tiger) a1).bite();
		}

		/* 목차. 9. 클래스의 업캐스팅과 다운캐스팅 확인 */
		/* 필기.
		 *  클래스 형변환은 up-casting과 down-casting으로 구분할 수 있다.
		 *  up-casting : 상위 타입으로 형변환
		 *  down-casting : 하위 타입으로 형변환
		 *  또한 작성 여부에 따라 명시적과 묵시적 두 가지로 구분된다.
		 * */
		
		/* 설명.
		 *  묵시적 형변환
		 *  up-casting의 경우 묵시적 형변환이 적용된다.
		 * */
		Animal animal1 = (Animal) new Rabbit();		//up-casting 명시적 형변환
		Animal animal2 = new Rabbit();				//up-casting 묵시적 형변환
		
		Rabbit rabbit1 = (Rabbit) animal1;			//down-casting 명시적 형변환
//		Rabbit rabbit2 = animal12;					//down-casting 묵시적 형변환 안됨
	}
}
