package Ex05;

class Engine {
    int power = 2000;
}


class Car { // 자동차는 엔진이 아니기 때문에 상속할 수 없다.
    // 콤포지션!! 결합
    // 같은 파일 안에 있으니까 import할 필요 없이 가져와서 사용할 수 있다.
    Engine e;

    // 상속이 아닌 생성자를 만들어서 구현
    public Car(Engine e) {
        this.e = e;
    }

}

class Hamburger {
    String name = "기본햄버거";
    String 재료1 = "양상추";
    String 재료2 = "패티";


}

class CheeseHamburger extends Hamburger {
    // 겹치지 않는 상태(필드)만 물려받는다.
    String name = "치즈햄버거";
}

// 상속이 가능하지만 상속하지 않는 방법
class ChickenHamburger {
    String name = "치킨햄버거";
    Hamburger h;

    public ChickenHamburger(Hamburger h) {
        this.h = h;
    }
}

public class OOPEx02 {
    public static void main(String[] args) {

//    Engine e1 = new Engine();
//    Car c1 = new Car(e1);
        Engine e1 = new Engine();
        Car c1 = new Car(e1);

        System.out.println("자동차의 엔진 마력은 " + c1.e.power);

        CheeseHamburger ch1 = new CheeseHamburger();
        System.out.println("햄버거의 이름은 " + ch1.name);
        System.out.println("햄버거의 재료1은 " + ch1.재료1);
        System.out.println("햄버거의 재료2는 " + ch1.재료2);

        Hamburger h1 = new Hamburger();
        ChickenHamburger ch2 = new ChickenHamburger(h1);
        System.out.println("햄버거의 이름은 " + ch2.name);
        System.out.println("햄버거의 이름은 " + ch2.h.name);
        System.out.println("햄버거의 재료1은 " + ch2.h.재료1);
        System.out.println("햄버거의 재료2는 " + ch2.h.재료2);
    }

}
