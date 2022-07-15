import static java.lang.Math.pow;

public class CreditPaymentService {
    public double calculate(double inRt, double per) {

        double cof;
        double i1 = Math.pow(1 + inRt, per);

        return cof = (inRt * i1) / (i1 - 1);

    }
}
