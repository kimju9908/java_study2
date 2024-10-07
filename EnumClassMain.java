package Enum클래스;
/*
열거형 : 특수한 상수들의 집합(이 중에서 한개의 값을 선택하는 구조)

*/
import java.util.Calendar;
public class EnumClassMain {
    public static void main(String[] args) {
        Week today = null;
        Calendar cal =Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);
        switch (week){
            case 1:
                today = Week.a;break;
            case 2:
                today = Week.b;break;
            case 3:
                today = Week.c;break;
            case 4:
                today = Week.d;break;
        }
        System.out.println(today);

    }
    enum Week{
        a,b,c,d,e,g
    }
}
