package Ex06;

abstract class 공{
    abstract String getName();
}

class 농구공 extends 공{
    private String name = "농구공";

    // 자식이 부모의 메서드와 동일한 것을 들고 있으면
    // 부모의 메서드가 오버라이드(무효화) 된다.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class 축구공 extends 공{
    private String name = "축구공";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class 가방<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

public class GenericEx03 {
    // 9시 - 축구, 나머지 시간 - 농구
    public static 가방<? extends 공> 꺼내기(int time) {
        if(time == 9) {
            System.out.println("농구할 시간");
            농구공 g1 = new 농구공();
            가방<농구공> b1 = new 가방<>();
            b1.setData(g1);
            return b1;
        }else {
            System.out.println("축구할 시간");
            축구공 g2 = new 축구공();
            가방<축구공> b2 = new 가방<>();
            b2.setData(g2);
            return b2;
        }
    }

    // 제네릭 고급 = 다형성, Object, 추상클래스, 오버라이드(무효화), 동적 바인딩
    public static void main(String[] args) {
        가방<? extends 공> r1 = 꺼내기(9);
        가방<? extends 공> r2 = 꺼내기(12);

        System.out.println(r1.getData().getName());
        System.out.println(r2.getData().getName());
    }
}





























