package Ex05;

class 전사 {  // 검
    String name = "전사";


    // 기본공격2로 메서드명을 작성하면 외워야하는 메서드명이 많아진다.
    // 즉 오버로딩을 하면 프로그래밍하기 편리해진다.
    void 기본공격(궁수 e1) { System.out.println("검으로 " +e1.name+ " 공격하기"); }

    void 기본공격(광전사 e1) {
        System.out.println("검으로 " +e1.name+ " 공격하기");
    }

    void 기본공격(마법사 e1) {
        System.out.println("검으로 " +e1.name+ " 공격하기");
    }

    void 기본공격(엘프 e1) {
        System.out.println("검으로 " +e1.name+ " 공격하기");
    }

    void 기본공격(흑마법사 e1) {
        System.out.println("검으로 " +e1.name+ " 공격하기");
    }

}

class 궁수 {  // 활
    String name = "궁수";

    void 기본공격(광전사 e1) {
        System.out.println("활로 " +e1.name+ " 공격하기");
    }
    void 기본공격(전사 e1) {
        System.out.println("활로 " +e1.name+ " 공격하기");
    }
}

class 광전사 { // 도끼
    String name = "광전사";

    void 기본공격(전사 e1) {
        System.out.println("도끼로 " +e1.name+ " 공격하기");
    }
    void 기본공격(궁수 e1) {
        System.out.println("도끼로 " +e1.name+ " 공격하기");
    }
}

class 마법사 { // 마법
    String name = "마법사";

    void 기본공격(전사 e1) {
        System.out.println("마법으로 " +e1.name+ " 공격하기");
    }
    void 기본공격(궁수 e1) {
        System.out.println("마법으로 " +e1.name+ " 공격하기");
    }
}

class 엘프 { // 활
    String name = "엘프";

    void 기본공격(전사 e1) {
        System.out.println("활로 " +e1.name+ " 공격하기");
    }
    void 기본공격(궁수 e1) {
        System.out.println("활로 " +e1.name+ " 공격하기");
    }
}

class 흑마법사 { // 마법
    String name = "흑마법사";

    void 기본공격(전사 e1) { System.out.println("흑마법으로 " +e1.name+ " 공격하기"); }
    void 기본공격(궁수 e1) {
        System.out.println("흑마법으로 " +e1.name+ " 공격하기");
    }
}

public class OOPEx05 {

   /* static void attack(전사 u1) {
        u1.기본공격();
    }*/
    
    public static void main(String[] args) {
        // #1 게임시작 - 전사, 궁수, 광전사를 메모리에 올린다.
        전사 u1 = new 전사();
        궁수 u2 = new 궁수();
        광전사 u3 = new 광전사();
        마법사 u4 = new 마법사();
        엘프 u5 = new 엘프();
        흑마법사 u6 = new 흑마법사();


        u1.기본공격(u2);
        u2.기본공격(u3);
        u3.기본공격(u1);
        u1.기본공격(u4);
        u1.기본공격(u5);
        u1.기본공격(u6);

    }
}
