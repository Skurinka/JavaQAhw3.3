public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double amount = 1_000_000; //credit sum
        double period = 24; //period
        double rate = 0.0999 / 12; //interest rate


        System.out.print("Сумма ежемесячного платежа составляет " + service.calculate(rate, period, amount) + " руб.");


    }
}