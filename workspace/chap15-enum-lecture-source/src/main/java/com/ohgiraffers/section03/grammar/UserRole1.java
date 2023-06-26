package com.ohgiraffers.section03.grammar;

public enum UserRole1 {
	
	/* 필기. Enum은 상수 하나하나가 인스턴스화 될 수 있다. */
	GUEST,
	CONSUMER,
	PRODUCER,
	ADMIN;
	
	/* 필기.
	 *  기본 생성자를 가질 수 있다.
	 *  default와 private접근제한 사용 가능하지만 외부에서 호출은 불가능함(묵시적으로 private)
	 *  enum 타입은 고정된 상수들의 집합으로, 런타임이 아닌 컴파일 시에 모든 값이 결정되어 있어야 한다.
	 *  따라서 다른 클래스에서 enum타입에 접근해 동적으로 생성자를 이용해 어떤 값을 전달해 줄 수 없기 때문이다.
	 *  단, 생성자를 가질 시 열거형 상수 선언 마지막에 세미콜론을 붙여야 한다.
	 * */
	UserRole1() {}
	
	/* 설명. 필요한 경우 메소드도 만들 수 있다. */
	public String getNameToLowerCase() {
		return this.name().toLowerCase();
	}
	
}
