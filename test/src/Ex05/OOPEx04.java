package Ex05;

class 임꺽정 {
    void 달리기() {
        System.out.println("달리기1");
    }

    // 오버로딩
    void 달리기(int speed) {
        System.out.println("달리기2");
    }

    void 달리기(double power) {
        System.out.println("달리기3");
    }

    void 달리기(int speed, double power) {
        System.out.println("달리기4");
    }
}

// 오버로딩은 왜 사용하는가?
public class OOPEx04 {
    public static void main(String[] args) {
        // static이 붙어있는 않으면 New!
        임꺽정 꺽정 = new 임꺽정();
        꺽정.달리기();
        꺽정.달리기(1);
        꺽정.달리기(0.5);
        꺽정.달리기(1, 0.5);
    }

}
