package Ex04;

public class CatApp {
    public static void main(String[] args){
        Cat c1 = new Cat(); // 고양이 한 마리가 Heap 공간에 만들어진다.
//
//        // 초기화 값이 없는 경우 null이 나온다.
//        System.out.println(c1.name);
//        System.out.println(c1.color);
//
//        Cat c2 = new Cat(); // 고양이 한 마리가 Heap 공간에 만들어진다.

        // 다양성을 위해 값을 new를 할 때마다 초기화하기 위해서

        Cat c2 = new Cat("야옹이", "하얀색");
        System.out.println(c2.name);
        System.out.println(c2.color);


    }
}


