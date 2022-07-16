import static java.lang.Math.pow;

public class CreditPaymentService {
    public double calculate(double rate, double period, double amount) {
        double monthpay;

        double i = Math.pow(1 + rate, period);

        double cof = (rate * i) / (i - 1);

        return monthpay = (int) (cof * amount);


    }
}
