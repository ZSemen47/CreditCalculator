public class CreditPaymentService {
    public double calculate  (double credit, double term)
    {
        double interestRate = 9.99; // процентная ставка
        double p1 = 1 + interestRate; // эта переменная нужна для формулы K = (interestRate * p1) / (p1 - 1)
        //формулу взял с сайта (https://www.banki.ru/wikibank/annuitetnyie_plateji_po_kreditu/)
        int p2 = 12; // количество месяцев за которые выплачивается кредит, это степень в которую возвожу p1
        public static double pow (double p1, double p2); // возведение в степень для расчёта по формуле
        {
        return StrictMath.pow(p1, p2);
        }
        double K = (interestRate * p1) / (p1 - 1); //  коэффициент аннуитета
        double S = credit;  // сумма кредита
        double mounthlyPayment = K * S;// ежемесячный аннуитетный платёж = коэффициент аннуитета * сумма кредита
        return mounthlyPayment;
    }
}
