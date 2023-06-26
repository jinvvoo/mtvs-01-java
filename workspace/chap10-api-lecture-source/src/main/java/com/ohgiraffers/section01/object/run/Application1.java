package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application1 {

	public static void main(String[] args) {

		/* 수업목표. Object 클래스의 toString() 메소드 오버라이딩 목적을 이해하고 활용할 수 있다. */
		/* 필기.
		 *  모든 클래스는 Object 클래스의 후손이다.
		 *  따라서 Object 클래스가 가진 메소드를 자신의 것 처럼 사용할 수 있다.
		 *  또한 부모 클래스가 가지는 메소드를 오버라이딩 해서 사용하는 것도 가능하다.
		 * 
		 * 필기.
		 *  Object 클래스의 메소드 중 관례상 많이 오버라이딩 해서 사용하는 메소드들이 있다.
		 *  toString(), equals(), hashcode() 이다.
		 * */
		
		/* 설명. 
		 *  API 문서에서 java.lang.Object 클래스의 toString() 메소드의 기능과 선언부를 확인해보면
		 *  인스턴스가 생성될 때 사용한 full class name과 @ 그리고 16진수 해시코드가 문자열로 반환된다.
		 *  16진수 해쉬코드는 인스턴스의 주소를 가리키는 값으로 인스턴스마다 모두 다르게 반환된다.
		 * */
		Book book1 = new Book(1, "홍길동전", "허균", 50000);
		Book book2 = new Book(2, "목민심서", "정약용", 30000);
		Book book3 = new Book(2, "목민심서", "정약용", 30000);
		
		/* 설명.
		 *  동일한 값을 가지는 인스턴스도 다른 해시코드값을 가지고 있다.
		 *  풀 클래스 이름과 @ 그리고 16진수 해시코드를 반환한다.
		 * */
		System.out.println("book1.toString() : " + book1.toString());
		System.out.println("book2.toString() : " + book2.toString());
		System.out.println("book3.toString() : " + book3.toString());
		
		/* 설명.
		 *  toString()을 호출하기 않고 레퍼런스 변수만 출력하는경우 동일하게 결과가 나온다.
		 *  이 경우 자동으로 toString() 메소드를 호출해준다.
		 *  그래서 이런 편리한 점을 이용하여 toString() 메소드를 재정의해서 사용하게 된다.
		 * */
		System.out.println("book1 : " + book1);
		System.out.println("book2 : " + book2);
		System.out.println("book3 : " + book3);
	}
	
}
