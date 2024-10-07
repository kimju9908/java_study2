package Arrays연습문제;

import java.util.Arrays;
import java.util.Comparator;

/*
임의의 10개의 과일이름 입력 후 길이순으로 정렬하고,길이가 같은 경우 사전순 정렬
*/
public class ArraysEXMain {
    public static void main(String[] args) {
        String[] fruit = {"Kiwi","Orange","Apple","Banana","Melon",
        "Mango","Watermelon","Cherry","Plum","Peach"};
        Arrays.sort(fruit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1;
                else {
                    if(o1.length()==o2.length()){
                        return o1.compareTo(o2);// 사전순정렬,앞에 값이  큰 경우 양수반환
                    }
                    return -1; // 현 상태 유지
                }
            }
        });
        System.out.println(Arrays.toString(fruit));
    }
}
