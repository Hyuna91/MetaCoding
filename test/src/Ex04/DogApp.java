package Ex04;

public class DogApp {
    public static void main(String[] args) {
        // Class Dog에는 static이 없다. 메모리에 띄우려면 new를 사용하는 것 밖에 방법이 없음!
        Dog d1 = new Dog();    // Heap 공간에 띄워짐

        System.out.println(d1.age);
        System.out.println(d1.name);
        System.out.println(d1.color);
        System.out.println(d1.type);


        // 1년이 지났다. 강아지 개명 + 염색
        d1.age = d1.age + 1;
        d1.name = "복실이";
        d1.color = "검은색";
//        Dog class의 type은 상수(final)로 변경이 불가하다.
//        d1.type = "푸들";

    }
}
