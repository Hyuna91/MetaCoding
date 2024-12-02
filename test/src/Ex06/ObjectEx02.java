package Ex06;

class 궁수 {
    String name = "궁수";
}

class 전사 {
    String name = "전사";
}
public class ObjectEx02 {
    public static void main(String[] args) {
        // s1은 궁수 Type이기 때문에 궁수만 저장 가능한 배열
        Object[] s1 = new Object[2];

        s1[0] = new 궁수();
        s1[1] = new 전사();

        // 단점 : 다운캐스팅을 해야 사용 가능
        궁수 g1 = (궁수)s1[0];
        전사 g2 = (전사)s1[1];

        System.out.println(g1.name);
        System.out.println(g2.name);
    }
}
