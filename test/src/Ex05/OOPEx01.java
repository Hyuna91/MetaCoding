package Ex05;

// 접근 제어자
class Player {
    // 상태
    String name;    // 이름
    private int thirty;     // 목마름

    public Player(String name, int thirty) {
        this.name = name;
        this.thirty = thirty;
    }

    // 행위
    void 물마시기() {
        System.out.println("물 마시기 행위");
        this.thirty = this.thirty - 50;
    }

    int 목마름확인() {
        return this.thirty;
    }

}


public class OOPEx01 {
    public static void main(String[] args) {

        Player p1 = new Player("홍길동", 100);

        System.out.println("이름 : " + p1.name);
//        System.out.println("갈증 : " + p1.thirty);

        // #1. 필드를 원인 없이 변경 -> 안된다.
//        p1.thirty = 50;
//        System.out.println("갈증 : " + p1.thirty);

        // #2. 상태가 행위를 변경 -> 이것도 안된다.(신입이 실수할 수 있다)
//        p1.물마시기();
//        System.out.println("갈증 : " + p1.thirty);

        // #3. Player 클래스의 thirty 접근 제어자를 private으로 변경
        // p1.thirty로 접근 불가 -> 접근 메서드 생성(목마름확인)
        p1.물마시기();
        System.out.println("갈증 : " + p1.목마름확인());   // 실수 가능성 X
    }
}
