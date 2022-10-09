public class main {

    public static void main(String[] args) {

        int creditPeriod = 1;
        int creditMoney = 1_000_000;
        double percent = 9.9;

        if(creditPeriod<1 || creditPeriod>3){
            System.out.println("Неверный срок кредитования");
        }
        else if (creditMoney<0 || creditMoney> 5_000_000) {
            System.out.println("Неверная сумма кредитования");
        }
        else if (percent<=0) {
            System.out.println("Неверный процент кредитования");
        }
        else {

            CreditPaymentService calc = new CreditPaymentService();

            System.out.println("Входные данные:\nПроцент по кредиту: " + percent + "\nПериод кредитования: " + creditPeriod + "\nСумма кредита: " + creditMoney);
            System.out.println("\nЕжемесячный платеж: " + calc.calculate(creditMoney, creditPeriod, percent));
        }
    }
}
