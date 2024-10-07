package Arrrays클래스;
import java.util.*;

/*
배열과 관련된 다양한 메서드 제공하는 클래스
*/
public class ArraysClassEx {
    public static void main(String[] args) {
        sortComparatorFunc();
        Integer [] array  ={5,4,7,9,13,3,1,88,23};
        List<Integer> list = Arrays.asList(array); // 배열을 리스트로 변환하는 메서드

    }
    // 정렬과 검색
//    static void sortAndSearchFunc(){
//        Integer [] array  ={5,4,7,9,13,3,1,88,23};
////        int [] array = {5,4,7,9,13,3,1,88,23};
//        Arrays.sort(array, Collections.reverseOrder());//오름차순
//        for (int e : array) System.out.print(e+" ");
//        System.out.println();
//        System.out.println("결과에 대한 인덱스 :"+Arrays.binarySearch(array,88));
//    }
    //정렬 오버라이딩 : 상속받은 메서드를 재정의
    // Comparator에 compare메서드를 오버라이딩해서 정렬 조건을 만듬
    static void sortComparatorFunc(){
        Integer [] array  ={5,4,7,9,13,3,1,88,23};
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2) return 1;
                return -1;
            }
        });
        for(int e : array) System.out.print(e+" ");
    }
}
