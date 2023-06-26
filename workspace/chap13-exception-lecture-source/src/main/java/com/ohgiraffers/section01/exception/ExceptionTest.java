package com.ohgiraffers.section01.exception;

public class ExceptionTest {
	
	public void checkEnoughMoney(int price, int money) throws Exception {
		
		System.out.println("가지고 계신 돈은 " + money + "원 입니다.");
		
		if(money >= price) {
			System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
		} else {
			
			/* 설명.
			 *  강제로 예외 발생
			 *  예외 발생 시키고 메소드 헤드에 throws 구문 추가한다.
			 *  예외를 발생시킨 쪽에서는 throws로 예외에 대한 책임을 위임해서
			 *  해당 예외에 대한 처리를 강제화 시킨다.
			 * */
			throw new Exception();
		}
		
		/* 설명. 예외가 발생하지 않는 경우에 실행한다. */
		System.out.println("즐거운 쇼핑 하세요~");
	}
}
