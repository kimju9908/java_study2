//package 입출력스트림;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class InOutStream {
//    public static void main(String[] args) {
//        FileInputStream inputStream = null;
//        try {
//            inputStream = new FileInputStream("D/새 폴더/k-digital-9010/src/입출력스트림/chicken");
//        } catch (FileNotFoundException  e){
//            System.out.println("파일이 없습니다");
//        }
//        Scanner sc =  new Scanner(inputStream);
//        while (sc.hasNextLine()){
//            String line = sc.nextLine();
//            System.out.println(line);
//        }
//    }
//}
