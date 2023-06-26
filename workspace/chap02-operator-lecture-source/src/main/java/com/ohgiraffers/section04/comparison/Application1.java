package com.ohgiraffers.section04.comparison;

public class Application1 {

	public static void main(String[] args) {

		/* 수업목표. 비교연산자에 대해 이해하고 활용할 수 있다. */
		/* 필기.
		 *  비교연산자
		 *  비교연산자는 피연산자 사이에서 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다.
		 *  연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건절에 많이 사용된다. (충분히 연습이 필요함)

		/* 필기.
		 *  비교연산자의 종류
		 *  '==' : 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true 다르면 false를 반환
		 *  '!=' : 왼쪽의 피연산자와 오른쪽의 피연산자가 다르면 true 같으면 false를 반환
		 *  '>'  : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 true 아니면 false를 반환
		 *  '>=' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같으면 true 아니면 false를 반환
		 *  '<'  : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작으면 true 아니면 false를 반환
		 *  '<=' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작거나 같으면 true 아니면 false를 반환
		 * */
		
		/* 목차. 1. 숫자값 비교 */
		/* 목차. 1-1. 정수 비교 */
		int inum1 = 10;
		int inum2 = 20;
		
		System.out.println("============== 정수값 비교 ===============");
		System.out.println("inum1과 inum2가 같은지 비교 : " + (inum1 == inum2));
		System.out.println("inum1과 inum2가 같지 않은지 비교 : " + (inum1 != inum2));
		System.out.println("inum1이 inum2보다 큰지 비교 : " + (inum1 > inum2));
		System.out.println("inum1이 inum2보다 크거나 같은지 비교 : " + (inum1 >= inum2));
		System.out.println("inum1이 inum2보다 작은지 비교 : " + (inum1 < inum2));
		System.out.println("inum1이 inum2보다 작은거나 같은지 비교 : " + (inum1 <= inum2));
		
		/* 목차. 1-2. 실수 비교 */
		double dnum1 = 10.0;
		double dnum2 = 20.0;
		
		System.out.println("============== 실수값 비교 ===============");
		System.out.println("dnum1과 dnum2가 같은지 비교 : " + (dnum1 == dnum2));
		System.out.println("dnum1과 dnum2가 같지 않은지 비교 : " + (dnum1 != dnum2));
		System.out.println("dnum1이 dnum2보다 큰지 비교 : " + (dnum1 > dnum2));
		System.out.println("dnum1이 dnum2보다 크거나 같은지 비교 : " + (dnum1 >= dnum2));
		System.out.println("dnum1이 dnum2보다 작은지 비교 : " + (dnum1 < dnum2));
		System.out.println("dnum1이 dnum2보다 작은거나 같은지 비교 : " + (dnum1 <= dnum2));
		
		/* 목차. 2. 문자값 비교 */
		char ch1 = 'a';
		char ch2 = 'A';
		
		System.out.println("============== 문자값 비교 ===============");
		System.out.println("ch1과 ch2가 같은지 비교 : " + (ch1 == ch2));
		System.out.println("ch1과 ch2가 같지 않은지 비교 : " + (ch1 != ch2));
		System.out.println("ch1이 ch2보다 큰지 비교 : " + (ch1 > ch2));
		System.out.println("ch1이 ch2보다 크거나 같은지 비교 : " + (ch1 >= ch2));
		System.out.println("ch1이 ch2보다 작은지 비교 : " + (ch1 < ch2));
		System.out.println("ch1이 ch2보다 작은거나 같은지 비교 : " + (ch1 <= ch2));
		
		/* 목차. 3. 논리값 비교 */
		/* 필기. ==과 !=은 비교 가능하지만 대소비교는 불가능하다. */
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println("============== 논리값 비교 ===============");
		System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 == bool2));
		System.out.println("bool1과 bool2가 같지 않은지 비교 : " + (bool1 != bool2));
		//System.out.println("bool1이 bool2보다 큰지 비교 : " + (bool1 > bool2));
		//System.out.println("bool1이 bool2보다 크거나 같은지 비교 : " + (bool1 >= bool2));
		//System.out.println("bool1이 bool2보다 작은지 비교 : " + (bool1 < bool2));
		//System.out.println("bool1이 bool2보다 작은거나 같은지 비교 : " + (bool1 <= bool2));
		
		/* 목차. 4. 문자열값 비교 */
		/* 필기. 문자열도 ==과 !=은 비교 가능하지만 대소 비교는 불가능하다. */
		String str1 = "java";
		String str2 = "java";
		
		System.out.println("============== 문자값 비교 ===============");
		System.out.println("str1과 str2가 같은지 비교 : " + (str1 == str2));
		System.out.println("str1과 str2가 같지 않은지 비교 : " + (str1 != str2));
		//System.out.println("str1이 str2보다 큰지 비교 : " + (str1 > str2));
		//System.out.println("str1이 str2보다 크거나 같은지 비교 : " + (str1 >= str2));
		//System.out.println("str1이 str2보다 작은지 비교 : " + (str1 < str2));
		//System.out.println("str1이 str2보다 작은거나 같은지 비교 : " + (str1 <= str2));
		int x = 10;
		int y = 11;

		boolean result = x <= y;
		System.out.println("result의 값은 : " + result);
	}
}
