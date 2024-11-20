package Ex04;

public class People {
    String name;
    int age;


    // 디폴트 생성자는 .java -> .class 파일로 컴파일 할 때 자바가 자동으로 만들어준다.

    public People(String name, int age) {
        System.out.println("디폴트 생성자");
        // People() 내의 지역 변수 name, age 값을 Heap 공간에 name, age에 넣어줘야 한다.

        System.out.println("Stack - name : " + name);
        System.out.println("Stack - age : " + age);
        System.out.println("Heap - name : " + this.name);
        System.out.println("Heap - age : " + this.age);

        // this는 자기 자신의 Heap 공간을 가리킨다.
        this.name = name;
        this.age = age;

        System.out.println("Stack - name : " + name);
        System.out.println("Stack - age : " + age);
        System.out.println("Heap - name : " + this.name);
        System.out.println("Heap - age : " + this.age);
    }
}
