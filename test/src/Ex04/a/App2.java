package Ex04.a;

// 동일한 패키지 안에서는 import할 필요가 없다.
//import Ex04.a.Cal;

public class App2 {
    public static void main(String[] args) {

        Cal cal = new Cal();
        
        // add()는 default 메서드라서 동일한 패키지 안에서는 접근 가능하다.
        cal.add();

        cal.minus();

        // private 접근제어자는 같은 클래스 내에서만 접근 가능하다.
        // cal.multi();

        cal.divide();
    }
}
