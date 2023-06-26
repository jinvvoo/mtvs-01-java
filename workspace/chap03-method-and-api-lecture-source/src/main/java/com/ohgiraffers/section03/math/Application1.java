package com.ohgiraffers.section03.math;

public class Application1 {

	public static void main(String[] args) {

		/* 수업목표. Math 클래스에서 제공하는 static 메소드를 호출할 수 있다. */
		/* 필기.
		 *  API란?
		 *  Application Programming Interface는 응용프로그램에서 사용할 수 있도록,
		 *  운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
		 *  쉽게 말해 우리가 구현할 수 없거나 구현하기 번거로운 기능들을 JDK를 설치하면 사용할 수 있도록 제공해놓은 소스코드(클래스나 인터페이스)들을 의미한다.
		 *  더 쉽게 말해 누가 작성해놓은 소스코드이니 가져다 쓰는 방법을 본다는 말이다.
		 *  모든 코드를 우리가 다 외울 수 없으니 API 문서를 별도로 제공해주고 있다.
		 * */
		
		/* 필기.
		 *  java.lang.Math
		 *  Math 클래스는 수학에서 자주 사용하는 상수들과 함수 들을 미리 구현해놓은 클래스 이다.
		 *  모든 메소드는 static 메소드로 작성되어 있다.
		 *  (객체의 상태를 관리하지 않고 기능만 제공하는 경우 메모리를 효율적으로 사용하기 위해 자주 사용되는 기법이다.)
		 * */
		
		/* 목차. 1. 절대값 출력 */
		/* 목차. 1-1. 클래스의 full-name을 다 적은 경우 */
		System.out.println("-7의 절대값 : " + (java.lang.Math.abs(-7)));
		
		/* 목차. 1-2. import를 해서 사용 */
		/* 설명.
		 *  클래스의 full-name 말고 클래스명만 작성하려면 import를 해야 한다고 배웠다.
		 *  하지만 Math 클래스는 근데 import 하지 않아도 쓸 수 있다.
		 *  java.lang 패키지에 속한 클래스이기 때문이다.
		 *  System, String 또한 지금까지 따로 import를 하지 않고 사용할 수 있었던 것은 두 클래스 또한 java.lang패키지에 속하기 때문이다.
		 *  워낙 자주 사용하는 패키지이다 보니 import 하지 않고 사용할 수 있도록 해 놓았다.
		 *  컴파일러가 import java.lang.*; 이 코드를 자동으로 추가해서 컴파일을 하기 때문이다.
		 * */
		System.out.println("-1.25의 절대값 : " + (Math.abs(-1.25)));
		
		/* 목차. 2. 최대값, 최솟값 출력 */
		System.out.println("10과 20중 더 작은 것은 : " + Math.min(10, 20));
		System.out.println("20과 30중 더 큰 것은 : " + Math.max(20, 30));
		
		/* 설명.
		 *  수학적으로 많이 사용하는 고정된 값들도 이미 Math 안에 정의된 것이 있다.
		 *  필드 라는 것을 이용한 것인데 이 부분은 나중에 다루게 되니 걱정하지 말자
		 * */
		System.out.println("원주율 : " + Math.PI);

		/* 목차. 3. 난수 출력 */
		/* 설명.
		 *  0부터 1 전까지의 실수 형태의 난수를 발생시킨다.
		 *  호출할 때마다 다른 값을 가진다.
		 *  난수는 프로그래밍에서 꽤나 자주 사용되는 편이다.
		 * */
		System.out.println("난수 발생 : " + Math.random());
	}
}
