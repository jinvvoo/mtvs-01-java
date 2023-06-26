package com.ohgiraffers.section01.object.run;

import java.util.HashMap;
import java.util.Map;

import com.ohgiraffers.section01.object.book.Book;

public class Application3 {

	public static void main(String[] args) {

		/* 수업목표. Object 클래스의 hashCode() 메소드 오버라이딩 목적을 이해하고 활용할 수 있다. */
		/* 필기.
		 *  Object 클래스의 명세에 작성된 일반 규약에 따르면
		 *  equals() 메소드를 재정의 하는 경우 반드시 hashCode() 메소드도 재정의 하도록 되어 있다.
		 *  만약 hashCode()를 재정의 하지 않으면 같은 값을 가지는 동등 객체는
		 *  같은 해시코드값을 가져야 한다는 규약에 위반되게 된다. (강제성은 없지만 규약대로 작성하는 것이 좋음)
		 * */
		
		/* 설명. 동등객체 생성 후 hashCode 출력 */
		Book book1 = new Book(1, "홍길동전", "허균", 50000);
		Book book2 = new Book(1, "홍길동전", "허균", 50000);
		
		/* 설명.
		 *  동일한 필드 값을 가지고 있지만 두 인스턴스는 서로 다른 인스턴스이다.
		 *  따라서 hashCode값은 다르게 나오게 된다.
		 * */
		System.out.println("book1의 hashCode : " + book1.hashCode());
		System.out.println("book2의 hashCode : " + book2.hashCode());
		
		/* 설명.
		 *  동일한 필드값을 가지는 동등객체를 인스턴스를 구분하는 hashCode가 같은 동일객체로 취급하기 위해서는
		 *  hashCode 메소드를 재정의하여 동일한 필드값을 가지는 경우 동일한 hashCode를 반환하여
		 *  동일객체로 취급해야 하는 경우가 종종 존재한다.

		/* ----------------------------------------------- */
		
		/* 설명. hashCode를 재정의 하지 않은 경우 문제점 */
		
		/* 설명.
		 *  key와 value를 쌍으로 저장하는 자료구조인 HashMap에
		 *  key로 홍길동전 정보를 가지는 Book 타입의 인스턴스를 사용했다.
		 *  HashMap에서 홍길동전 정보를 가지는 인스턴스로 값을 꺼내오려 할 때
		 *  hashCode가 재정의되어 동일한 필드인 경우 동일 hashCode가 반환되도록 작성되어 있지 않다면
		 *  예상한 결과값과 다르게 null값을 반환받는다.
		 * */
		Map<Book, String> map = new HashMap<>();
		map.put(new Book(1, "홍길동전", "허균", 50000), "selled");
		
		String str = map.get(new Book(1, "홍길동전", "허균", 50000));
		
		/* 설명.
		 *  오버라이딩 전에는 selled를 예상하지만 null값이 나온다.
		 *  오버라이딩 후에는 selled가 나오게 된다.
		 * */
		System.out.println(str);
	}
}
