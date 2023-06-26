package com.ohgiraffers.section03.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Application2 {

	public static void main(String[] args) {

		/* 수업목표. 형변환 보조스트림에 대해 이해하고 사용할 수 있다. */
		/* 필기.
		 *  형변환 보조스트림
		 *  기본 스트림이 byte 기반 스트림이고, 보조 스트림이 char 기반 스트림인 경우에 사용한다.
		 * */
		
		/* 필기.
		 *  표준 스트림
		 *  자바에서는 콘솔이나 키보드 같은 표준 입출력 장치로부터 데이터를 입출력 하기 위한 스트림을
		 *  표준 스트림 형태로 제공하고 있다. System 클래스의 필드 in, out, err가 대상 데이터에 스트림을 의미한다.
		 *  System.in (InputStream) : 콘솔로부터 데이터를 입력받는다.
		 *  System.out (PrintStream) : 콘솔로 데이터를 출력한다.
		 *  System.err (PrintStream) : 콘솔로 데이터를 출력한다.
		 *  즉 자주 사용되는 자원에 대해 미리 스트림을 생성해 두었기 때문에 개발자가 별도로 스트림을 생성하지 않아도 된다.
		 * */
		
		/* 설명.
		 *  이런 표준 스트림 중 콘솔로부터 읽어오는 기반 스트림이 InputStream 인데
		 *  Buffer를 이용해서 성능을 향상시키고 싶은 경우에 형변환 보조스트림을 사용할 수 있다.
		 * */
		
		/* 설명.
		 *  System.in을 InputStreamReader로 변환하여 바이트기반 스트림을 문자 기반 스트림으로 변환 후
		 *  버퍼를 이용한 보조스트림과 연결함
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("문자열 입력 : ");
			String value = br.readLine();
			
			System.out.println("value : " + value);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		/* 설명. 출력을 위한 것도 마찬가지 방식으로 사용할 수 있다. */
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw.write("java oracle jdbc");
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
