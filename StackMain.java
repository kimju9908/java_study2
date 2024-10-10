package 스택기본;
/*
Stack은 LIFO(last in first out) : 프로그램밍에서는 함수 호출 구조가 대표적인 예
일상 생활에서의 예는 식당에서 설겆이 접시 쌓아두고 음식을 담는 경우
Stack은 내부적으로 Vector 클래스를 상속 받아서 사용
push(객체) : 객체를 저장
peek() : 스택의 최상위 값 확인
pop() : 스택의 최상위의 값 추출하면서 보여줌
empty() : 스택이 비어있는지 확인

*/
import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek()); // 최상위의 값 확인
        System.out.println(stack.pop()); // 최상위의 값을 추출하면서 보여줌
        System.out.println(stack.empty());// 스택이 비어있는지 확인
        System.out.println(stack.size()); // 스택에 포함된 요소의 갯수
        System.out.println(stack.contains(1)); // 스택내에 해당 값이 존재하는지 확인
    }
}
