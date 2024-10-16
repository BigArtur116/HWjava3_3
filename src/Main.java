public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        long amount = 1_000_000; // Срок кредита в руб.
        double percent = 9.99;  // Процет годовой %
        int loanTern = 1;   // Срок кредита в годах
        int result = service.calculate(amount, percent, loanTern);

        System.out.println("Сумма кредита " + amount + " руб.");
        System.out.println("Срок кредита " + loanTern + " год.");
        System.out.println("Процентная ставка " + percent + " %");
        System.out.println("Ежемесячный платёж " + result + " руб.");

    }
}
