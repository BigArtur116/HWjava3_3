public class CreditPaymentService {
    public int calculate(long amount, double percent, int loanTern) {

        double a = percent / 100 / 12;  // Месячный %
        int b1 = -loanTern * 12;      // Срок кредита в мес. отрицательный
        double c1 = 1 + a;             // 1+мес.%
        double x = Math.pow(c1 , b1); // 1+мес.% в степени - срок кредита

        double result = amount * a / (1-x); // Ежемесячный платеж в double
        return (int)result;
    }

}
