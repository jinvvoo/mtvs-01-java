package com.ohgiraffers.section03.branching;

public class A_break {

	/**<pre>
	 * break문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * 분기문(break) 기본 흐름에 대해 테스트해보기
	 * </pre>
	 */
	public void testSimpleBreakStatement() {

		/* 수업목표. break문 사용에 대한 흐름을 이해하고 적용할 수 있다. */
		/* 필기.
		 *  break문은 반복문 내에서 사용한다.
		 *  해당 반복문을 빠져 나올 때 사용하며, 반복문의 조건문 판단 결과와 상관 없이 반복문을 빠져나올 때 사용한다.
		 *  일반적으로 if(조건식) { break; } 처럼 사용된다.
		 *  단, switch문은 반복문이 아니지만 예외적으로 사용된다.
		 * */
		
		/* 필기. break문을 이용하여 무란루프를 활용한 1~100까지 합계 구하기 */
		int sum = 0;
		int i = 1;
		while(true) {
			
			sum += i;
			
			/* 설명. 반복문 조건과 별개로 반복문을 빠져나오기 위한 조건을 다시 작성 */
			if(i == 100) {
				
				/* 설명. i가 100인 조건을 만족하는 경우 반복문을 빠져나옴 */
				break;
			}
			
			i++;
		}
		
		System.out.println("1부터 100까지의 합은 " + sum + "입니다.");
	}

	public void testSimpleBreakStatement2() {

		/* 수업목표. 중첩 반복문 내 break문 사용에 대한 흐름을 이해하고 적용할 수 있다. */
		/* 필기. break는 모든 반복문을 종료하는 것이 아닌, 자신에게 가장 인접한 반복문 실행만 멈춘다. */
		
		/* 필기.
		 *  구구단 2~9단까지 출력
		 *  단 각 단의 수가 5보다 큰 경우는 출력을 생략한다.
		 * */
		
		for(int dan = 2; dan < 10; dan++) {
			
			/* 설명. 여기까지만 빠져나옴 */
			for(int su = 1; su < 10; su++) {
				
				if(su > 5) {
					/* 설명. su가 5보다 큰 경우 해당 반복문을 빠져나온다. */
					break;
				}
				
				/* 설명. 반복문을 빠져나오지 않는 경우 구구단을 출력 */
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			
			System.out.println();
		}
	}

	public void testJumpBreak(){

		/* 수업목표. 중첩 반복문 내 break문 사용 시 jump(goto)에 대한 흐름을 이해하고 적용할 수 있다. */
		label:
		for(;;){
			for(int i = 0; i < 10; i++){
				System.out.println(i);
				if(i == 3){
					break label;
				}
			}
		}
	}
}
