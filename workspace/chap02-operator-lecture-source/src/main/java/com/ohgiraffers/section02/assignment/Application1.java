package com.ohgiraffers.section02.assignment;

public class Application1 {

	public static void main(String[] args) {

		/* 수업목표. 대입연산자와 산술 복합 대입 연산자를 이해하고 활용할 수 있다. */
		/* 필기.
		 *  대입연산자와 산술 복합 대입 연산자
		 *  '='  : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입함
		 *  '+=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입함
		 *  '-=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피연산자에 대입함
		 *  '*=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼쪽의 피연산자에 대입함
		 *  '/=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 왼쪽의 피연산자에 대입함
		 *  '%=' : 왼족의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과를 왼쪽의 피연산자에 대입함
		 * */
		int num = 12;
		
		System.out.println("num : " +num);
		
		//3증가시
		num = num + 3;							//대입연산자의 오른쪽에는 값, 왼쪽에는 공간의 의미이다.
		System.out.println("num : " + num);
		
		num += 3;  								//num = num + 3; 과 같은 의미임
		System.out.println("num : " + num);
		
		num -= 5;  								//num = num - 5;
		System.out.println("num : " + num);
		
		num *= 2;  								//num값 2배 증가
		System.out.println("num : " + num);
		
		num /= 2;  								//num값 2배 감소
		System.out.println("num : " + num);
		
		/* 주의사항.
		 *  산술 복합 대입연산자의 작성 순서에 주의해야 한다.
		 *  산술 대입 연산자가 아닌 '-5'를 num에 대입한 것이다.
		 * */
		num =- 5;
		System.out.println("num : " + num);
	}
}
