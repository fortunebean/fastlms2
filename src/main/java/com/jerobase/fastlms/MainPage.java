package com.jerobase.fastlms;
//main page 클래스를 만드는 목적
//매핑하기위해
// 주소와 (논리적인 주소 ) (물리적인 파일) ( 프로그램밍을 해야 하니까) 매핑

// http:// www.naver.com/new/list.do
//하나의 주소에 대해서
//어디서 매핑 ? 누가 매핑?
// 후보군? 클래스, 속성 , 메소드
//http://localhost:8080/


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/")
public class MainPage {


    @RequestMapping("/")
    public String index(){

        return "Index Page";

    }
    @RequestMapping("/hello")
    public String hello(){

        String msg="hello \r\n fastlms website !!!!";
            return msg;

    }
}
