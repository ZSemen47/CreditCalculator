public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService(); // создание объекта из класса
        int S = 1_000_000; // 1 000 000 рублей кредит
        int n = 12; // 12 месяцев срок погашения
        double interestRate = 9.99; // процентная ставка
        System.out.println(" Месячный платёж в рублях " + service.calculate(S, n, interestRate));
        n = 24;
        System.out.println(" Месячный платёж в рублях " + service.calculate(S, n, interestRate));
        n = 36;
        System.out.println(" Месячный платёж в рублях " + service.calculate(S, n, interestRate));
    }
}