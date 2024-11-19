package Ex05;

class Engine {
    int power = 2000;
}

class Car {
// 같은 파일 안에 있으니까 import할 필요 없이 가져와서 사용할 수 있다.
    Engine e;

    // 상속이 아닌 생성자를 만들어서 구현
    public Car(Engine e) {
        this.e = e;
    }

}

public class OOPEx02 {
    public static void main(String[] args) {
    
//    Engine e1 = new Engine();
//    Car c1 = new Car(e1);
    Engine e1 = new Engine();
    Car c1 = new Car(e1);

        System.out.println("자동자의 엔진 마력은 " + c1.e.power);
    }
}
