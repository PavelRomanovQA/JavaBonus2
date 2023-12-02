// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int balance = 3400;
        int addend = 1100;

        int bonus;

        if (addend > 1000) {
            bonus = addend / 100;
        } else {
            bonus = 0;
        }

        int finalbalance = balance + addend + bonus;
        System.out.println("Итоговый баланс: " + finalbalance);
        System.out.println("Бонус: " + bonus);

    }
}