package Ex05.srpdip;

interface CanAble {
    public abstract void talk();
}

abstract class 홀직원 implements CanAble{
    abstract void 청소();

    @Override
    public void talk() {
        System.out.println("손님과 대화를 한다.");
    }
}

abstract class 종업원 extends 홀직원 {
    void 서빙하기() {
        System.out.println("서빙을 한다.");
    }

//    안쓰는 메서드 삭제도 간편하다.
//    void 주문받기() {
//        System.out.println("주문을 받는다.");
//    }
}

abstract class 캐셔 extends 홀직원 {
    void 계산하기() {
//        System.out.println("현금 계산을 한다.");
        System.out.println("카드 계산을 한다.");   // 수정이 간편하다.
    }

    void 정산하기() {
//        System.out.println("수기 정산을 한다.");
        System.out.println("계산기 정산을 한다.");  // 수정이 간편하다.
    }
}

abstract class 요리사 {
    abstract void 요리하기();
}

class 홍길동 extends 홀직원 {
    요리사 j;  // 추상클래스에 의존

    @Override
    void 청소() {
        System.out.println("홀 청소를 한다.");
    }
}

class 임꺽정 extends 홀직원 {
    요리사 j;  // 추상클래스에 의존
//    장보고 j; - 장보고를 의존하고 있으면 장보고 삭제 시 오류 발생 
    
    @Override
    void 청소() {
        System.out.println("화장실 청소를 한다.");
    }
}

class 김유신 extends 캐셔 {
    @Override
    void 청소() {
        System.out.println("주방 청소를 한다");
    }
}

class 이몽룡 extends 캐셔 {
    @Override
    void 청소() {
        System.out.println("테이블 청소를 한다.");
    }
}

// 장보고 삭제, 정몽주 생성해도 의존성에 문제가 없다
//class 장보고 extends 요리사 {
//    @Override
//    void 요리하기() {
//        System.out.println("양식을 요리한다.");
//    }
//}

class 정몽주 extends 요리사 {
    @Override
    void 요리하기() {
        System.out.println("양식을 요리한다.");
    }
}

class 이순신 extends 요리사 {
    @Override
    void 요리하기() {
        System.out.println("한식을 요리한다.");
    }
}

public class OOPEx10 {
}
