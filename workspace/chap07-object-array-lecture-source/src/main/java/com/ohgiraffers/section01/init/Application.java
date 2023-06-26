package com.ohgiraffers.section01.init;

public class Application {

	public static void main(String[] args) {

		/* 수업목표. 객체 배열에 대해 이해할 수 있다. */
		/* 필기.
		 *  객체배열은 레퍼런스변수에 대한 배열이다.
		 *  생성한 인스턴스도 배열을 이용해서 관리하면
		 *  동일한 타입의 여러 개 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용하다.
		 *  또한 반환값은 1개의 값만 반환할 수 있기 때문에
		 *  동일한 타입의 여러 인스턴스를 반환해야 하는 경우 객체배열을 이용할 수 있다.
		 * */

		/* 설명. 자동차 5대 인스턴스를 생성 후 모든 인스턴스가 최고 속도로 달리게 한다. */
		Car car1 = new Car("페라리", 300);
		Car car2 = new Car("람보르기니", 350);
		Car car3 = new Car("롤스로이스", 250);
		Car car4 = new Car("부가티베이론", 400);
		Car car5 = new Car("포터", 500);
		
		car1.driveMaxSpeed();
		car2.driveMaxSpeed();
		car3.driveMaxSpeed();
		car4.driveMaxSpeed();
		car5.driveMaxSpeed();
		
		/* 설명. 동일한 타입의 인스턴스를 여러 개 사용해야 할 때 객체배열을 이용하면 보다 효율적으로 사용이 가능하다. */
		/* 설명. Car 타입의 인스턴스주소를 보관할 5칸짜리 배열 할당 */
		Car[] carArray = new Car[5];
		
		/* 설명. 각 인덱스에는 기본값 null로 초기화 되어 있기 때문에 인덱스별로 인스턴스를 생성해야 한다. */
		carArray[0] = new Car("페라리", 300);
		carArray[1] = new Car("람보르기니", 350);
		carArray[2] = new Car("롤스로이스", 250);
		carArray[3] = new Car("부가티베이론", 400);
		carArray[4] = new Car("포터", 500);
		
		/* 설명.
		 *  생성한 인스턴스들을 위 처럼 최고 속도로 달리게 할 것이다.
		 *  배열이기 때문에 반복문을 사용할 수 있는 장점(?)을 가지고 있다.
		 * */
		for (int i = 0; i < carArray.length; i++) {
			carArray[i].driveMaxSpeed();
		}
		
		/* 설명. 객체배열도 할당과 동시에 초기화 할 수 있다. */
		Car[] carArray2 = {
				new Car("페라리", 300)
				, new Car("람보르기니", 350)
				, new Car("롤스로이스", 250)
				, new Car("부가티베이론", 400)
				, new Car("포터", 500)
		};
		
		/* 설명. 향상된 for문도 사용이 가능하다. */
		for(Car c : carArray2) {
			c.driveMaxSpeed();
		}
	}
}
