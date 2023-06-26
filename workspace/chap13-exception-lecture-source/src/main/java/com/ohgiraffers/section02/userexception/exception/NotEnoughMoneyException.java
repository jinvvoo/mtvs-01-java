package com.ohgiraffers.section02.userexception.exception;

public class NotEnoughMoneyException extends Exception {
	
	/* 설명.
	 *  사용자 정의의 예외클래스를 만들기 위해서는 Exception 클래스를 상속받으면 된다.
	 *  경우에 따라서는 더 상위 타입인 Throwable 클래스나, 하위 타입인 RuntimeException 클래스를 상속받기도 한다.
	 * */
	
	/* 설명. 기본생성자 */
	public NotEnoughMoneyException() {}
	
	/* 설명. 문자열을 부모 생성자쪽으로 전달하며 초기화하는 생성자 */
	public NotEnoughMoneyException(String message) {
		
		/* 설명. 예외 인스턴스 생성 시점에 전달한 예외 메세지를 부모 생성자쪽으로 전달해서 인스턴스를 생성한다. */
		super(message);
	}
	
	/* 설명.
	 *  생각보다 복잡하지는 않다. 조금 더 예외 클래스를 추가해보자
	 *  우선 money와 price가 각각 음수로 입력되는 경우 일반적인 상식에서 벗어나는 프로그램이 된다.
	 *  만약 각각 음수로 입력되는 경우 예외를 던지고, 그 예외 이름을 이용해서 예외의 이유를 구체적으로 알 수 있도록 할 것이다.
	 *  먼저 NegativeException 클래스를 만들 것이고,
	 *  이를 상속받는 PriceNegativeException과 MoneyNegativeException를 순서대로 만들 것이다.
	 *  */
}
