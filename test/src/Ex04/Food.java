package Ex04;

public class Food {
    String name;
    int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }
//    public void myPrint(String name, int price) {
//        System.out.println(name + " 가격은 " + price + "원 입니다.");
//    }
    void myPrint() {
        System.out.println(name + " 가격은 " + price + "원 입니다.");
    }
}
