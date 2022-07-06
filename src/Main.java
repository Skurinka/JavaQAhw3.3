public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double S = 1_000_000; //сумма кредита
        double n = 36; //период
        double i = 0.099 /12; //процентная ставка
        double K = service.calculate(i, n);
        double A = (int) (K * S);
        System.out.print("Сумма ежемесячного платежа: " + A);


    }
}