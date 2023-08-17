public class Main {
    public static void main(String[] args) {
        int wallet = 150;
        int bonus;
        int result;
        int deposit = 760;
        int replenished_wallet;
        replenished_wallet = wallet + deposit;
        if (deposit >= 1000) {
            bonus = deposit / 100;
            System.out.println("Ваш счет составляет " + replenished_wallet + " , вам начислено " + bonus + " бонусов");
            System.out.println("Общая сумма составляет " + (replenished_wallet + bonus));
        } else {
            bonus = 0;
            System.out.println("Ваш счет составляет " + replenished_wallet + " , вам начислено " + bonus + " бонусов");
            System.out.println("Общая сумма составляет " + (replenished_wallet + bonus));
        }

    }
}