import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Задание 3
        System.out.println("Задание № 3 ");
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите сумму займа: ");
        double credit = Double.parseDouble(scan.nextLine());
        System.out.println("сумма займа = " + credit + " ₽");

        System.out.println("Введите процентную ставку: ");
        double percent = Double.parseDouble(scan.nextLine());
        System.out.println("процентная ставка = " + percent + " %");

        System.out.println("Введите количество лет погашения: ");
        int period = Integer.parseInt(scan.nextLine());
        System.out.println("Период погашения = " + period + " г.");

        double payments = new CreditPaymentService().calculate(credit, percent, period);

        System.out.println("Ваш ежемесечный платёж состовляет = " + payments);
        System.out.println("Ваш ежемесечный платёж c округлением состовляет = " + Math.round(payments));

    }

}