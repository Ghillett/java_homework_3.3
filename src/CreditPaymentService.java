public class CreditPaymentService {

    public int calculate(int creditMoney, int creditPeriod, double percent) {
        // считаем месячный процент
        double monthlyPercent = percent / 100 / 12;
        // считаем коэффицент кредита
        double coefficient = monthlyPercent * (Math.pow(1+monthlyPercent, creditPeriod*12)) / (Math.pow(1+monthlyPercent, creditPeriod*12)-1);
        int monthlyPayment = (int) (creditMoney * coefficient);

       return monthlyPayment;
    }
}
