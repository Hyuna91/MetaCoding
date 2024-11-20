package Ex05;

class 요리사 {
    String name = "요리사";
}

class 홍길동 extends 요리사{
    String name = "홍길동";
}

public class OOPEx03 {
    public static void main(String[] args) {
        홍길동 h1 = new 홍길동();
        System.out.println(h1.name);
        요리사 y1 = new 홍길동();
        System.out.println(y1.name);

        // 홍길동 h2 = new 요리사();  // 불가능
        요리사 y2 = new 요리사();
        System.out.println(y2.name);
    }

}


