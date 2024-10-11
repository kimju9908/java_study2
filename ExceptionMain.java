//package 예외처리기본;
//
//import javax.swing.plaf.synth.SynthTableHeaderUI;
//import java.io.BufferedReader;
//import java.io.FileReader;
//
///*
//프로그램에서 오류가 발생하는 경우는 크게 두가지
//1. 컴파일 오류(문법을 잘 못 작성하는 경우)
//2. 실행중에 오류가 발생하는 경우(런타임 오류)
//컴파일 타임의 오류와 런타임에 오류의 경우는 컴파일 타임에 발생하는 것 훨씬 바라짐
//*/
//public class ExceptionMain {
//    public static void main(String[] args) {
//        try {
//
//
//            int[] arr = new int[5];
//            for (int i = 0; i <= 5; i++) {
//                arr[i] = i;
//                System.out.println(arr[i]);
//            }
//        }catch (Exception e ){
//            System.out.println("인덱스가 배열의 범위를 벗어남"+e);
//        }
//        System.out.println("프로그램 정상 종료");
//}
//
//static  void fileNoyFoundFunc(){BufferedReader br = new BufferedReader(new FileReader("text.txt"));}
//
//    }
