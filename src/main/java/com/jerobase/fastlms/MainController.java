package com.jerobase.fastlms;
//main page 클래스를 만드는 목적
//매핑하기위해
// 주소와 (논리적인 주소 ) (물리적인 파일) ( 프로그램밍을 해야 하니까) 매핑

// http:// www.naver.com/new/list.do
//하나의 주소에 대해서
//어디서 매핑 ? 누가 매핑?
// 후보군? 클래스, 속성 , 메소드
//http://localhost:8080/


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@Controller
public class MainController {


    @RequestMapping("/")
    public String index(){

        return "index.html";
    }


    @RequestMapping("/hello")
    public void hello(HttpServletRequest request , HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = response.getWriter();

        String msg="<html>"+
                "<head>" +
                "<meta charset=\"UTF-8\">"+
                "</head>"+
                "<body>"+
                "<p>hello</p>"+
                "<p> fastlms website!!!</p>" +
                "<p> 안녕하세요!!! ===> </p>" +
                "</body>"+
                "</html>";

          printWriter.write(msg);
          printWriter.close();


    }

}

