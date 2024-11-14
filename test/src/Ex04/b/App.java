package Ex04.b;

import Ex04.a.Cal;

// main()을 가지는 자바 파일 => 실행 파일
public class App {

    // JVM이 main() 메서드를 찾으려면 public이 필요 (공개)
    // JVM이 main() 메서드를 찾으려면 static이 필요 (메모리에 올린다는 뜻)
    // main() 메서드만 return 타입을 허용하지 않는다.
    // 메서드 이름이 main이다.
    // String[] args는 매개변수
    public static void main(String[] args) {    // 코드가 실행되는 stack의 영역으로
                                                // 아래 코드는 Queue에 담겨서 순차적으로 실행된다.
        Cal cal = new Cal();    // cal은 stack 내부에서 만들어졌기 때문에 지역변수이다.
                                // new를 하면 Cal class의 static이 아닌 모든 것이 메모리에 올라간다.


        // cal.plus;    // default 다른 package라 접근 불가
        cal.minus();    // public
        // cal.multi(); // private
        cal.divide();   // public



    }
}
