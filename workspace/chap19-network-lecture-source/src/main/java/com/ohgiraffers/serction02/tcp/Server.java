package com.ohgiraffers.serction02.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        // port는 65535까지 이용 가능 (8000번 미만은 지접 설정하지 않음, wellknown port)

        int port = 8500;

        ServerSocket server = new ServerSocket(port);

        // while 문으로 true로 무한정 기다릴 것
        while (true) {
            Socket client = server.accept();

            // 읽기전용 스트림, 쓰기전용 스트림

            InputStream input = client.getInputStream();
            OutputStream output = client.getOutputStream();


            //기능 향상시키기 위한 보조스트림 추가

            BufferedReader br = new BufferedReader(new InputStreamReader(input));
            PrintWriter pw = new PrintWriter(output);

            while (true) {
                String message = br.readLine();

                if (!message.equals("exit")) {
                    System.out.println(client.getInetAddress().getHostAddress() + "가 보낸 메세지 : " + message);
                    pw.println("메세지 받기 성공!");
                    pw.flush();
                } else {
                    System.out.println("접속 종료");
                    break;
                }
            }

            br.close();
            pw.close();
            client.close();
        }

    }
}
