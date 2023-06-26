package com.ohgiraffers.section03.branching;

/**
 * <pre>
 * Class : Application
 * Comment : 분기문 테스트 클래스들을 호출하기 위한 main() 포함한 실행용 클래스
 * History
 * 2020/09/15 (김진호) 처음 작성함
 * </pre>
 * @author 김진호
 * @version 1.0.0
 * */
public class Application {

	public static void main(String[] args) {
		
		A_break a = new A_break();
		/* break문 흐름 확인용 메소드 호출 */
		//a.testSimpleBreakStatement();
		//a.testSimpleBreakStatement2();
		//a.testJumpBreak();
		
		B_continue b = new B_continue();
		/* continue문 흐름 확인용 메소드 호출 */
		//b.testSimpleContinueStatement();
		//b.testSimpleContinueStatement2();
		b.testJumpContinue();

	}
}
