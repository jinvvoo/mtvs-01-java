package com.ohgiraffers.section01.method;

public class Application5 {

	public static void main(String[] args) {

		/* 수업목표. 메소드 리턴에 대해 이해할 수 있다. */
		/* 필기.
		 *  return 이란?
		 *  모든 메소드 내부에는 return; 이 존재한다.
		 *  void 메소드의 경우 return;을 명시적으로 작성하지 않아도 마지막줄에 컴파일러가 자동으로 추가를 해준다.
		 *  return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어이다.
		 * */

		System.out.println("main() 메소드 시작함...");
		
		/* 목차. 1. 메소드 리턴 테스트 */
		/* 설명.
		 *  testMethod1()을 작성하고 호출해서 테스트 해보면 정상 동작 하는것을 볼 수 있다.
		 *  testMethod1() 하단에 return; 구문을 추가해보자!!
		 *  추가하고 실행해도 동일한 결과가 출력될 것이다.
		 * */
		Application5 app5 = new Application5();
		app5.testMethod();

		System.out.println("main() 메소드 종료됨...");
	}
	
	public void testMethod() {
		System.out.println("testMethod() 동작 확인...");
		
		/* 필기.
		 *  컴파일러에 의해 자동으로 추가되는 구문이다.
		 *  가장 마지막에 작성해야 하고, 마지막에 작성되지 않을 경우 컴파일 에러를 발생시킨다.
		 * */
//		return;
		
//		System.out.println("test");			//에러 발생, return은 메소드 가장 마지막에 작성해야 한다.
	}
}
