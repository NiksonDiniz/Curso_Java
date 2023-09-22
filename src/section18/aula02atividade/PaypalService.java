package section18.aula02atividade;

public class PaypalService implements OnlinePaymentService {
  @Override
  public double paymentFee(double amount) {
    return amount * 0.01;
  }

  @Override
  public double interest(double amount, int months) {
    return amount * months * 0.02;
  }
}
