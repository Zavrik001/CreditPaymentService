public class CreditPaymentService {
    public int calculate(int sum, int years, double annualRate) {
        double monthlyRate = annualRate / 12 / 100;
        int months = years * 12;

        double coefficient = monthlyRate * Math.pow(1 + monthlyRate, months) / (Math.pow(1 + monthlyRate, months) - 1);

        double payment = sum * coefficient;

        return (int) Math.round(payment);
    }
}


