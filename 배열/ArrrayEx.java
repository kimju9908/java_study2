package 배열;
// 자바의 배열은 동일한 데이터 요소가 연속적으로 저장되는 자료구조
// 배열의 할당 -> int[]  arr = new int[4];
// 자바의 배열은 힙영영에 메모가 할당되고, 크기를 지정해야 함
// 배열의 개선된 형태는 List(Array List, Vector, Linked List) 가 있음
// 배열이나 리스트의  형태는 시퀀스형 자료구조임으로 인덱스로 값이 접근
//public class ArrrayEx {
//    public static void main(String[] args){
//        int[ ] score = new int[3];
//        score[0] =78;
//        score[1]=80;
//        score[2]=90;
//        // 범위기간 for문 , 배열의  내용을 변경 할 수 있음, 범위를 지정해서 순회 가능
//        for(int i =0; i<score.length;i++){
//            score[i]=score[i]+10;
//            System.out.println(score[i]+" ");
//
//        }
//        System.out.println();
//        for(int e :score){
//            e=e+10;
//            System.out.println(e+" ");
//        }
//        System.out.println();
//        for(int e:score){
//            System.out.println();
//        }
//        // 배열의 선언하는 여러가지 방법
//        static void arrayDefine(){
//            int[]  score1= new int[4]; // Heap영역에 메모리 공간을 확보
//            int[] score2 = {88,99,43}; // 컴파일러가 크기를 알 수 있음으로 크기 지정 필요없음
//            int[] score3;
//            score3 = new int[3];
//            int[] scor4;
//            scor4 = new int[]{34,55,66};
//        }
//
//    }
//
//
//    }
//
