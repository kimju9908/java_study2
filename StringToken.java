package String토크나이즈;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
/*
문자열을 특정 구분자 기준으로 쪼개서 부분 문자열로 만드는 것
String.split()을 사용하는 방법 더 좋음
countTokens() : 꺼내지 않고 남은 토큰의 수
hasMoreTokens() : 남아있는 토큰이 있는지 여부확인
nextToken() : 토큰을 하나 씩 빼오는 것

 */
public class StringToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 /기준으로 연속 입력 하세요 : ");
        String names = sc.nextLine();
        StringTokenizer st = new StringTokenizer(names, "/");
        String[] nameStr = new String[st.countTokens()]; // 문자열 배열의 크기를 정함
        int idx = 0;
        while(st.hasMoreTokens()) {
            nameStr[idx++] = st.nextToken();
        }
        for(int i = 0; i < nameStr.length; i++) {
            System.out.print(nameStr[i] + " ");
        }
        System.out.println();
    }
    static void splitFunc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 /기준으로 연속 입력 하세요 : ");
        String name = sc.nextLine();
        String [] nameSub = name.split("/");
        System.out.println(Arrays.toString(nameSub));
    }
}
