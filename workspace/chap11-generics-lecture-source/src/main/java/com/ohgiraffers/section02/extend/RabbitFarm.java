package com.ohgiraffers.section02.extend;

/* 설명. 인터페이스 상속 시 implemens 키워드 대신 extends 사용한다. */
//public class RabbitFarm<T implemens Animal> {		//에러남
//public class RabbitFarm<T extends Animal> {		//정상

/* 설명. 클래스 상속 시 extends 사용 가능 */
public class RabbitFarm<T extends Rabbit> {

/* 설명.
 *  참고로 클래스와 인터페이스 상속 시 &를 사용함 (참고)
 *  대신 앞에는 클래스가 와야 하고 인터페이스는 뒤에 옴
 *  &로 여러 타입을 동시에 가지는 경우에만 타입변수에 맞는 타입으로 여긴다. (둘 중 하나 아님)
 *  여러개를 이어서 작성할 떄는 계속 &를 쓰면 되지만 해당 타입을 모두 가지는 타입만 사용 가능함
 *  클래스 여러개는 & 사용 불가하며 ,(콤마) 사용시 컴파일 에러는 발생하지 않지만 뒤에 작성한 클래스롤 또 다른 타입변수로 본다.
 *  즉 하나의 클래스만 상속받아 구현할 수 있음
 * */
//public class RabbitFarm<T extends Rabbit & Animal> {
/* 설명. Reptile 자체를 타입변수로 본다 */
//public class RabbitFarm<T extends Rabbit, Reptile> {
	
	/* 설명.
	 *  해당 클래스는 타입변수를 작성하여 제네릭 클래스로 만들 것이다.
	 *  하지만 제네릭스를 설정할 때 extends Rabbit 이라고 추가를 해보자
	 * */
	
	/* 설명. 타입변수는 아직 어떤 토끼가 퇼 지 모른다. 다만 토끼이거나 토끼의 후손만 가능하다. */
	private T animal;
	
	public RabbitFarm() {}
	
	public RabbitFarm(T animal) {
		this.animal = animal;
	}
	
	public void setAnimal(T animal) {
		this.animal = animal;
	}
	
	public T getAnimal() {
		return this.animal;
	}
}
