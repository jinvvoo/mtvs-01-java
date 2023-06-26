package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Application4 {

	public static void main(String[] args) {
		
		/* 수업목표. FileWriter를 이해하고 사용할 수 있다. */
		/* 필기.
		 *  FileWriter
		 *  프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다.
		 *  1 글자 단위로 데이터를 처리한다.
		 * */
		
		/* 설명. 파일에 내보내기 할 스트림 생성 */
		FileWriter fw = null;
		
		/* 설명. 역시 FileNotFoundException을 핸들링 해야 한다. */
		try {
			
			/* 설명.
			 *  하지만 실행해도 예외는 발생하지 않는다.
			 *  Wirter의 경우 대상 파일이 존재하지 않으면 파일을 자동으로 생성해준다.
			 * */
			
			/* 설명.
			 *  두 번째 인자로 true를 전달하면 이어쓰기가 된다.
			 *  false는 이어쓰기가 아닌 덮어쓰기 이며 기본값은 false이다.
			 * */
			fw = new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testWriter.txt");
			
			/* 설명. writer() 메소드는 IOException을 핸들링 해야 한다. */
			fw.write(97);
			
			/* 설명.
			 *  실행하고 testWriter.txt 파일을 열어보면 a가 기록되어 있다.
			 *  여기까지는 사용 방법이 동일하다.
			 * */
			
			/* 설명. 문자 기반 스트림은 직접 char 자료형으로 내보내기도 가능하다. */
			fw.write('A');
			
			/* 설명. 혹은 char 배열도 가능하며 */
			fw.write(new char[] {'a', 'p', 'p', 'l', 'e'});
			
			/* 설명. 문자열도 가능하다. */
			fw.write("우리나라 대한민국");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
