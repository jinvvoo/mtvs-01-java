package com.ohgiraffers.section06.statickeyword;

public class Application {

	public static void main(String[] args) {

		/* 수업목표. static 키워드에 대해 이해할 수 있다. */
		/* 필기.
		 *  static
		 *  : 정적 메모리 영역에 프로그램이 start될 때 할당을 하는 키워드이다.
		 *    인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드, 메소드)에 지정할 수 있다.
		 *    여러 인스턴스가 공유해서 사용할 목적의 공간이다.
		 *    하지만 static 키워드의 남발은 유지보수와 추적이 힘든 코드를 작성하는 피해야할 방식이다.
		 *    명확한 목적이 존재하지 않는 이상 static 키워드 사용은 자제하자.
		 *    의도적으로 static 키워드를 사용하는 대표적인 예는 singleton 객체를 생성할 때 이다.
		 * */
		
		/* 목차. 1. static 키워드를 필드에서 사용 */
		/* 설명. StaticFieldTest 인스턴스 생성 */
		StaticFieldTest sft1 = new StaticFieldTest();
		
		/* 설명. 현재 두 필드가 가지고 있는 값 확인 */
		System.out.println("non-static filed : " + sft1.getNonStaticCount());		//0
		System.out.println("static filed : " + sft1.getStaticCount());				//0
		
		/* 설명. 두 필드의 값 1씩 증가 후 다시 값 확인 */
		sft1.increaseNonStaticCount();
		sft1.increaseStaticCount();
		
		System.out.println("non-static filed : " + sft1.getNonStaticCount());		//1
		System.out.println("static filed : " + sft1.getStaticCount());				//1
		
		/* 설명. 새로운 StaticFieldTest 인스턴스 생성 */
		StaticFieldTest sft2 = new StaticFieldTest();
		
		/* 설명. 두 필드가 가지고 있는 값 확인 */
		System.out.println("non-static filed : " + sft2.getNonStaticCount());		//0	//새롭게 생성
		System.out.println("static filed : " + sft2.getStaticCount());				//1	//값 유지
	
		/* 필기.
		 *  인스턴스 변수의 경우에는 sft1과 st2 두 개의 인스턴스가 서로 값을 공유하지 못하고
		 *  인스턴스를 생성할 때 마다 0으로 초기화 되었다.
		 *  하지만 static 필드의 경우에는 클래스변수 자체가 프로그램을 종료할 때 까지 유지되고 있기 때문에 값을 유지하고 있다.
		 *  따라서 여러 개의 인스턴스가 같은 공간을 공유할 목적으로 필드에 static 키워드를 사용한다.
		 * */
		
		/* 목차. 2. static 메소드 확인 */
		/* 목차. 2-1. non-static 메소드 호출 */
		/* 설명. StaticMethodTest 인스턴스 생성 후 호출 */
		StaticMethodTest smt = new StaticMethodTest();
		smt.nonStaticMethod();
		
		/* 주의사항.
		 *  static 메소드도 이렇게 호출은 할 수 있다.
		 *  하지만 static메소드의 경우에는 인스턴스를 생성하지 않고 호출하는 방식으로 사용해야 한다.
		 *  static method는 정적 영역에 두고 인스턴스를 생성하지 않고 호출할 목적으로 만들기 때문에
		 *  static 메소드를 호출하는 방식으로 호출해야 한다.
		 * */
		smt.staticMethod();						//권장하지 않음

		/* 목차. 2-2. static 메소드 호출 */
		/* 필기.
		 *  클래스명.메소드명으로 인스턴스를 생성하지 않고 호출할 수 있다.
		 *  예) Math 클래스의 메소드들
		 * */
		StaticMethodTest.staticMethod();		//권장함
	}
}
