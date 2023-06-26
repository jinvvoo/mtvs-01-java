package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {
	
	/* 설명. non-static 필드와 static필드 선언 */
	private int nonStaticCount;
	private static int staticCount;
	
	/* 설명. 기본생성자 */
	public StaticFieldTest() {}
	
	/* 설명. 두 필드에 대한 값을 확인 */
	public int getNonStaticCount() {
		return this.nonStaticCount;
	}
	
	public int getStaticCount() {
		
		/* 필기.
		 *  static 필드에 접근하기 위해서는 클래스명.필드명 으로 접근한다.
		 *  this.으로도 접근은 가능하지만 this.을 사용하지 않는 것이 좋다.
		 * */
		return StaticFieldTest.staticCount;
	}
	
	/* 설명. 두 필드 값을 1씩 증가시키기 위한 용도의 메소드 */
	public void increaseNonStaticCount() {
		this.nonStaticCount++;
	}
	
	public void increaseStaticCount() {
		StaticFieldTest.staticCount++;
	}
}
