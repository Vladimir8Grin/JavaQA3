public class Main {
    public static void main(String[] args) {
        int wallet = 150;
        int bonus;
        int deposit = 1100;
        int replenishedWallet;
        replenishedWallet = wallet + deposit;
        if (deposit > 1000) {
            bonus = deposit / 100;
            System.out.println("Ваш счет составляет " + replenishedWallet + " , вам начислено " + bonus + " бонусов");
            System.out.println("Общая сумма составляет " + (replenishedWallet + bonus));
        } else {
            bonus = 0;
            System.out.println("Ваш счет составляет " + replenishedWallet + " , вам начислено " + bonus + " бонусов");
            System.out.println("Общая сумма составляет " + (replenishedWallet + bonus));
        }

    }
}