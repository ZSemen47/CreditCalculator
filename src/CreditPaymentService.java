public class CreditPaymentService {
    public int calculate(int S, int n, double interestRate) { // пользуюсь этой формулой расчёта аннуитетного платежа https://www.banki.ru/wikibank/raschet_annuitetnogo_plateja/
        double i = interestRate / 100 / 12;
        double coef1 = Math.pow(1 + i, n);
        double doubleP = S * (i + (i / (coef1 - 1)));
        int P = (int) doubleP;
        return P;
    }
}
