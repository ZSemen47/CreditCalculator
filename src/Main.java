public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService(); // создание объекта из класса
        int credit = 1_000_000; // 1 000 000 рублей кредит
        int term = 12; // 12 месяцев срок погашения
        double interestRate = 9.99; // процентная ставка
        double mounthlyPayment = service.calculate(credit, term, interestRate);
        System.out.printf("Месячный платёж в рублях %.2f", mounthlyPayment);
    }
}