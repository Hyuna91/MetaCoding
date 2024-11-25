package Ex05;

class 프로토스유닛 {
    String name = "프로토스유닛";
    
    // 무효화
    void 기본공격(프로토스유닛 e1) {
        System.out.println("프로토스유닛 공격");
    }

    // 무효화
    String 이름확인() {
        return "?";
    }
}

class 질럿 extends 프로토스유닛 {
    String name = "질럿";

    // 오버라이드 = 부모의 메서드를 무효화하다.
    // (부모와 같은 메서드가 있으면 자식의 메서드가 유효하다)
    void 기본공격(프로토스유닛 e1) {
        System.out.println("질럿 공격");

        // 필드는 부모의 필드가 유효하다.
        // System.out.println("질럿이 " + e1.name + "을 공격합니다.");  // 질럿이 프로토스유닛을 공격합니다.

        System.out.println(this.name + "이 " + e1.이름확인() + "을 공격합니다.");
    }

    // 오버라이드를 통해 필드명을 변경
    String 이름확인() {
        return name;
    }
}

class 드라군 extends 프로토스유닛 {
    String name = "드라군";

    void 기본공격(프로토스유닛 e1) {
        System.out.println(this.name + "이 " + e1.이름확인() + "을 공격합니다.");
    }

    String 이름확인() {
        return name;
    }
}

class 다크템플러 extends 프로토스유닛 {
    String name = "다크템플러";

    void 기본공격(프로토스유닛 e1) {
        System.out.println(this.name + "이 " + e1.이름확인() + "을 공격합니다.");
    }

    String 이름확인() {
        return name;
    }
}

public class OOPEx06 {
    public static void main(String[] args) {
        // 앞에 타입을 프로토스유닛으로 변경한다.
        프로토스유닛 u1 = new 질럿();       // Heap(프로토스유닛, 질럿)
        프로토스유닛 u2 = new 드라군();      // Heap(프로토스유닛, 드라군)
        프로토스유닛 u3 = new 다크템플러();   // Heap(프로토스유닛, 다크템플러)

        u1.기본공격(u2);
    }

}
