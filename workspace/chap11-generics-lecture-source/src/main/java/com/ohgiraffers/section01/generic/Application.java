package com.ohgiraffers.section01.generic;

public class Application {

	public static void main(String[] args) {

		/* 수업목표. 제네릭(generic)에 대해 이해할 수 있다. */
		/* 필기.
		 *  제네릭(generic)
		 *  제네릭의 사전적인 의미는 일반적인 이라는 의미이다.
		 *  자바에서 제네릭이란 데이터의 타입을 일반화한다는 의미를 가진다.
		 *
		 * 필기.
		 *  제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 지정하는 방법을 말한다.
		 *  컴파일 시에 미리 타입 검사를 시행하게 되면 클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 높일 수 있으며,
		 *  (잘못된 타입인 경우 컴파일 에러를 발생시킴)
		 *  반환값에 대한 타입 변환 및 타입 검사에 들어가는 코드 생략이 가능해진다.
		 *  (instanceof 비교 및 다운캐스팅 작성 불필요)
		 *  JDK 1.5 버전부터 추가된 문법이다.
		 *
		 * 필기.
		 *  제네릭 프로그래밍
		 *  데이터의 형식에 의존하지 않고 하나의 값이 여러 다른 데이터 타입들을 가질 수 있는 기술에 중점을 두어
		 *  재사용성을 높일 수 있는 프로그래밍 방식이다.
		 * */
		
		/* 설명. 제네릭 클래스로 인스턴스를 생성할 시 타입변수 자리에 사용하려는 타입을 명시해야 한다. */
		
		/* 설명. 타입을 Integer로 인스턴스를 생성하는 경우 */
		GenericTest<Integer> gt1 = new GenericTest<Integer>();
		
		/* 설명. 메소드 인자 및 반환값 모두 Integer 타입인 것을 알 수 있다. */
		gt1.setValue(new Integer(10));
		System.out.println(gt1.getValue());
		System.out.println(gt1.getValue() instanceof Integer);
		
		/* 설명. 타입을 String으로 인스턴스를 생성하는 경우 */
		GenericTest<String> gt2 = new GenericTest<String>();
		
		/* 설명. 메소드 인자 및 반환값 모두 String 타입인 것을 알 수 있다. */
		gt2.setValue("홍길동");
		System.out.println(gt2.getValue());
		System.out.println(gt2.getValue() instanceof String);
		
		/* 설명.
		 *  JDK 7부터 타입선언 시 타입변수가 작성되면 타입 추론이 가능하기 때문에
		 *  생성자쪽의 타입을 생략하고 사용할 수 있게 한다.
		 *  단, 타입이 명시되지 않은 빈 다이아몬드 연산자는 사용해야 한다.
		 * */
		GenericTest<Double> gt3 = new GenericTest<>();
		
		gt3.setValue(0.5);
		System.out.println(gt3.getValue());
		System.out.println(gt3.getValue() instanceof Double);
		
		/* 설명.
		 *  사용된 제네릭은 컴파일 시점 타입 변환이 된 후에 사라지게 된다.
		 *  컴파일이 완료된 코드에는 제네릭 코드가 제거되어 있는데,
		 *  제네릭 이전에 작성된 코드와의 하위 호환성을 위해서이다.
		 *  */
	}

}
