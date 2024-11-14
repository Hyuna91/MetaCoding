package Ex04.a;

// static을 가지고 있지 않으면 메모리에 뜬게 없다!
// new를 통해서 메모리에 올리면 Heap에 올라간다.
public class Cal {

    // default : 동일 패키지에서 사용 가능
    void add() {
        System.out.println("더하기 메서드");
    }

    // public : 다른 패키지에서도 사용 가능
    public void minus() {
        System.out.println("빼기 메서드");
    }

    private void multi() {
        System.out.println("곱하기 메서드");
    }

    public void divide() {
        System.out.println("나누기 메서드");
        multi();    // 같은 클래스 내부라 multi() 접근 가능
    }

}
