package com.ohgiraffers.section04.overflow;

public class Application1 {

	public static void main(String[] args) {
		
		/* 수업목표. 오버플로우에 해대 이해할 수 있다. */
		/* 필기.
		 *  자료형 별 값의 최대 범위를 벗어나는 경우
		 *  발생한 carry를 버림처리 하고 sign bit를 반전시켜 최소값으로 순환시킴
		 * */

		/* 목차. 1. 오버플로우 */
		byte num1 = 127;
		
		System.out.println("num1 : " + num1);						//127 : byte의 최대 저장 범위
		
		num1++;														//1 증가
		
		System.out.println("num1 overflow : " + num1);				//-128 : byte의 최소 저장 범위
		
		/* 목차 2. 언더플로우 */
		/* 필기. 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다.
		 * */
		byte num2 = -128;
		
		System.out.println("num2 : " + num2);						//-128 : byte의 최소 저장 범위
		
		num2--;														//1 감소
		
		System.out.println("num2 underflow : " + num2);				//127 : byte의 최대 저장 범위
		
		/* 설명.
		 *  이러한 오버플로우와 언더플로우가 발생한다고 하여 컴파일 에러나 런타임 에러가 발생하지 않는다.
		 *  그렇기에 최대값 혹은 최소값 범위를 고려해서 코드를 작성해야 한다.
		 * */
		
		/* 설명.
		 *  일반적으로 많이 사용하는 int형의 최대값은 대략 21억 정도이다.
		 *  이 범위를 벗어난 계산은 오버플로우를 발생시켜서 원하지 않는 결과값이 나오게 될 수 있다.
		 * */
		int firstNum = 1000000;			//100만
		int secondNum = 700000;			//70만
		
		int multi = firstNum * secondNum;		//7천억이 나와야 함
		
		System.out.println("firstNum * secondNum = " + multi);			//--79669248 이 나온다.
		
		/* 설명.
		 *  이런 현상이 발생해도 그냥 넘기는 경우가 발생할 수 있다.
		 *  이런 경우를 논리적 에러라고 표현한다. (디버깅 시 가장 힘든 이유 중 한 가지)
		 * */
		
		/* 목차. 3.해결방법 */
		/* 필기. 오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리한다. */
		long longMulti = firstNum * secondNum;
		
		System.out.println("longMulti : " + longMulti);		//안되지?? 똑같지??
		
		/* 설명.
		 *  이미 오버플로우 처리 된 결과를 가지고 변수에 담기 때문에 위에 결과랑 별 차이가 없다.
		 *  그럼 어떻게 해결을 해야 하나?
		 *  계산이 처리 되기 전에 long 타입으로 자료형을 변경해주어야 한다. (강제형변환 이용)
		 *  강제 형변환은 바로 다음 파트에서 다루게 될 예정이다.
		 * */
		long result = (long) firstNum * secondNum;
		
		System.out.println("result : " + result);			//정상적으로 7천억이 출력될 것이다.
	}
}
