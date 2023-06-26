package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {

	public static void main(String[] args) {

		/* 수업목표. FileReader를 이해하고 사용할 수 있다. */
		/* 필기.
		 *  FileReader
		 *  FileInputStream과 사용하는 방법이 거의 동일하다.
		 *  단, byte 단위가 아닌 character 단위로 읽어들이는 부분이 차이점이다.
		 *  따라서 2바이트이던 3바이트이던 글자 단위로 읽어오기 때문에 한글을 정상적으로 읽어올 수 있다.
		 * */
		
		/* 설명. testReader.txt 파일을 읽을 수 있는 인스턴스 생성 */
		FileReader fr = null;
		
		try {
			/* 설명.
			 *  마찬가지로 파일이 존재하지 않는 경우 파일을 찾지 못한다는 예외가 발생한다.
			 *  파일을 추가해주면 정상적으로 스트림이 생성될 것이다.
			 *  testReader.txt 추가한 뒤 확인해보자
			 *  */
			fr = new FileReader("src/main/java/com/ohgiraffers/section02/stream/testReader.txt");
			
			/* 설명. 여기는 한글로 작성을 해도 읽어올 수 있으니 적당히 txt 파일에 글자를 입력해두자 */
			
			/* 설명. 파일 내용을 읽어오는것은 동일하다. */
//			int value;
//			while((value = fr.read()) != -1) {
//				System.out.print((char) value);
//			}
			
			/* 설명.
			 *  단 byte 배열로 읽어오는 경우 한글은 깨지게 된다.
			 *  유니코드로 변환된 한글은 byte에 저장하기에 더 큰 숫자를 가지기 때문에 오버플로우가 일어난다.
			 *  따라서 byte 배열이 아닌 char 배열로 내용을 읽어오는 기능을 제공하고 있다.
			 * */
			
			/* 설명.
			 *  위의 내용 주석하고 확인해야 함
			 *  이미 파일 내용을 읽어들인 스트림은 재사용이 불가능하다.
			 * */
			char[] carr = new char[(int) new File("src/main/java/com/ohgiraffers/section02/stream/testReader.txt").length()];
			
			fr.read(carr);
			
			for(int i = 0; i < carr.length; i++) {
				System.out.print(carr[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
