public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService(); // создание объекта из класса
        double credit = 1_000_000; // 1 000 000 рублей кредит
        double term = 12; // 12 месяцев срок погашения
        double mounthlyPayment = service.calculate(credit, term);
        System.out.println(mounthlyPayment);
    }
}