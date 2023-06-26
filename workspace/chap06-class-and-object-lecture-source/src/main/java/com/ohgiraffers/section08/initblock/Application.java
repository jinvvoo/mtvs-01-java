package com.ohgiraffers.section08.initblock;

public class Application {

	public static void main(String[] args) {

		/* 수업목표. 초기화블럭의 동작 순서를 이해하고 이를 활용하여 인스턴스를 생성할 수 있다. */
		/* 필기.
		 *  초기화 블럭
		 *  복잡한 초기화를 수행할 수 있는 블럭을 제공하며, 인스턴스 초기화 블럭과 정적 초기화 블럭으로 구분된다.
		 *  1. 인스턴스 초기화 블럭
		 *    : 인스턴스가 생성되는 시점에 생성자 호출 이전에 먼저 실행이 된다.
		 *      인스턴스를 호출하는 시점마다 호출이 된다.
		 *      인스턴스변수를 초기화하며 정적필드에는 실행시점마다 값을 덮어쓴다.
		 *  {
		 *      초기화 내용 작성
		 *  }
		 *  2. 정적 초기화 블럭
		 *    : 클래스가 로드될 때 한 번 동작한다.
		 *      정적 필드를 초기화하며, 인스턴스변수는 초기화하지 못한다.
		 *  static {
		 *      초기화 내용 작성
		 *  }
		 *  */

		/* 설명. 인스턴스 생성 */
		Product product = new Product();
		
		/* 목차. 1. 자료형별 기본값으로 초기화 된 내용 확인 */
//		System.out.println(product.getInformation());
		
		/* 목차. 2. 명시적 초기화로 필드 초기화 확인 */
		/* 설명. 명시적 초기값을 Product 클래스에 작성하고 다시 실행하면 기본값을 명시적 초기값이 덮어 쓴다. */
		System.out.println(product.getInformation());

		/* 목차. 3. 초기화블럭으로 필드 초기화 확인 */
		/* 설명. 명시적 초기값을 Product 클래스에 작성하고 다시 실행하면 기본값을 명시적 초기값이 덮어 쓴다. */
		System.out.println(product.getInformation());

		/* 목차. 4. 매개변수 있는 생성자를 이용한 초기화 확인 */
		Product product2 = new Product("대륙폰", 300000, "샤우미");
		System.out.println(product2.getInformation());
		
		/* 필기.
		 *  여기서 알 수 있는 초기화 순서는
		 *  인스턴스변수 : 기본값 -> 명시적초기값 -> 인스턴스초기화블럭 -> 생성자
		 *  클래스변수 : 기본값 -> 명시적초기값 -> 정적초기화블럭 -> 인스턴스초기화블럭 -> 생성자
		 * */
	}

}
