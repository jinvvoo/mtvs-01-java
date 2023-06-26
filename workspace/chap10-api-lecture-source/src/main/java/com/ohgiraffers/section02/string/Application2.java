package com.ohgiraffers.section02.string;

public class Application2 {

	public static void main(String[] args) {

		/* 수업목표. 문자열 객체를 만드는 다양한 방법을 숙지하고 인스턴스가 생성되는 방식을 이해할 수 있다. */
		/* 필기.
		 *  문자열 객체를 만드는 방법
		 *  "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다. (singleton)
		 *  new Stirng("문자열") : 매번 새로운 인스턴스를 생성한다.
		 * */
		
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		
		/* 설명.
		 *  리터럴 형태로 만든 문자열 인스턴스는 동일한 값을 가지는 인스턴스는 하나의 인스턴스로 관리한다.
		 *  따라서 주소값을 비교하는 == 연산으로 비교 시 서로 동일한 stack에 저장된 주소를 비교하여 true를 반환한다.
		 * */
		System.out.println("str1 == str2 : " + (str1 == str2));
		
		/* 설명.
		 *  new로 새로운 인스턴스를 생성하게 되면 기존 인스턴스를 두고 새로운 인스턴스를 할당했기 때문에
		 *  == 연산으로 비교 시 서로 다른 주소값을 가지고 있기 때문에 false를 반환한다.
		 * */
		System.out.println("str2 == str3 : " + (str2 == str3));
		
		/* 설명.
		 *  동일한 방식으로 인스턴스를 생성하고 값 또한 같더라도
		 *  새로운 인스턴스를 생성하는 방식은 서로 다른 주소를 가지고 있기 때문에 false를 반환한다.
		 * */
		System.out.println("str3 == str4 : " + (str3 == str4));
		
		/* 설명.
		 *  하지만 4개의 문자열 모두 동일한 hashCode값을 가진다.
		 *  동일한 문자열은 동일한 hashCode값을 반환하도록 재정의 되어 있기 때문이다.
		 * */
		System.out.println("str1의 hashCode : " + str1.hashCode());
		System.out.println("str2의 hashCode : " + str2.hashCode());
		System.out.println("str3의 hashCode : " + str3.hashCode());
		System.out.println("str4의 hashCode : " + str4.hashCode());
		
		/* 설명.
		 *  문자열은 불변이라는 특징을 가진다.
		 *  기존 문자열에 + 연산을 수행하는 경우 문자열을 수정하는 것이 아닌 새로운 문자열을 할당하게 된다.
		 * */
		str2 += "oracle";
		
		/* 설명. str1과 str2는 동일한 인스턴스였지만 수정 후에는 다른 인스턴스가 된 것을 알 수 있다. */
		System.out.println("str1 == str2 : " + (str1 == str2));
		
		/* 필기.
		 *  equals() : String 클래스의 equals() 메소드는 인스턴스 비교가 아닌 문자열값을 비교하여
		 *  동일한 값을 가지는 경우 true, 다른 값을 가지는 경우 false를 반환하도록 Object의 equals()메소드를
		 *  재정의 해 두었다.
		 *  따라서 문자열 인스턴스 생성 방식과 상관 없이 동일한 문자열인지를 비교하기 위해 == 연산 대신
		 *  equals() 메소드를 사용해야 한다.
		 * */
		System.out.println("str1.equals(str3) : " + str1.equals(str3));
		System.out.println("str1.equals(str4) : " + str1.equals(str4));
		
		/* 설명.
		 *  참고로 new java.util.Scanner(System.in).nextLine(); 을 이용해 문자열을 입력받는 경우
		 *  substring으로 잘라내기 해서 새로운 문자열을 생성 후 반환하기 때문에
		 *  new String()으로 인스턴스를 생성한것과 동일한 것으로 볼 수 있다.
		 *  따라서 Scanner로 입력받은 문자열을 비교할 때에는 equals()를 써야 한다.
		 *  구분하기 힘들면 그냥 문자열은 다 equals()로 비교하는 것이 가장 좋은 방법이다.
		 * */
	}
}
