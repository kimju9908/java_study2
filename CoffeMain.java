package 커피메뉴만들기;

import java.util.*;
// 해시맵을 이용한 커피 메뉴 (보기/추가/삭제/변경)
public class CoffeMain {
    static Map<String, MenuInfo> map = new HashMap<>();
    public static void main(String[] args) {
        makeMenu();
        selectMenu();
    }
    // 초기 메뉴를 추가 함
    static void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 2000, "Coffee", "기본커피"));
        map.put("Espresso", new MenuInfo("Espresso", 2500, "Coffee", "진한커피"));
        map.put("Latte", new MenuInfo("Latte", 4000, "Coffee", "우유 포함"));
    }
    static void selectMenu() {
        Scanner sc = new Scanner(System.in);
        String key;
        while(true) {
            System.out.println("메뉴를 선택 하세요 : ");
            System.out.print("[1]메뉴보기, [2]메뉴조회, [3]메뉴추가, [4]메뉴삭제, [5]메뉴수정, [6]종료 :");
            int selMenu = sc.nextInt();
            switch (selMenu) {
                case 1 :
                    Set<String> keySet = map.keySet(); // 맵의 모든 key를 모아서 반환
//                    Iterator<String> iterator =keySet.iterator();
//                    while(iterator.hasNext()) {
//                        key = iterator.next();
//                        System.out.println("메뉴 : " + map.get(key).name);
//                        System.out.println("메뉴 : " + map.get(key).price);
//                        System.out.println("메뉴 : " + map.get(key).group);
//                        System.out.println("메뉴 : " + map.get(key).desc);
//                    }
                    System.out.println("========== 메뉴 보기 ==========");
                    for (String e : map.keySet()){
                        System.out.println("메뉴:"+map.get(e).getName());
                        System.out.println("가격:"+ map.get(e).getPrice());
                        System.out.println("카테고리:"+ map.get(e).getCategory());
                        System.out.println("분류 :"+ map.get(e).getDesc());
                    }
                    break;
                case 2 :
                    System.out.print("조회 할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if (map.containsKey(key)){

                        System.out.println("메뉴:"+map.get(key).getName());
                        System.out.println("가격:"+map.get(key).getPrice());
                        System.out.println("카테고리:"+map.get(key).getCategory());
                        System.out.println("분류 :"+map.get(key).getDesc());
                    } else {
                        System.out.println("없는 메뉴입니다.");
                    }
                    break;
                case 3 :
                    System.out.print("추가 할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if (map.containsKey(key)){
                        System.out.println("이미 있는 메뉴입니다.");
                    }else{

                        System.out.println("가격을 입력해주세요:");
                        int price = sc.nextInt();
                        System.out.println("카테고리를 입력해주세요:");
                        String category = sc.next();
                        System.out.println("분류를 입력해주세요:");
                        String desc = sc.next();
                        map.put(key , new MenuInfo(key,price,category,desc));
                    }
                        break;
                case 4 :
                    System.out.print("삭제할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)){
                        map.remove(key);
                    } else {
                        System.out.println("삭제할 메뉴가 없습니다 ");
                    }
                    break;


                case 5 :
                    System.out.print("수정할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if (map.containsKey(key)){
                        System.out.println("가격을 입력해주세요:");
                        int price = sc.nextInt();
                        System.out.println("카테고리를 입력해주세요:");
                        String category = sc.next();
                        System.out.println("분류를 입력해주세요:");
                        String desc = sc.next();
                        map.put(key , new MenuInfo(key,price,category,desc));
                    }else{
                        System.out.println("없는 메뉴입니다");
                    }
                    break;

                case 6 :
                    System.out.println("메뉴를 종료 합니다.");
                    return;
                default:
                    System.out.println("다시선택");
            }


        }

    }
}