public class Main {
    public static void main(String[] args) {
        int initialAccount = 300;
        int topUp = 150;
        int forEvery100Rubles = 100;
        int bonus = topUp / forEvery100Rubles;
        int totalSum = initialAccount + topUp;
        if (topUp > 1000) {
            initialAccount = bonus + totalSum;
        } else {
            bonus = 0;
            initialAccount += topUp;
        }

        System.out.println("Зачисленно бонусных рублей:" + bonus + "\nБаланс:" + initialAccount + " рублей");
    }
}
