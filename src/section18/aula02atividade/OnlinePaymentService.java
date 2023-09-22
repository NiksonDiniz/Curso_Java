package section18.aula02atividade;

public interface OnlinePaymentService {
  double paymentFee(double amount);

  double interest(double amount, int months);
}
