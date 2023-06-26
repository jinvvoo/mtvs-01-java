package com.ohgiraffers.section02.extend;

public class Bunny extends Rabbit {

	/* 설명. 바니도 토끼이다. Rabbit을 상속받는다. */
	
	/* 설명. cry() 메소드를 오버라이딩 하자 */
	@Override
	public void cry() {
		System.out.println("바니바니 바니바니 당근 당근");
	}
	
	/* 설명. 바니를 상속받는 DrunkenBunny를 하나 더 만들자 */
}
