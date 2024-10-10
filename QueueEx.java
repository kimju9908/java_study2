package 큐기본;
// Queue는 FIFO(first in first Out)
// 자바에서 Queue는 LinkcedList를 활용하여 생성해야 하므로 List가 import 되어야 함

import java.util.*;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Message> msgQueue = new LinkedList<>();

        msgQueue.offer(new Message("백이진", "Mail"));
        msgQueue.offer(new Message("스티브", "SMS"));
        msgQueue.offer(new Message("서울시", "KAKAO"));

        while (!msgQueue.isEmpty()) { // 메시지큐가 비어 있는지 확인
            Message msg = msgQueue.poll(); // 메시지큐에서 한개의 메시지를 꺼냄
            switch (msg.command) {
                case "Mail":
                    System.out.println(msg.to + "에게 메일을 보냅니다.");
                    break;
                case "SMS":
                    System.out.println(msg.to + "에게 문자를 보냅니다.");
                    break;
                case "KAKAO":
                    System.out.println(msg.to + "에게 카톡을 보냅니다");
                    break;
            }
        }
    }

    static class Message {
        private String command;
        private String to;

        public Message(String to, String command) {
            this.to = to;
            this.command = command;
        }
    }
}