package Ex05;

abstract class 육식동물 {
    // 일반 메서드
    void 걷다() {
        System.out.println("걷다");
    }

    // 추상 메서드 - 미완성 설계도
    abstract void 공격하다();
}

class 뱀 extends 육식동물{
    // 추상 메서드를 구현하지 않으면 오류
    @Override
    void 공격하다() {
        System.out.println("독으로 공격하다");
    }
}

class 사자 extends 육식동물{

    @Override
    void 공격하다() {
        System.out.println("이빨로 공격하다");
    }
}

public class OOPEx08 {
    public static void main(String[] args) {
        육식동물 a1 = new 뱀();
        육식동물 a2 = new 사자();

        a1.걷다();
        a1.공격하다();
        a2.걷다();
        a2.공격하다();
    }
}
