package com.ohgiraffers.section01.exception;

public class Application2 {
	
	public static void main(String[] args) {

		/* 수업목표. try catch 블럭을 이용하여 예외처리를 할 수 있다. */
		/* 목차. 2. try-catch를 이용한 방법(예외 발생 하지 않음) */
		
		/* 설명. ExceptionTest 인스턴스 생성 */
		ExceptionTest et = new ExceptionTest();
		
		/* 설명. 예외 발생 가능성이 있는 메소드 호출 */
		try {
			
			/* 설명. 예외 발생 가능성이 있는 메소드는 try 블럭 안에서 호출한다. */
			/* 설명. 상품 가격은 10000원이지만 가진 돈은 50000원 인 경우 */
			et.checkEnoughMoney(10000, 50000);
			
			/* 설명. 위의 메소드 호출시 예외가 발생하지 않는 경우 이후 내용은 마저 실행하게 된다. */
			System.out.println("================ 상품 구입 가능 ===================");
			
		} catch (Exception e) {
			
			/* 설명.
			 *  위의 메소드 호출시 예외가 발생하는 경우 catch 블럭의 코드를 실행한다.
			 *  이 때 예외 발생한 위치의 하단 코드는 동작하지 않는다.
			 * */
			System.out.println("================ 상품 구입 불가 ====================");
		}
		
		/* 설명. 프로그램을 종료하는지 확인. */
		System.out.println("프로그램을 종료합니다.");
	}
}
