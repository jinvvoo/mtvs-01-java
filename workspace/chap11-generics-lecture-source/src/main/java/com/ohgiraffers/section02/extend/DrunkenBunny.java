package com.ohgiraffers.section02.extend;

public class DrunkenBunny extends Bunny {
	
	/* 설명. DrunkenBunny는 Bunny를 상속받는다. */
	
	@Override
	public void cry() {
		System.out.println("봐니봐니 봐니봐니 당근! 당근!@@#@!#");
	}
	
	/* 설명.
	 *  이제 제네릭을 이용한 클래스를 하나 만들 것이다.
	 *  RabbitFarm (토끼농장) 클래스를 하나 만들자
	 *  */
}
