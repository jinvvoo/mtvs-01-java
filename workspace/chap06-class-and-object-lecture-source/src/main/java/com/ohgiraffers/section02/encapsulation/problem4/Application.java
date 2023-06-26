package com.ohgiraffers.section02.encapsulation.problem4;

public class Application {
	
	public static void main(String[] args) {

		/* 수업목표. 접근제한제에 대해 이해하고 직접 필드에 접근하지 못하게 강제화 할 수 있다. */
		/* 설명.
		 *  Monster 클래스의 필드를 private 만들고 객체를 생성한 뒤 필드에 직접 접근하면 compile error를 발생시킨다.
		 *  접근을 허용하지 않았기 때문에 직접 접근할 수 없다는 의미이다.
		 *  메소드를 통한 간접 접근을 강제화 한 것이다.
		 * */
		/* 목차. 1. private 필드에 직접 접근 하여 compile error 발생 확인 */
		Monster monster1 = new Monster();
//		monster1.kinds = "프랑켄슈타인";		//에러 발생
//		monster1.hp = 200;					//에러 발생
		
		/* 필기.
		 *  선언한 필드대로 공간은 생성되어 있지만 직접 접근하지 못하고
		 *  public으로 접근을 허용한 메소드만 이용할 수 있도록 해 놓은 것이다.
		 *  이것을 캡슐화(encapsulation) 라고 부른다. */

		/* 목차. 2. public 메소드를 이용하여 필드에 간접 접근 */
		monster1.setKinds("프랑켄슈타인");
		monster1.setHp(200);
		
		System.out.println(monster1.getInfo());
		
		/* 설명.
		 *  캡슐화는 유지보수성을 증가시키기 위해 필드의 직접 접근을 제한하고
		 *  public 메소드를 이용해서 간접적으로 접근하여 사용할 수 있도록 만든 기술이다.
		 *  클래스 작성 시 특별한 목적이 아닌 이상 캡슐화가 기본 원칙으로 사용되고 있다.
		 * */
	}
}
