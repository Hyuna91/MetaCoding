package Ex05;

abstract class Animal1 {
    abstract void speak1();
}

class Tiger extends Animal1 {
    void speak1() {
        System.out.println("어흥");
    }
}

class Chicken extends Animal1 {
    void speak1() {
        System.out.println("꼬끼오");
    }
}
public class OOPEx07_1 {
    public static void main(String[] args) {
        Animal1 t1 = new Tiger();
        Animal1 c1 = new Chicken();

        t1.speak1();
        c1.speak1();
    }
}
