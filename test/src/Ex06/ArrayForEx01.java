package Ex06;

public class ArrayForEx01 {
    static void 남은동전계산(int[] coins, int restMoney) {
        for (int i = 0; i < coins.length; i++) {
            System.out.println(coins[i] + "원 : " + (restMoney / coins[i]));
            restMoney = restMoney % coins[i];
            System.out.println("남은 금액 : " + restMoney);
        }
    }

    public static void main(String[] args) {
        int coins[] = {500, 100, 50, 10};
        int money = 1350;
        int restMoney = money;

        남은동전계산(coins, restMoney);
    }
}
