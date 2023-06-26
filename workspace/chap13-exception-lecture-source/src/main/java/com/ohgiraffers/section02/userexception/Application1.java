package com.ohgiraffers.section02.userexception;

public class Application1 {

	public static void main(String[] args) {

		/* 수업목표. 사용자 정의의 예외클래스 정의 후 발생한 사용자 정의의 예외를 처리할 수 있다. */
		/* 설명.
		 *  사전에 정의되어 있는 Exception의 종류는 굉장히 많이 있다.
		 *  하지만 RuntimeException의 후손 대부분은 예외처리를 강제화 하지 않는다.
		 *  간단한 조건문등으로 처리가 가능하기 때문에 따로 강제화 하지 않았다.
		 * */
		
		/* 설명.
		 *  사전에 정의된 예외클래스 외에 개발자가 원하는 명칭의 예외클래스를 작성하는 것이 가능하다.
		 *  extends Exception으로 예외처리 클래스를 상속받아 더 구체적인 예외 이름을 정의하는 것이다.
		 *  여기서는 사용자 정의의 예외처리로 아까 만들었는 프로그램을 조금 더 업그레이드를 시켜보자
		 * */

		ExceptionTest et = new ExceptionTest();
		
		/* 설명. 정상적인 프로그램의 흐름을 만들기 위해서는 try-catch 블럭을 작성하는 것이 좋다. */
		try {
			
			/* 설명. 상품 가격보다 가진 돈이 적은 경우 */
			/* 설명. 실행해보면 예외 종류와 에러 메세지가 출력된다. */
//			et.checkEnoughMoney(50000, 30000);

			/* 설명. 상품 가격을 음수로 입력한 경우 */
//			et.checkEnoughMoney(-50000, 50000);
			
			/* 설명. 가진 돈을 음수로 입력하는 경우 */
//			et.checkEnoughMoney(50000, -60000);
			
			/* 설명.
			 *  정상적으로 구매가 가능한 돈을 가진 경우
			 *  위에 코드 주석 하지 않으면 이 코드는 동작하지 않는다. catch블럭으로 가는 것이다.
			 * */
			et.checkEnoughMoney(30000, 50000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
