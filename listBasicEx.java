package list인터페이스;

import java.util.*;

// list 인터페이스는 ArrayList,Vector,Linked list 에 상속을 주기위한 인터페이스
// List는 배열과 비슷한 형태의 자료구조(인덱스 기반)
// 요소의 저장 순서가 유지 됨
// 같은 요송의 중복 저장을 허용
// 데이터 크기가 고정되어 있지 않음
// List 인터페이스의 구현체인 Arraylist Vecotr, Linked List의 사용 방법이 동일
public class listBasicEx {
    public static void main(String[] args) {
        String[] fruitsArr = {"Watermelon","Cherry","Peach"};
//  List 인터페이스의 참조 변수로 ArrayList 생성된 객체를 참조 함
//    Arrays.asList() 배열을 리스트로 바꾸는 함수
    List<String> fruits = new LinkedList<>(Arrays.asList(fruitsArr));

        //   요소 추가: 리스트 맨뒤에 요소를 추가
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("Orange");
//  리스트 출력, toString()메서드가 오버라이딩 되어 있음
        System.out.println("과일목록: "+fruits.toString());
//  특정 인덱스에 요소 추가
        fruits.add(1,"Grape");
        System.out.println("과일목록: "+fruits.toString());

//  요소 가져 오기 (인덱스 접근)
        System.out.println("과일요소 :"+fruits.get(2));
//  요소 제거
        fruits.remove(2);
        System.out.println(fruits);
//  List 사이즈 확인
        System.out.println("과일 목록 사이즈 : "+fruits.size());
//    요소 순회하기
        for(String e:fruits){
            System.out.print(e+" ");
        }
//  리스트 정렬 하기
        fruits.sort(Comparator.naturalOrder());// 오름차순
        fruits.sort(Comparator.reverseOrder());// 내리차순
        fruits.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
    }
}
