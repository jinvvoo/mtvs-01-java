package com.ohgiraffers.section02.encapsulation.problem3;

public class Application {
	
	public static void main(String[] args) {

		/* 수업목표. 필드에 직접 접근 시 발생하는 문제를 해결하는 방법을 이해하고 적용할 수 있다. */
		/* 설명. 몬스터 객체를 여러 개 생성해보자 */
		Monster monster1 = new Monster();
		monster1.setInfo("드라큘라");
		monster1.setHp(100);
		
		Monster monster2 = new Monster();
		monster2.setInfo("프랑켄슈타인");
		monster2.setHp(200);
		
		Monster monster3 = new Monster();
		monster3.setInfo("늑대인간");
		monster3.setHp(300);
		
		Monster monster4 = new Monster();
		monster4.setInfo("미이라");
		monster4.setHp(400);
		
		System.out.println(monster1.getInfo());
		System.out.println(monster2.getInfo());
		System.out.println(monster3.getInfo());
		System.out.println(monster4.getInfo());
		
		/* 설명.
		 *  문제 없이 잘 동작한다.
		 *  Monster 클래스에서 name 필드를 kinds로 변경해보자 */
		
		/* ---------------------------------------------- */
		/* 설명. 하지만 여전히 필드에 접근할 수 도 있다. */
		monster4.kinds = "두치";
		monster4.hp = -500;
		
		System.out.println("monster4 kinds : " + monster4.kinds);
		System.out.println("monster4 hp : " + monster4.hp);
	}

}
