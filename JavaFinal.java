package 자바파이널과제;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class JavaFinal {
    public static void main(String[] args) {
        List<student> studentList = new ArrayList<>();
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/자바파이널과제/student.txt");
        } catch (FileNotFoundException e) {
            System.out.println("파일이 없습니다" );

        }
        Scanner sc = new Scanner(inputStream);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] a = line.split(" ");
            String name = a[0];
            int korean = Integer.parseInt(a[1]);
            int english = Integer.parseInt(a[2]);
            int math = Integer.parseInt(a[3]);

            studentList.add(new student(name, korean, english, math));
        }


        studentList.sort(student.studentComparator);

        for (student s : studentList) {
            System.out.println(s.getName() + ": " + s.getTotal());
        }
    }
    static class student {
        private String name;
        private int korean;
        private int english;
        private int math;
        private int total;

        public student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
            this.total = korean + english + math;
        }


        public static Comparator<student> studentComparator = new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                if (o2.total != o1.total) {
                    return Integer.compare(o2.total, o1.total);
                }
                return o1.name.compareTo(o2.name);
            }
        };
        public String getName() {
            return name;
        }
        public int getTotal() {
            return total;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

