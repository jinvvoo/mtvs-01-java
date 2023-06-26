package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {

	public static void main(String[] args) {

		/* 수업목표. 예외처리를 많이 사용하는 io 패키지에서 예외처리를 사용하는 구문을 이해할 수 있다. */
		/* 설명.
		 *  위에서 배운 예외처리를 가장 많이 활용하는 것이 io(input/output) 패키지 이다.
		 *  아직 io는 배우지 않았지만 io 문법보다는 try-catch 블럭의 실제 사용과
		 *  흐름에 집중을 해서 보자
		 * */
		
		/* 설명. finally 블럭에서 사용하려면 레퍼런스 변수를 먼저 선언해두어야 함 */
		BufferedReader in = null;
		
		try {
			/* 설명.
			 *  FileReader라는 클래스의 생성자에 예외를 thorws 해 놓았다.
			 *  사용하는 쪽에서 반드시 예외처리를 해야 하기 때문에 try-catch블럭 안에서 생성자를 호출하며
			 *  인스턴스를 생성해야 한다.
			 * */
			in = new BufferedReader(new FileReader("test.dat"));
			
			String s;
			
			/* 설명.
			 *  readLine메소드도 API를 보면 IOException을 발생시켜 놓았기 때문에
			 *  catch블럭을 추가해서 예외처리 구문을 작성해야 한다.
			 * */
			while((s = in.readLine()) != null){
				System.out.println(s);
			}
		
		/* 설명.
		 *  FileNotFoundException과 EOFException을 동시에 처리할 수 있다.
		 *  같은 레벨의 자손을 한번에 처리할 수 있는 것이다.
		 * */
		} catch (FileNotFoundException/* | EOFException*/ e) {
			e.printStackTrace();
		} catch(IOException e){
			
			/* 설명.
			 *  입출력에 관한 추상화된 예외클래스이다.
			 *  FileNotFoundException은 IOException의 후손이다.
			 * */
			
			/* 설명.
			 *  catch블럭은 여러개를 작성할 시 상위 타입이 하단에 오고 후손 타입이 먼저 작성되어야 한다.
			 *  바꿔보면 에러 발생함
			 * */
			e.printStackTrace();
			
		}finally{

			/* 설명.
			 *  예외 처리 구문과 상관 없이 반드시 수행해야 하는 경우 작성을 하며
			 *  보통 사용한 자원을 반납할 목적으로 사용하게 된다.
			 * */
			
			try {
				/* 설명.
				 *  실행하면 NullPointerException이 발생한다.
				 *  파일을 찾지 못해 객체를 생성하지 못하고 레퍼런스 변수에는 null값을 가지고 있는데
				 *  null을 참조하는 상태에서 참조연산자 사용 시 발생하는 예외이다.
				 *  NullPointerException은 unchecked Exception으로 try-catch로 처리하기 보다는
				 *  보통은 if - else 구문으로 해결 가능하다.
				 * */
//				in.close();		//런타임시 에러남
				
				if(in != null){
					/* 설명.
					 *  입출력에 사용한 스트림을 닫아 주는 메소드이다.
					 *  API에서 확인해보면 IOException을 위임한 메소드이기 때문에
					 *  finally 블럭 안이라도 또 예외처리를 중첩으로 해 주어야 한다.
					 *  try 블럭과 finally 블럭은 별개이다.
					 * */
					in.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
