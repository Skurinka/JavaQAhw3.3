import static java.lang.Math.pow;

public class CreditPaymentService {
    public double calculate(double i, double n) {

        double K;
        double i1 = Math.pow(1 + i, n);

        return K = (i * i1) / (i1 - 1);

    }
}
