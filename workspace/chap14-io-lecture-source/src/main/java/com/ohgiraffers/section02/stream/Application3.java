package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

	public static void main(String[] args) {

		/* 수업목표. FileOutputStream을 이해하고 사용할 수 있다. */
		/* 필기.
		 *  FileOutputStream
		 *  프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다.
		 *  1바이트 단위로 데이터를 처리한다.
		 * */
		
		/* 설명. 파일에 데이터를 내보내기 할 스트림 생성 */
		FileOutputStream fout = null;
		
		/* 설명. 역시 FileNotFoundException을 핸들링 해야 한다. */
		try {
			
			/* 설명.
			 *  하지만 실행해도 예외는 발생하지 않는다.
			 *  OutputStream의 경우 대상 파일이 존재하지 않으면 파일을 자동으로 생성해준다.
			 * */
			
			/* 설명.
			 *  두 번째 인자로 true를 전달하면 이어쓰기가 된다.
			 *  false는 이어쓰기가 아닌 덜어쓰기 이며 기본값은 false이다.
			 * */
			fout = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt");
			
			/* 설명. writer() 메소드는 IOException을 핸들링 해야 한다. */
			fout.write(97);
			
			/* 설명. 실행하고 testOutputStream.txt 파일을 열어보면 a가 기록되어 있다. */
			
			/* 설명.
			 *  byte 배열을 이용해서 한 번에 기록할 수 도 있다.
			 *  10 : 개행문자 (엔터)
			 * */
			byte[] bar = new byte[] {98, 99, 100, 101, 102, 10};
			fout.write(bar);
			
			/* 설명. 1번 인덱스부터 3의 길이만큼 파일에 내보내기 (cde 기록됨) */
			fout.write(bar, 1, 3);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
