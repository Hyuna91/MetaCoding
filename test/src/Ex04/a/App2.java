package Ex04.a;

// ������ ��Ű�� �ȿ����� import�� �ʿ䰡 ����.
//import Ex04.a.Cal;

public class App2 {
    public static void main(String[] args) {

        Cal cal = new Cal();
        
        // add()�� default �޼���� ������ ��Ű�� �ȿ����� ���� �����ϴ�.
        cal.add();

        cal.minus();

        // private ���������ڴ� ���� Ŭ���� �������� ���� �����ϴ�.
        // cal.multi();

        cal.divide();
    }
}
