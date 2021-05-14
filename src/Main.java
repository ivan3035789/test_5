public class Main {
    public static void main(String[] args) {
        int initialAccount = 300;
        int topUp = 1500;
        int forEvery100Rubles = 100;
        int bonus = topUp / forEvery100Rubles;
        if (topUp > 1000) {
            initialAccount += bonus;
        } else {
            bonus = 0;
        }
        System.out.println("Зачисленно бонусных рублей:" + bonus + "\nБаланс:" + initialAccount + " рублей");
    }
}
