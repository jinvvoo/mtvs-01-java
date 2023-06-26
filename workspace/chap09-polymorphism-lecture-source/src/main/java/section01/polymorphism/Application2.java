package section01.polymorphism;

public class Application2 {


	public static void main(String[] args) {

		/* 수업목표. 다형성을 적용하여 객체 배열을 만들어 인스턴스를 연속 처리할 수 있다. */
		/* 설명. 상위 타입의 레퍼런스배열을 만들고 각 인덱스에 인스턴스들을 생성해서 대입한다. */
		Animal[] animals = new Animal[5];
		animals[0] = new Rabbit();
		animals[1] = new Tiger();
		animals[2] = new Rabbit();
		animals[3] = new Tiger();
		animals[4] = new Rabbit();
		
		/* 필기. Animal 클래스가 가지는 메소드를 오버라이딩한 메소드 호출 시 동적바인딩을 이용할 수 있다. */
		/* 설명.
		 *  토끼 울어라! 호랑이 울어라! 이렇게 하는게 아니고
		 *  동물들 다 울어라! 이런 느낌이다.
		 * */
		for(int i = 0; i < animals.length; i++) {
			animals[i].cry();
		}
		
		/* 필기.
		 *  각 클래스별 고유한 메소드를 동작시키게 하기 위해서는
		 *  down-casting을 명시적으로 해줘야 하는데,
		 *  ClassCastException을 방지하기 위해서 instanceof 연산자를 이용해야 한다.
		 * */
		for(int i = 0; i < animals.length; i++) {
			
			/* 설명. 동물들아 너가 만약 토끼면 점프를 뛰고 호랑이면 물어라! 하는 느낌이다. */
			if(animals[i] instanceof Rabbit) {
				((Rabbit) animals[i]).jump();
			} else if(animals[i] instanceof Tiger){
				((Tiger) animals[i]).bite();
			} else {
				System.out.println("호랑이나 토끼가 아닙니다.");
			}
		}
	}
}
