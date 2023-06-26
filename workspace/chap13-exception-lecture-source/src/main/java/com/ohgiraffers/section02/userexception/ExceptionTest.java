package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {
	
	public void checkEnoughMoney(int price, int money)
			throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {
//			throws Exception {
		
		/* 설명. 먼저 상품 가격이 음수인지 확인하고, 음수인 경우 예외를 발생 */
		if(price < 0) {
			
			throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
		}
		
		/* 설명. 가진 돈도 음수인지 확인하고, 음수인 경우 예외를 발생  */
		if(money < 0) {
			
			throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
		}
		
		/* 설명. 위의 두 값이 정상 입력 되었더라도 상품 가격이 가진 돈 보다 큰 경우 예외 발생 */
		if(money < price) {
			
			throw new NotEnoughMoneyException("가진 돈 보다 상품 가격이 더 비쌉니다.");
		}
		
		/* 설명. 모든 조건이 만족하는 경우 정상적으로 물건 구입 가능 */
		System.out.println("가진 돈이 충분합니다. 즐거운 쇼핑 하세요~");
	}
}
