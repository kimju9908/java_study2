package HashMap기본형;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map 인터페이스 : key 와 value 의 쌍으로 자료를 관리하는 인터페이스
구현체 HashMap, TreeMap, HashTable,Properties
*/
public class HashMapEX {
    public static void main(String[] args) {
        // Map 생성
        Map<String,Integer> map = new HashMap<>();
        // 객체 추가 : Entry(키,값)
        map.put("김주혁",99);
        map.put("동그라미",55);
        map.put("최수연",95);
        map.put("이준호",80);
        map.put("동그라미",96);// 키가 같기 때문에 저장된 값이 대체 됨

        System.out.println("총 Entity 수 : "+map.size());
        System.out.println("키로 값 찾기 "+map.get("김주혁"));
//      반복 순회 방법 (향상된 for 문 사용)
        for(String e : map.keySet()){
            System.out.println(e+map.get(e));

        }
        // 이전 방식 순회 : 반복자(iterator)를 이용한 방식
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();// 키값이 나옴
            System.out.println(key+map.get(key));
        }
    }
}
