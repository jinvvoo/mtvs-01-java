package com.ohgiraffers.section04.constructor;

public class User {
	
	private String id;
	private String pwd;
	private String name;
	private java.util.Date enrollDate;		//필드로 다른 클래스 자료형도 사용할 수 있다. (ex. String)
	
	/* 필기.
	 *  생성자의 작성 위치
	 *  작성 위치는 문법상으로는 클래스 내부에 작성하면 되지만,
	 *  통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례이다.
	 * */
	
	/* 필기.
	 *  생성자의 사용 목적
	 *  1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용한다.
	 *  2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하며 인스턴스를 생성할 목적으로 주로 사용된다.
	 *  3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는 의미를 가진다.
	 *     따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수 도 있다. (초기값 전달 강제화)
	 * */
	
	/* 필기.
	 *  생성자 작성 방법
	 *  [표현식]
	 *  접근제한자 클래스명(매개변수) {
	 *      인스턴스 생성 시점에 수행할 명령 기술 (주로 필드를 초기화)
	 *      this.필드명 = 매개변수;		//설정자(setter) 여러 개의 기능을 한 번의 호출로 수행할 수 있다.
	 *  }
	 * */

	/* 필기.
	 *  생성자 작성 시 주의할 점
	 *  1. 생성자 메소드는 반드시 클래스의 이름과 동일해야 한다. (대/소문자까지 같아야 함)
	 *  2. 생성자 메소드는 반환형을 작성하지 않는다. (작성하는 경우 생성자가 아닌 메소드로 인식한다.)
	 * */
	
	/* 필기.
	 *  생성자의 종류
	 *  1. 기본생성자(매개변수 없는 생성자)
	 *  2. 매개변수 있는 생성자
	 *  기본생성자는 자바 Compiler가 자동으로 추가해주는 구문이지만 명시적으로 작성할 수 도 있다.
	 *  매개변수 있는 생성자가 한 개라도 존재하는 경우 기본생성자를 자동으로 추가해주지 않기 때문에
	 *  기본생성자가 필요한 경우에는 반드시 명시적으로 작성해 주어야 한다.
	 * */
	
	/* 목차. 1. 기본생성자(default constructor) */
	public User() {
		
		/* 필기.
		 *  수행할 내용이 아무 것도 존재하지 않는다.
		 *  호출 확인을 위해 출력 구문만 작성해보자.
		 *  메소드와 같이 수행할 명령들을 작성할 수 있다.
		 * */
		System.out.println("User 클래스의 기본 생성자 호출함...");
	}
	
	/* 주의사항. 동일한 이름의 생성자 혹은 메소드를 한 클래스 안에서 작성하는 것은 불가능하다. (Compile Error) */
//	public User() {}

	/* 목차. 2. 매개변수 있는 생성자 */
	/* 설명. 초기화할 필드가 여러개 인 경우, 초기화하고 싶은 필드의 갯수별로 생성자를 여러개 준비해둘 수 있다. */
	/* 필기. id, pwd, name의 초기화를 담당할 생성자 */
	public User(String id, String pwd, String name) {
		
		/* 설명.
		 *  분명 동일한 이름의 생성자는 작성하지 못한다고 했는데 작성했다.
		 *  매개변수 선언부에 작성한 매개변수의 타입, 갯수, 순서에 따라 동일한 생성자 혹은 메소드를
		 *  한 클래스 내에 여러개 작성할 수 있게 만든 기술이다. (오버로딩)
		 *  오버로딩 부분은 뒤에 별도의 챕터에서 다시 다루고 우선 지금은 매개변수 있는 생성자의 역할에 대해 살펴보자
		 * */
		
		/* 설명. 매개변수 있는 생성자의 주 목적은 인스턴스 생성 시점에 매개변수로 전달 받은 값을 이용해서 필드를 초기화한다.  */
		this.id = id;			//this는 인스턴스 생성 시점에 발생한 주소가 저장된다. (heap은 주소로 접근)
		this.pwd = pwd;
		this.name = name;
		
		System.out.println("User 클래스의 id, pwd, name을 초기화하는 생성자 호출함...");
	}
	
	/* 목차. 3. id, pwd, name, enrollDate의 초기화를 담당할 생성자(모든 필드를 초기화 하는 생성자) */
	public User(String id, String pwd, String name, java.util.Date enrollDate) {
		
		/* 필기. 매개변수로 전달 받은 값을 이용해 모든 필드를 초기화 한다. */
		/* 목차. 3-1. 각 필드에 접근하여 초기화 */
//		this.id = id;
//		this.pwd = pwd;
//		this.name = name;
//		this.enrollDate = enrollDate;

		/* 목차. 3-2. 사전에 작성되어 있는 다른 생성자 함수를 이용하여 초기화 */
		/* 설명.
		 *  id, pwd, name 필드를 초기화하는 기능을 가진 생성자를 바로 위에서 작성했었다.
		 *  따라서 중복되는 초기화 내용이 발생하게 되는데, 이 중복되는 초기화 내용을 줄여서 작성할 수 있다.
		 */

		/* 필기.
		 *  this() 사용하기
		 *  this()는 동일 클래스 내에 작성한 다른 생성자 메소드를 호출하는 구문이다.
		 *  괄호 안에 매개변수의 타입, 갯수, 순서에 맞는 생성자를 호출하고 복귀한다. (메소드와 동일함)
		 *  리턴되어 돌아오지만 리턴값은 존재하지 않는다.
		 *  this()는 가장 첫 줄에 선언해야 하며, 그렇지 않은 경우 Compile Error가 발생한다.
		 * */
		this(id, pwd, name);			//미리 작성한 세 개의 필드를 초기화 하는 생성자로 매개변수로 받은 값을 전달
		this.enrollDate = enrollDate;	//나머지 필드를 초기화
		
		System.out.println("User 클래스의 모든 필드를 초기화하는 생성자 호출함...");
	}
	
	/* 목차. 4. 복사 생성자 */
	/* 필기.
	 *  이미 만들어진 동일한 타입의 인스턴스가 가지는 필드 값을 이용해서 새로운 인스턴스 생성 시 초기화값으로 이용할 수 있다.
	 *  동일한 값을 가지지만 새롭게 할당되는 인스턴스이기 때문에 서로 다른 주소값을 가지게 된다. (깊은복사)
	 * */
	public User(User otherUser) {
		
		/* 필기. 매개변수로 전달받은 인스턴스의 주소로 접근한 필드의 값을 이용하여 새롭게 할당하는 필드 값을 초기화 함 */
		/* 목차. 4-1. 모든 필드에 직접 접근하여 초기화 */
//		this.id = otherUser.id;
//		this.pwd = otherUser.pwd;
//		this.name = otherUser.name;
//		this.enrollDate = otherUser.enrollDate;

		/* 목차. 4-2. 기존에 작성된 생성자를 호출하여 초기화 (this() 사용) */
		this(otherUser.id, otherUser.pwd, otherUser.name, otherUser.enrollDate);
		
		System.out.println("User 클래스의 복사생성자 호출함...");
		
		/* 설명. this의 주소와 otherUser의 주소가 서로 다른지 확인 */
		System.out.println("this의 hashcode : " + this.hashCode());
		System.out.println("otherUser의 hashcode : " + otherUser.hashCode());
	}

	public String getInformation() {
		
		return "User [id=" + this.id + ", pwd=" + this.pwd + ", name=" + this.name + ", enrollDate=" + this.enrollDate + "]";
	}
}
