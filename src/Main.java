public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double sum = 1_000_000; //credit sum
        double per = 36; //period
        double inRt = 0.0999 / 12; //interest rate
        double cof = service.calculate(inRt, per); //coefficient
        double A = (int) (cof * sum);
        System.out.print("Сумма ежемесячного платежа составляет " + A + " руб.");


    }
}