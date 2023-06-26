package com.ohgiraffers.section01.user_type;

public class Application {

	public static void main(String[] args) {

		/* 수업목표. 클래스가 무엇인지 이해하고 작성할 수 있다. */
		/* 설명.
		 *  지금까지 자바에서 제공되는 자료들을 취급하는 자료형에 대해 학습했다.
		 *  이제 조금 더 복잡한 자료를 취급할 수 있는 방법을 생각해보자
		 *  회원 정보를 관리하기 위해 회원의 여러 정보(아이디, 비밀번호, 이름, 나이, 성별, 취미)를 취급하여 관리 하려고 한다.
		 *  지금까지 배운 내용을 가지고 한 번 값을 저장하고 출력해보자
		 * */

		/* 목차. 1. 변수를 이용한 회원데이터 관리 */
		String id = "user01";
		String pwd = "pass01";
		String name = "홍길동";
		int age = 20;
		char gender = '남';
		String[] hobby = new String[] {"축구", "볼링", "테니스"};
		
		System.out.println("id : " + id);
		System.out.println("pwd : " + pwd);
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("gender : " + gender);
		System.out.print("hobby : ");
		for(int i = 0; i < hobby.length; i++) {
			System.out.print(hobby[i] + " ");
		}
		System.out.println();
		
		/* 필기.
		 *  이렇게 각각의 변수로 관리하게 되면 여러 가지 단점이 있다.
		 *  1. 변수명을 다 관리해야 하는 어려움이 생긴다.
		 *  2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 하면 너무 많은 값들을 인자로 전달해야 해서 한 눈에 안들어온다.
		 *  3. 리턴은 1개의 값만 가능하기 때문에 회원정보를 묶어서 리턴값으로 사용할 수 없다. (서로 다른 자료형들이기 때문)
		 * */
		
		/* 설명.
		 *  그래서 자바에서는 서로 다른 자료형의 데이타를 사용자(개발자) 정의로 하나로 묶어서 새로운 타입을 정의할 수 있는 방법을 제공해준다.
		 *  필요로 하는 자료형이 추가로 존재하는 경우 자바에서는 클래스라는 매커니즘을 이용해서 사용자 정의의 자료형을 만들 수 있게 한다.
		 *  위에서 만든 데이터들의 공통적인 부분은 '회원정보' 라는 것이다.
		 *  이러한 공통점을 고려하여 그룹화 할 수 있는 명사 형태로 클래스를 작성할 것이다.
		 *  Member라는 클래스를 추가해보자.
		 * */
		
		/* 목차. 2. 사용자 정의의 자료형 사용하기 */
		/* 목차. 2-1. 변수 선언 및 객체 생성 */
		/* 필기.
		 *  자료형 변수명 = new 클래스명(); <- 지금까지 사용한 이 구문은 객체(instance)를 생성하는 구문이다.
		 *  사용자 정의의 자료형인 클래스를 이용하기 위해서는 new 연산자로 heap에 할당을 해야 한다.
		 *  객체를 생성하게 되면 클래스에 정의한 필드와 메소드 대로 객체(instance)가 생성된다.
		 *  아이디, 비밀번호, 이름, 나이, 성별, 취미를 연속된 메모리 주소에서 사용하도록 heap에 공간을 만들었다. (클래스에 작성한 내용 대로 생성함)
		 * */
		Member member = new Member();
		
		/* 목차. 2-2. 생성된 인스턴스의 초기값 확인하기 */
		/* 설명.
		 *  이렇게 객체를 생성하고 나면 서로 다른 자료형들을 하나의 member 라는 이름으로 관리할 수 있도록 공간을 생성한 것이다.
		 *  heap에 생성되기 때문에 jvm 기본값으로 초기화된다.
		 * */

		/* 필기.
		 *  필드에 접근하기 위해서는 레퍼런스변수명.필드명 으로 접근한다.
		 *  '.'은 참조연산자 라고 하는데, 레퍼런스 변수가 참고하고 있는 주소로 접근한다는 의미를 가진다.
		 *  각 공간은 필드명으로 접근한다. (배열은 인덱스로 접근, 객체는 필드명으로 접근이다)
		 * */
		System.out.println("member.id : " + member.id);
		System.out.println("member.pwd : " + member.pwd);
		System.out.println("member.name : " + member.name);
		System.out.println("member.age : " + member.age);
		System.out.println("member.gender : " + member.gender);
		System.out.println("member.hobby : " + member.hobby);
		
		/* 목차. 2-3. 필드에 접근해서 변수 사용하듯 사용하기 */
		member.id = "user01";
		member.pwd = "pass01";
		member.name = "홍길동";
		member.age = 20;
		member.gender = '남';
		member.hobby = new String[] {"축구", "볼링", "테니스"};
		
		/* 설명. 값이 변경되어 있는지 다시 확인해보자 */
		System.out.println("변경 후 member.id : " + member.id);
		System.out.println("변경 후 member.pwd : " + member.pwd);
		System.out.println("변경 후 member.name : " + member.name);
		System.out.println("변경 후 member.age : " + member.age);
		System.out.println("변경 후 member.gender : " + member.gender);
		System.out.print("변경 후 member.hobby : ");
		for(int i = 0; i < member.hobby.length; i++) {
			System.out.print(member.hobby[i] + " ");
		}
		System.out.println();
	}
}
