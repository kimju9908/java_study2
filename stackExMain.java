package 스택응용;

import java.util.Scanner;
import java.util.SequencedCollection;
import java.util.Stack;
// 괄호의 닫힘 여부를 스택으로 확인하는 방법

public class stackExMain {
    public static void main(String[] args) {
//      Character은 char의 객체 타입
        Stack<Character> stack = new Stack<>();
        Scanner sc =new Scanner(System.in);
        System.out.print("수식 입력: ");
        String exp = sc.next();
        for(int i = 0; i < exp.length(); i++){
        char ch = exp.charAt(i);
        if(ch == '(') {
            stack.push(ch); // 열림 괄호 일 때 push
        } else if(ch == ')') {
            if(!stack.isEmpty())stack.pop(); // 닫힘 괄호 일 때 pop
            else {
                System.out.println("괄호가 일치 하지 않습니다.");
                return;
            }
        }
    }
        if(stack.isEmpty()) {
        System.out.println("괄호가 일치 합니다.");
    } else {
            System.out.println("괄호가 일치 하지 않습니다.");
        }
    }
}

