package com.ohgiraffers.serction01.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Application {

    public static void main(String[] args) throws UnknownHostException {

        // ip관련 이용할 때 Inet

        InetAddress localIp = InetAddress.getLocalHost();

        // 로컬 ip객체 만듬

        System.out.println(localIp.getHostAddress());
        System.out.println(localIp.getHostName());

        InetAddress naverIp = InetAddress.getByName("www.naver.com");
        System.out.println("네이버 서버 ip : " + naverIp.getHostAddress());

        // getHostAddress : ip주소 알아오는
        // 포트번호 223.130.195.95:xx : xx는 포트번호, 주로 80가 암묵적인 룰. 따라서 80 포트번호를 안넣더라도 이동이 됨.


    }
}
