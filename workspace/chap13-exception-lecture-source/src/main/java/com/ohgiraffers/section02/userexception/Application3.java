package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application3 {

	public static void main(String[] args) {

		/* 수업목표. multi-catch 블럭으로 동일한 레벨의 다른 타입의 예뢰를 하나의 catch블럭으로 처리할 수 있다. */
		/* 필기.
		 *  JDK 1.7에서 추가된 구문으로
		 *  동일한 레벨의 다른 타입의 예외를 하나의 catch 블럭으로 다룰 수 있다.
		 * */
		
		ExceptionTest et = new ExceptionTest();

		try {
			et.checkEnoughMoney(20000, 10000);
		
		/* 설명. 예외 상황별로 catch블럭을 따로 작성해서 처리할 수 있다. */
		} catch(NotEnoughMoneyException e) {
			
			/* 설명.
			 *  예외 클래스명, 예외발생 위치, 예외 메세지 등을 stack 호출 역순으로
			 *  빨간색 글씨를 이용해서 로그 형태로 출력해주는 기능
			 */
			e.printStackTrace();
		} catch(PriceNegativeException | MoneyNegativeException e) {
			
			/* 설명. e.getClass()로 발생한 예외클래스의 이름을 알 수 있다. */
			System.out.println(e.getClass() + " 발생!");
			System.out.println(e.getMessage());
		} finally {
			/* 설명. 예외 발생 여부와 상관 없이 실행할 내용 */
			System.out.println("finally 블럭의 내용이 동작함");
		}
		
		/* 설명. 프로그램을 종료하는지 확인 */
		System.out.println("프로그램을 종료합니다.");
	}
}
