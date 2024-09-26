package 문자열;

import javax.security.auth.Subject;
import java.awt.*;
import java.io.FilterOutputStream;
import java.util.Scanner;

/*문자열: 문자가 연속적으로 존재하는 데이터 형
 자바에서는 문자와 문자열을 구분함.
 자바는 문자열을 참조 타입으로 간주 함
 문장열을 표현하기 위해서는 객체를 만들어 사용하거나 리터럴 표기 방식으로 사용 함
 리터럴 표기 방식이 가독성이나 성능에서 유리 함
 */
public class StringEx {


    public static void main(String [] args){
//        String name = new String("안녕하세요");
//        String name2 = "안녕하세요"; //리터럴 표기 방법(이게 좋음)
////      문자열 내장 메소드
////      equal():  두개의 문자열을 내용이 동일한지 비교하여 결과를 반환
//        String a = "Hello";
//        String b = "hello";
//        System.out.println(a.equals(b));
//        System.out.println(a.equalsIgnoreCase(b)); // 대소문자 구분 안함
//        System.out.println(a ==b );// 주소가 같은지를 물어보는 경우가 됨
//
//        // indexOf(); - 문자열에서 특정 문자가 시작되는 인덱스 반환
//        String c = "Hello Java";
//        System.out.println(c.indexOf("Java"));
//
////        contains(); - 문자열에서 특정 문자열이 포함되어 있는지의 여부를 반환
//        System.out.println(c.contains("Hello")); //true
////        charAt(); - 문자열에서 특정 위치의 문자를 리턴
//        System.out.println(c.charAt(6));

        // 실습문제 : 대문자, 소문자로 이루어진 문자열을 입력받아
        // 대문자는 소문자로 소문자는 대문자로 반환
//        Scanner sc = new Scanner(System.in);
//        System.out.println("문자열을 입력하세요:");
//        String name = sc.next();
//        for(int i=1;i<name.length();i++){
//            char ch = name.charAt(i);
//            if (ch<'a'){
//                System.out.print((char)(ch+32));
//            }else{
//                System.out.print((char)(ch-32));
//            }
//        }



//        실습문제: 입력받은 문자열을 반대로 출력하기
//        ex) abcdef =>fedcba
//        Scanner sc = new Scanner(System.in);
//        System.out.println("문자열을 입력하세요:");
//        String name = sc.next();
//        for(int i=name.length()-1;i>=0;i--){
//            System.out.print(name.charAt(i));
//            }
        String d = "안녕하세요. JAVA JAVA를 공부 하겠습니다.";
        System.out.println(d.replace("JAVA","PYTHON"));
        // replaceAll(): 정규식 적용 가능
        System.out.println(d.replaceAll("JAVA","PYTHON"));
//      substring() : 문자열에서 특정 문자열을 뽑아 낼 때 사용
        String e = "Hello Java";
        System.out.println(e.substring(5));
        System.out.println(e.substring(6,8));
        //toUpperCase()/toLowerCasee
        System.out.println(e.toUpperCase());
        System.out.println(e.toLowerCase());
//      trim() :문자열의 앞/뒤의 공백제거
        String f = " 안ㅇㄴㅇ ㄴㅇㅁㅇㄴㅁㅇㅁㅇㅈㅇ ";
        System.out.println(f.trim());
        //split() : 문자열을 특정 문자열 기준으로 분리하는 메서드
        String g = "24:45:56";
        String[] timeStr = g.split(":");
//        for (String el:timeStr){
//            System.out.println(el+" ");
//        }
        System.out.println(timeStr[0]+"시"+timeStr[1]+"분"+timeStr[2]+"초");
        // 문자열 포매팅 : 서식을 지정해서 문자열  만드는 것
        // System.out.printf(),String.format()
        System.out.printf("오늘의 온도는 %d입니다.\n",35);
        String otherStr= String.format("오늘의 온도는 %d입니다.\n",35);
        System.out.println(otherStr);
//        toCharArray() : 문자열을 문자 배열로 반환
        String strVal = "sadaskdasdkadjsaakssad";
        char[] chArray = strVal.toCharArray();
        for (char ec: chArray){
            System.out.print(ec+" ");
        }


    }




    }

