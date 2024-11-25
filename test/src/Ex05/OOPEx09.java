package Ex05;

// 행위에 대한 제약
interface MoveAble {
    // public abstract가 생략되어 있다.
    void 위();
    void 아래();
    void 왼쪽();
    void 오른쪽();
    void 냄새맡기();
}

interface MoveAble2 {
    void 위();
    void 아래();
    void 왼쪽();
    void 오른쪽();
    void 땅바닥숨기();
}

// 추상 클래스니까 추상 메서드를 구현하지 않아도 된다.
abstract class 사나운동물 implements MoveAble{
    abstract void 공격();

    @Override
    public void 위() {
        System.out.println("위쪽으로 이동");
    }

    @Override
    public void 아래() {
        System.out.println("아래쪽으로 이동");
    }

    @Override
    public void 왼쪽() {
        System.out.println("왼쪽으로 이동");
    }

    @Override
    public void 오른쪽() {
        System.out.println("오른쪽으로 이동");
    }

    @Override
    public void 냄새맡기() {
        System.out.println("냄새맡기");
    }
}

abstract class 온순한동물 implements MoveAble2{
    abstract void 채집();

    @Override
    public void 위() {
        System.out.println("위쪽으로 이동");
    }

    @Override
    public void 아래() {
        System.out.println("아래쪽으로 이동");
    }

    @Override
    public void 왼쪽() {
        System.out.println("왼쪽으로 이동");
    }

    @Override
    public void 오른쪽() {
        System.out.println("오른쪽으로 이동");
    }

    @Override
    public void 땅바닥숨기() {
        System.out.println("땅바닥으로 숨기");
    }
}

// 구현이 자식 클래스로 위임된다.
class 소 extends 온순한동물{

    @Override
    void 채집() {
        System.out.println("풀을 채집한다.");
    }
}

class 원숭이 extends 온순한동물{

    @Override
    void 채집() {
        System.out.println("바나나를 채집한다.");
    }
}

class 호랑이 extends 사나운동물{

    @Override
    void 공격() {
        System.out.println("이빨로 공격한다.");
    }
}

class 코뿔소 extends 사나운동물{

    @Override
    void 공격() {
        System.out.println("몸통박치기로 공격한다.");
    }
}

public class OOPEx09 {
    // 오버로딩
    static void 조이스틱(온순한동물 a1) {    // 동적바인딩
        a1.땅바닥숨기();
        a1.아래();
        a1.왼쪽();
        a1.오른쪽();
        a1.위();
        a1.채집();
        System.out.println("===========================");
    }

    // 오버로딩
    static void 조이스틱(사나운동물 a1) {    // 동적바인딩
        a1.아래();
        a1.왼쪽();
        a1.오른쪽();
        a1.위();
        a1.공격();
        a1.냄새맡기();
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        소 u1 = new 소();
        조이스틱(u1);
        원숭이 u2 = new 원숭이();
        조이스틱(u2);
        호랑이 u3 = new 호랑이();
        조이스틱(u3);
        코뿔소 u4 = new 코뿔소();
        조이스틱(u4);
    }
}
