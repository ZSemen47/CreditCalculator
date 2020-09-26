public class CreditPaymentService {
    public double calculate  (int credit, int term, double interestRate)
    { // пользуюсь этой формулой расчёта аннуитетного платежа https://www.banki.ru/wikibank/raschet_annuitetnogo_plateja/
        double mounthleInterestRate = interestRate / term;
        double coefficient1 = 1 + mounthleInterestRate;
        double coefficient2 = Math.pow(coefficient1, term);
        double annuityСoefficient = (mounthleInterestRate * coefficient2) / ((coefficient2) - 1);
        double doubleCreditPayment = annuityСoefficient * credit;
        int creditPayment = (int) doubleCreditPayment;
        return creditPayment;
    }
}
