package com.ohgiraffers.section04.wrapper;

public class Application1 {

	public static void main(String[] args) {
		
		/* 수업목표. Wrapper 클래스에 대해 이해할 수 있다. */
		/* 설명.
		 *  상황에 따라 기본 타입의 데이터를 인스턴스화 해야 하는 경우들이 발생한다.
		 *  이 때 기본타입의 데이터를 먼저 인스턴스로 변환 후 사용해야 하는데
		 *  8가지에 해당하는 기본 타입의 데이터를 인스턴스화 할 수 있도록 하는 클래스를 래퍼클래스 (Wrapper class)
		 *  라고 한다. (주방에서 사용하는 랩(Wrap)과 같은 의미로 감싼다는 의미이다.)
		 * */
		
		/* 필기.
		 *  기본타입              래퍼클래스
		 *  byte          Byte
		 *  short         Short
		 *  int           Integer
		 *  long          Long
		 *  float         Float
		 *  double        Double
		 *  char          Character
		 *  boolean       Boolean
		 * */
		
		/* 필기.
		 *  박싱(Boxing)과 언박싱(UnBoxing)
		 *  기본타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것을 박싱(Boxing)이라고 하며,
		 *  래퍼클래스 타입의 인스턴스를 기본 타입으로 변경하는 것을 언박싱(UnBoxing)이라고 한다.
		 * */
		int intValue = 20;
		Integer boxingNumber1 = new Integer(intValue);		//인스턴스화 - 박싱(Boxing) //생성자 이용
		Integer boxingNumber2 = Integer.valueOf(intValue);	//static 메소드 이용
		
		int unBoxingNumber1 = boxingNumber1.intValue();		//언박싱(UnBoxing) //intValue() 이용
		
		/* 필기.
		 *  오토 박싱(AutoBoxing)과 오토 언박싱(AutoUnBoxing)
		 *  JDK 1.5부터는 박싱과 언박싱이 필요한 상황에서 자바 컴파일리가 이를 자동으로 처리해준다.
		 *  이런 자동화된 박싱과 언박싱을 오토박싱, 오토 언박싱 이라고 부른다.
		 * */
		
		Integer boxingNumber3 = intValue;					//오토 박싱
		
		int unBoxingNumber2 = boxingNumber3;				//오토 언박싱
		
		/* 설명. Wrapper 클래스 값 비교 */
		int inum = 20;
		Integer integerNum1 = new Integer(20);
		Integer integerNum2 = new Integer(20);
		Integer integerNum3 = 20;
		Integer integerNum4 = 20;
		
		/* 설명. 기본 타입과 래퍼클래스 타입은 == 연산으로 비교 가능하다. */
		System.out.println("int와 Integer 비교 : " + (inum == integerNum1));		//true
		System.out.println("int와 Integer 비교 : " + (inum == integerNum3));		//true
		
		/* 설명.
		 *  생성자를 이용해 생성한 인스턴스의 경우 ==로 비교하지 못한다.
		 *  단 오토 박싱을 이용해서 생성한 값은 ==로 비교가 가능하다.
		 * */
		System.out.println("integer와 integer 비교 : " + (integerNum1 == integerNum2));	//false
		System.out.println("integer와 integer 비교 : " + (integerNum1 == integerNum3));	//false
		System.out.println("integer와 integer 비교 : " + (integerNum3 == integerNum4));	//true
		
		/* 설명. 래퍼클래스 타입의 인스턴스를 비교할 때는 equals()를 사용해야 한다. */
		System.out.println("equals() : " + (integerNum1.equals(integerNum2)));		//true
		System.out.println("equals() : " + (integerNum1.equals(integerNum3)));		//true
		System.out.println("equals() : " + (integerNum3.equals(integerNum4)));		//true

		/* 설명.
		 *  Integer.valueOf()를 이용하여 인스턴스를 생성하는 것을 더 권장한다.
		 *  valueOf()는 동일한 값이 동일한 인스턴스임을 보장한다.
		 * */
		System.out.println("valueOf() : " + (Integer.valueOf(123) == Integer.valueOf(123)));
	}
}
