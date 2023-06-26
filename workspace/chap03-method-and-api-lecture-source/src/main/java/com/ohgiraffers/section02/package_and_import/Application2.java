package com.ohgiraffers.section02.package_and_import;

/* 설명. 사용하려는 클래스까지를 작성해야 한다. */
import com.ohgiraffers.section01.method.Calculator;
/* static import의 경우 사용하려는 static method까지 전부 써줘야 한다. */
import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

public class Application2 {

	public static void main(String[] args) {
		
		/* 수업목표. 임포트에 대해 이해할 수 있다. */
		/* 필기.
		 *  임포트란?
		 *   서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야 한다.
		 *   하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
		 *   그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
		 *   import는 package 선언문과 class 선언문 사이에 작성하며
		 *   어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가진다.
		 * */
		
		/* 설명. 다시 한 번 Calculator를 사용해서 메소드를 호출해보자 */
		/* 목차. 1. non-static method의 경우 */
		Calculator calc = new Calculator();			//임포트구문 추가할 것
		int min = calc.minNumberOf(50, 60);
		
		System.out.println("50과 60 중 더 작은 값은 : " + min);
		
		/* 목차. 2. static method의 경우 */
		int max = Calculator.maxNumberOf(50, 60);
		
		System.out.println("50과 60 중 더 큰 값은 : " + max);
		
		/* 목차. 3. static 메소드를 호출할 때 클래스명도 생략하고 사용(import static) */
		int max2 = maxNumberOf(100, 200);			//static import 수문 수동 추가
		
		System.out.println("100과 200 중 더 큰 값은 : " + max2);
	}
}
