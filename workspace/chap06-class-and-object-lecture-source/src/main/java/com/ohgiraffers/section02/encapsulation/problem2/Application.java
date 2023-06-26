package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {
	
	public static void main(String[] args) {

		/* 수업목표. 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해할 수 있다. */
		/* 설명.
		 *  필드의 이름이나 자료형을 변경할 때 사용한 쪽 모두 코드를 수정해야 하는 경우가 생긴다.
		 *  즉, 작은 변경이 사용하는 다른 여러 곳의 변경도 함께 초래하게 된다.
		 * */

		/* 설명. monster 3마리 추가 */
		/* 설명. 필드를 name에서 kinds로 변경하고 나면 호출한 코드도 변경에 대한 책임이 따르게 된다. */
//		Monster monster1 = new Monster();
//		monster1.name = "드라큘라";
//		monster1.hp = 200;
//
//		Monster monster2 = new Monster();
//		monster2.name = "프랑켄슈타인";
//		monster2.hp = 300;
//
//		Monster monster3 = new Monster();
//		monster3.name = "미이라";
//		monster3.hp = 400;
//
//		System.out.println("monster1 name : " + monster1.name);
//		System.out.println("monster1 hp : " + monster1.hp);
//		System.out.println("monster2 name : " + monster2.name);
//		System.out.println("monster2 hp : " + monster2.hp);
//		System.out.println("monster3 name : " + monster3.name);
//		System.out.println("monster3 hp : " + monster3.hp);
		
		/* ---------------------- */
		/* 설명.
		 *  name -> kinds로 변경했기 때문에 직접 name 필드에 접근하는 코드는 전부 컴파일 에러를 발생시킨다.
		 *  즉, Monster클래스의 일부를 수정한 것 뿐인데 사용하는 곳에서는 전부 함께 수정을 해야 하는 부담이 생긴 것이다.
		 *  이것은 유지보수에 악형향을 미친다.
		 * */
	}
}
