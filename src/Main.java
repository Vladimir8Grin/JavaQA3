public class Main {
    public static void main(String[] args) {
        int wallet = 100;
        int bonus;
        int deposit = 765;
        int replenished_wallet;
        if (deposit>= 1000) {
            replenished_wallet = wallet + deposit;
            bonus = deposit / 100;
            System.out.println("Ваш счет составляет " + replenished_wallet + " сумма бонусов составляет " + bonus);
        } else {
            replenished_wallet = wallet + deposit;
            bonus = 0;
            System.out.println("Ваш счет составляет " + replenished_wallet + " сумма бонусов составляет " + bonus);
        }

    }
}