package com.ohgiraffers.section01.method;

public class Application1 {

	public static void main(String[] args) {

		/* 수업목표. 메소드의 호출 흐름에 대해 이해할 수 있다. */
		/* 필기.
		 *  메소드란?
		 *  메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
		 * */

		/* 설명.
		 *  자세한 메소드 사용법은 객체 부분에서 다루게 되니 지금은 호출 흐름에 대해 이해할 수 있도록 하자.
		 * */

		System.out.println("main() 시작됨...");


	    /* 목차. 1. main method 밖에 하단에 methodA라는 메소드를 추가한다.
		 * */
		
		/* 목차. 2. 작성한 메소드를 호출하는 부분을 작성한다. /*
		 * 필기.
		 *  메소드 호출 방법
		 *  클래스명 사용할이름 = new 클래스명();				//객체 생성
		 *  사용할이름.메소드명();								//메소드 호출
		 * */
		Application1 app1 = new Application1();
		app1.methodA();

		System.out.println("main() 종료됨...");
	}

	/* 목차. 1-1. methodA 작성 */
	public void methodA() {

		System.out.println("methodA() 호출함...");

		/* 목차. 1-2. methodB 호출 */
		methodB();			//메소드 호출 방식이 약간 다르다.	 우선 흐름에 집중하고 뒤에서 다시 다룰 부분이다.

		System.out.println("methodA() 종료됨...");
	}

	/* 목차. 1-3. methodB 작성 */
	public void methodB() {

		System.out.println("methodB() 호출함...");

		/* 목차. 1-4. methodC 호출 */
		methodC();

		System.out.println("methodB() 종료됨...");
	}

	/* 목차. 1-5. methodC 작성 */
	public void methodC() {

		System.out.println("methodC() 호출함...");

		System.out.println("methodC() 종료됨...");
	}
}
