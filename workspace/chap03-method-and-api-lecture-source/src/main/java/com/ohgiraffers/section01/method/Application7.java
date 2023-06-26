package com.ohgiraffers.section01.method;

public class Application7 {

	public static void main(String[] args) {

		/* 수업목표. 매개변수와 리턴값을 복합적으로 활용하는 것을 이해하고 활용할 수 있다. */
		/* 필기.
		 *  매개변수와 리턴값 복합 활용
		 *  매개변수도 존재하고 리턴값도 존재하는 메소드를 이용하여 간단한 계산기 만들기
		 * */

		int first = 20;
		int second = 10;
		
		Application7 app7 = new Application7();
		System.out.println("두 수를 더한 결과 : " + app7.plusTwoNumbers(first, second));
		System.out.println("두 수를 뺀 결과 : " + app7.minusTwoNumbers(first, second));
		System.out.println("두 수를 곱한 결과 : " + app7.multipleTwoNumbers(first, second));
		System.out.println("두 수를 나눈 결과 : " + app7.divideTwoNumbers(first, second));
		
	}

	public int plusTwoNumbers(int first, int second) {
		
		return first + second;
	}

	public int minusTwoNumbers(int first, int second) {
		
		return first - second;
	}

	public int multipleTwoNumbers(int first, int second) {
		
		return first * second;
	}

	public int divideTwoNumbers(int first, int second) {
		
		return first / second;
	}
}
