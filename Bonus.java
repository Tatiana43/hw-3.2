public class Bonus {
    public static void main(String[] args) {
        int initialBalance = 100;
        int bonus;
        int payment;
        payment = 1500;
        if (payment >= 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int balance = initialBalance + payment + bonus;
        System.out.println(bonus);
        System.out.println(balance);
    }
}
