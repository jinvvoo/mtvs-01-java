package com.ohgiraffers.section01.extend;

public class FireCar extends Car {
	
	/* 목차. 1. extends 키워드를 이용하여 Car 클래스 상속 */
	/* 설명.
	 *  Car 클래스를 부모클래스로 FireCar를 자식클래스로 사용할 것이다.
	 *  클래스 선언부에 extends Car를 추가해서 Car 클래스를 상속 받을 것이다.
	 *  그러면 FireCar는 부모클래스인 Car가 가지고 있는 모든 멤버를 상속받는다.
	 *  하지만 생성자는 상속받지 못한다.
	 *  또한 부모가 가지고 있는 private 멤버는 접근이 불가능하다.
	 * */

	/* 설명. 기본생성자 */
	public FireCar() {
		
		/* 필기.
		 *  모든 생성자에는 맨 첫 줄에 super()를 컴파일러가 자동 추가한다.
		 *  부모의 기본 생성자를 호출하는 구문이다.
		 *  해당 생성자가 호출 될 시 가장 먼저 Car 클래스 호출 내용이 출력될 것이다.
		 *  명시적, 묵시적 전부 사용 가능하다.
		 * */
		super();
		
		System.out.println("FireCar 클래스의 기본 생성자 호출됨...");
	}
	

	/* 목차. 2. soundHorn() 오버라이딩 */
	/* 설명.
	 *  소방차의 경적 소리가 너무 작다. 조금 더 크게 키워보자
	 *  경적소리를 내는 용도의 메소드 선언부는 그대로 두되 소방차쪽에서 재정의 해볼 것이다.
	 * */
	
	/* 필기.
	 *  @Override 어노테이션
	 *  JDK 1.5부터 추가된 문법으로 오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러를 발생시킨다.
	 *  (오버라이딩이 정상적으로 작성된 것인지를 체크해주는 기능)
	 *  오버라이딩 하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성해야 한다.
	 * */
	@Override
	public void soundHorn() {

		if(isRunning()) {
			
			/* 설명.
			 *  주행중 상태인 것을 확인해야 한다.
			 *  runningStatus는 private 필드이기에 해당 클래스에서 접근이 불가능하다.
			 *  부모가 가지고 있는 public or protected 멤버인 isRunning() 메소드를 사용해야 주행중인 상태인지 확인할 수 있다.
			 *  혹은. Car 클래스의 runningStatus를 protected로 변경하면 사용 가능하지만, 권장되지는 않는다. (캡슐화 위배)
			 *  this.isRunning() 혹은 super.isRunning 둘 다 사용 가능하며
			 *  컴파일러는 기본적으로는 this.을 자동으로 추가한다.
			 *  (super.을 명시적으로 사용해야 하는 상황도 존재한다.)
			 * */
			System.out.println("빠아아아아앙~~~~~~빠아아아아아아앙!!!!!!!!!!!!");
		} else {
			
			System.out.println("소방차가 앞으로 갈 수 없습니다~ 비키세요 비켜~~");
		}
	}
	
	/* 목차. 3. 물뿌리는 기능 추가 */
	public void sprayWater() {
		
		/* 설명. 소방차는 추가적으로 물뿌리는 기능을 수행할 수 있다. */
		System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다 ======================>>>");
	}
}
