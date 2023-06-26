package com.ohgiraffers.section06.singleton;

public class LazySingleton {
	
	/* 설명. 클래스가 초기화 되는 시점에서는 정적 필드를 선언해두고 null로 초기화된다. */
	private static LazySingleton lazy;
	
	/* 설명. 싱글톤 패턴은 생성자 호출을 통해 외부에서 인스턴스를 생성하는 것을 제한한다. */
	private LazySingleton() {}
	
	/* 설명. public 인터페이스로 인스턴스를 반환하도록 한다. */
	public static LazySingleton getInstance() {
		
		/* 필기.
		 *  인스턴스를 생성한 적이 없는 경우 인스턴스를 생성해서 반환하고
		 *  생성한 인스턴스가 있는 경우 만들어둔 인스턴스를 반환한다.
		 * */
		if(lazy == null) {
			/* 설명. 인스턴스를 생성한 적이 없는 경우 새로운 인스턴스 생성 */
			lazy = new LazySingleton();
		}
		
		return lazy;
	}
}
