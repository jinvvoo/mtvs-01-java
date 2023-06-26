package com.ohgiraffers.section03.stringbuilder;

public class Application1 {

	public static void main(String[] args) {

		/* 수업목표. String과 StringBuilder의 차이점에 대해 이해하고 사용할 수 있다. */
		/* 필기.
		 *  두 클래스는 스레드 동기화 기능 제공 여부에 따라 차이점이 있다.
		 *  StringBuilder : 스레드 동기화 기능 제공하지 않음
		 *                  스레드 동기화처리를 고려하지 않는 상황에서 StringBuffer보다 성능이 좋음
		 *  StringBuffer : 스레드 동기화 기능 제공 함
		 *                 성능면에서는 StringBuilder보다 느림
		 *  두 개의 차이는 스레드 동기화 유무이고, 현재 우리는 스레드를 고려하지 않기 때문에
		 *  StringBuilder를 이용할 것이다.
		 * */
		
		/* 필기.
		 *  String과 StringBuilder
		 *  String : 불변이라는 특성을 가지고 있다.
		 *           문자열에 + 연산으로 합치기 하는 경우, 기존 인스턴스를 수정하는 것이 아닌,
		 *           새로운 인스턴스를 반환한다.
		 *           따라서 문자열 변경이 자주 일어나는 경우 성능 면에서 좋지 않다.
		 *           하지만 변하지 않는 문자열을 자주 읽어 들이는 경우에는 오히려 좋은 성능을 기대할 수 있다.
		 *  StringBuilder : 가변이라는 특성을 가지고 있다.
		 *                  문자열에 append() 메소드를 이용하여 합치기 하는 경우
		 *                  기존 인스턴스를 수정하기 때문에 새로운 인스턴스를 생성하지 않는다.
		 *                  따라서 잦은 문자열 변경이 일어나는 경우 String보다 성능이 좋다.
		 *
		 * 필기.
		 *  단, jdk 1.5 버전에서는 문자열의 + 연산이 StringBuilder의 append()로 컴파일이 된다.
		 *  따라서 성능에 큰 차이를 보이지는 않는다.
		 *  하지만 반복문에서 문자열의 + 연산을 수행하는 경우 StringBuilder 인스턴스를
		 *  반복 루프 시 마다 생성하기 때문에 성능에는 좋지 않은 영향을 준다.
		 * 
		 * 설명.
		 *  역컴파일 결과 예시
		 *  원본코드
		 *  ---------------------------------------------------
		 *  String str1 = "java";
		 *  String str2 = "oracle";
		 *  String str3 = str1 + str2;
		 *  String str4 = "";
		 *  for(int i = 0; i < 10; i++) {
		 *      str4 += str1;
		 *  }
		 *  ----------------------------------------------------
		 *
		 * 설명.
		 *  JDK 1.4 이하
		 *  ----------------------------------------------------
		 *  String str1 = "java";
		 *  String str2 = "oracle";
		 *  String str3 = str1 + str2;
		 *  String str4 = "";
		 *  for(int i = 0; i < 10; i++) {
		 *      str4 = str4 + str1;
		 *  }
		 *  ----------------------------------------------------
		 *
		 * 설명.
		 *  JDK 1.5 이상
		 *  ----------------------------------------------------
		 *  String str1 = "java";
		 *  String str2 = "oracle";
		 *  String str3 = new StringBuilder(str1).append(str2).toString();
		 *  String str4 = "";
		 *  for(int i = 0; i < 10; i++) {
		 *      str4 = new StringBuilder(str4).append(str1).toString();
		 *  }
		 * */
		
		/* 설명. StringBuilder 인스턴스 생성 */
		StringBuilder sb = new StringBuilder("java");
		
		/* 설명. toString이 오버라이딩 되어 있다. */
		System.out.println("sb : " + sb);
		
		/* 필기.
		 *  hashCode는 오버라이딩 되어 있지 않다.
		 *  즉, 동일한 값을 가지는 경우 같은 해쉬코드를 반환하는 것이 아닌,
		 *  인스턴스가 동일해야 같은 해쉬코드를 반환한다.
		 *  */
		System.out.println("sb의 hashCode : " + sb.hashCode());
		
		/* 설명. 문자열 수정 */
		sb.append("oracle");
		
		System.out.println("sb : " + sb);
		
		/* 설명.
		 *  hashCode를 다시 출력하면 기존 인스턴스와 동일한 것을 확인할 수 있다.
		 *  즉, 문자열을 변경했다고 해서 새로운 인스턴스가 생성된 것은 아니다.
		 * */
		System.out.println("sb의 hashCode : " + sb.hashCode());
	}
}
