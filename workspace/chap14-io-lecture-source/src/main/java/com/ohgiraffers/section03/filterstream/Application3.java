package com.ohgiraffers.section03.filterstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

	public static void main(String[] args) {

		/* 수업목표. 데이타입출력보조스트림을 이해하고 사용할 수 있다. */
		/* 필기.
		 *  외부 데이터로부터 읽어오는 데이터를 바이트형 정수, 문자, 문자열로만 읽어오면
		 *  여러 데이터 타입을 취급하는 경우 별도로 처리를 해주어야 한다
		 *  예) 정수 입력받아 처리하려면 parsing을 해줘야 한다.
		 * */
		
		/* 필기.
		 *  데이터 자료형 별로 처리하는 기능을 추가한 보조스트림을 제공하고 있다.
		 *  DataInputStream/DataOutputStream 이다.
		 * */
		
		/* 설명. 데이터 형별로 파일에 기록하는 DataOutputStream 인스턴스 생성 */
		DataOutputStream dout = null;
		
		try {
			dout = new DataOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/score.txt"));
			
			/* 설명. 파일에 자료형별로 기록 */
			dout.writeUTF("홍길동");
			dout.writeInt(95);
			dout.writeChar('A');
			dout.writeUTF("이순신");
			dout.writeInt(87);
			dout.writeChar('B');
			dout.writeUTF("김철수");
			dout.writeInt(73);
			dout.writeChar('C');
			
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(dout != null) {
				try {
					dout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		/* 설명. 데이터 형별로 읽어오는 DataInputStream 인스턴스 생성 */
		DataInputStream din = null;
		
		try {
			din = new DataInputStream(new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/score.txt"));
			
			while(true){
				/* 설명. 파일에 기록한 순서대로 읽어들이지 않는 경우 에러 발생함 */
				System.out.println(din.readUTF() + ", " + din.readInt() + ", " + din.readChar());
				
				/* 설명.
				 *  이 상태로 읽어들이게 되면 파일에 더이상 읽을 것이 없는 경우 EOFException을 발생시킨다.
				 *  catch블럭에 EOFException을 핸들링 하는 코드를 추가해야 한다.
				 *  */
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 읽기 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(din != null) {
				try {
					din.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
