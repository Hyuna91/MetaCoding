package Ex05;

interface RemoconAble {
    void 초록버튼();
    void 빨간버튼();
}

class Samsung implements RemoconAble {

    @Override
    public void 초록버튼() {
        System.out.println("TV가 켜진다");
    }

    @Override
    public void 빨간버튼() {
        System.out.println("TV가 꺼진다");
    }
}

class LG implements RemoconAble {

    @Override
    public void 초록버튼() {
        System.out.println("TV가 꺼진다");
    }

    @Override
    public void 빨간버튼() {
        System.out.println("TV가 꺼진다");
    }
}



public class ExampleEx01 {

    public static void main(String[] args) {
        Samsung s1 = new Samsung();
        Samsung s2 = new Samsung();

        LG g1 = new LG();
        LG g2 = new LG();
    }
}
