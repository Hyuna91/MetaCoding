package Ex05;

class Engine1 {
    int power = 1500;
}


class Car1 {
    Engine1 e1;

    Car1(Engine1 e1) {
        this.e1 = e1;
    }

}


public class OOPEx02_1 {
    public static void main(String[] args) {
        Engine1 e1 = new Engine1();

        Car1 cc1 = new Car1(e1);

        System.out.println(cc1.e1.power);
    }
}
