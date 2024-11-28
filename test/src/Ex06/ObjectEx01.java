package Ex06;

// 모든 Class는 Object를 상속받는다.
class Dog extends Object {
    String name = "멍멍이";
}

// 모든 Class는 Object를 상속받는다. 생략
class Cat {
    String name = "야옹이";
}

public class ObjectEx01 {
    public static void main(String[] args){
        // 모든 Class가 Object를 상속받기 때문에
        // Class를 따로 생성하지 않아도 Object로 Type을 묶을 수 있다.
        Object o1 = new Dog();
        Object o2 = new Cat();

//        System.out.println(o1.name);  -- 불가능
//        System.out.println(o2.name);  -- 불가능

        // Object 사용 방법 : 다운캐스팅을 통해 사용할 수 있다.
        Dog d1 = (Dog)o1;
        Cat c1 = (Cat)o2;

        System.out.println(d1.name);
        System.out.println(c1.name);

//        Cat c2 = (Cat)o1; -- class Ex06.Dog cannot be cast to class Ex06.Cat

     }

}
