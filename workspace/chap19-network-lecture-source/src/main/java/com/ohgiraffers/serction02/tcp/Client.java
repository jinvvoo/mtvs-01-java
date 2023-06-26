package com.ohgiraffers.serction02.tcp;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        int port = 8500;
        String serverIp = "192.168.0.28";

        Socket socket = new Socket(serverIp, port);

        if (socket != null) {

            InputStream input = socket.getInputStream();
            OutputStream output = socket.getOutputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(input));
            PrintWriter pw = new PrintWriter(output);

            Scanner sc = new Scanner(System.in);

            do {

                System.out.println("대화 입력 :");
                String message = sc.nextLine();

                pw.println("[kjw]" + message);
                pw.flush();

                if (message.equals("exit")) {
                    break;
                }

                String recieveMessage = br.readLine();
                System.out.println(recieveMessage);

            } while (true);

            br.close();
            pw.close();
            socket.close();
        }
    }
}
