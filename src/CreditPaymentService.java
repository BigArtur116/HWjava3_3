public class CreditPaymentService {
    public int calculate(long amount, double percent, int loanTern) {

        double monthlyPercent = percent / 100 / 12;  // Месячный %
        int loanTernInMonths = loanTern * 12;      // Срок кредита в мес.
        double result = amount * monthlyPercent / (1 - Math.pow(1 + monthlyPercent, -loanTernInMonths)); // Ежемесячный платеж в double
        return (int) result;
    }

}
