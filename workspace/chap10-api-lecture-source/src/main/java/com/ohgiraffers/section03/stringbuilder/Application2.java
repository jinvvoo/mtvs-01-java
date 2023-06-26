package com.ohgiraffers.section03.stringbuilder;

public class Application2 {

	public static void main(String[] args) {
		
		/* 수업목표. StringBuilder의 자주 사용되는 메소드의 용법을 이해할 수 있다. */
		/* 설명. StringBuilder 기본 생성자로 인스턴스 생성 */
		StringBuilder sb1 = new StringBuilder();
		
		/* 필기. capacity() : 용량(현재 버퍼의 크기)을 정수형으로 반환하는 메소드 (문자열 길이 + 16이 기본 용량) */
		System.out.println(sb1.capacity());
		
		/* 필기.
		 *  append() : 인자로 전달된 값을 문자열로 변환 후 기존 문자열의 마지막에 추가한다.
		 *  기본 용량을 초과하는 경우 (기존 문자열 + 1) * 2를 하여 용량을 확장시킨다.
		 *  https://stackoverflow.com/questions/3184244/stringbuilder-capacity
		 * */
		for(int i = 0; i < 50; i++) {
			sb1.append(i);
			
			System.out.println("sb1 : " + sb1);
			System.out.println("capacity : " + sb1.capacity());		//2n + 2씩 증가함
			System.out.println("hashcode : " + sb1.hashCode());		//동일 인스턴스임
		}
		
		/* 설명. 새로운 StringBuilder 인스턴스 생성 */
		StringBuilder sb2 = new StringBuilder("javaoracle");
		
		/* 필기.
		 *  delete() : 시작 인덱스와 종료 인덱스를 이용해서 문자열에서 원하는 부문의 문자열을 제거한다.
		 *  deleteCharAt() : 문자열 인덱스를 이용해서 문자 하나를 제거한다.
		 *  둘 다 원본에 영향을 미친다.
		 *  */
		System.out.println("delete() : " + sb2.delete(2, 5));				//jaracle
		System.out.println("deleteCharAt() : " + sb2.deleteCharAt(0));		//aracle
		
		System.out.println("sb2 : " + sb2);									//aracle
		
		/* 필기.
		 *  insert() : 인자로 전달된 값을 문자열로 변환 후 지정한 인덱스 위치에 추가한다.
		 *  원본에 영향을 미친다.
		 * */
		System.out.println("insert() : " + sb2.insert(1, "vao"));
		System.out.println("insert() : " + sb2.insert(0, "j"));
		/* 인덱스 번호가 문자열의 길이와 같은 경우 append()와 같은 역할을 한다. */
		System.out.println("insert() : " + sb2.insert(sb2.length(), "jdbc"));
		
		System.out.println("sb2 : " + sb2);
		
		/* 필기.
		 *  reverse() :  문자열 인덱스 순번을 역순으로 재배열한다.
		 *  원본에 영향을 미친다.
		 * */
		System.out.println("reverse() :" + sb2.reverse());
		System.out.println("sb2 : " + sb2);
		
		/* 필기.
		 *  String 클래스와 동일한 메소드도 있다.
		 *  charAt(), indexOf()/lastIndexOf(), length(), replace(), substring(), toString()
		 * */
	}
}
