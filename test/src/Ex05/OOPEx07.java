package Ex05;

// 추상적 - new 할 수 없다! -> 앞에 abstract를 붙여서 추상클래스를 만든다.
// 추상클래스
abstract class Animal {
    // 추상메서드
    // {} 몸체가 없다.
    abstract void speak();

    // 일반메서드
    void Hello() {

    }

}

class Dog extends Animal {
    // 오버라이드 (Animal의 speak()가 무효화된다.)
    void speak() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    // 오버라이드 (Animal의 speak()가 무효화된다.)
    void speak() {
        System.out.println("야옹");
    }
}

class Bird extends Animal {

    // 부모가 추상메서드를 가지고 있으면 자식은 반드시 추상메서드를 구현해야한다.
    @Override
    void speak() {
        System.out.println("짹짹");
    }
}

public class OOPEx07 {
    public static void main(String[] args) {
        Animal d1 = new Dog();
        Animal c1 = new Cat();
        Animal b1 = new Bird();
        d1.speak();     // 동적바인딩 된다.(부모의 메서드가 무효화되니까)
        c1.speak();
        b1.speak();

//        Animal a1 = new Animal(); -> 추상클래스는 new 할 수 없다.
    }
}
