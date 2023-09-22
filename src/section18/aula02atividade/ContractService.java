package section18.aula02atividade;

import java.time.LocalDate;

public class ContractService {
  private OnlinePaymentService onlinePaymentService;

  public ContractService() {
  }

  public ContractService(OnlinePaymentService onlinePaymentService) {
    this.onlinePaymentService = onlinePaymentService;
  }

  public void processContract(Contract contract, int months) {
    double basicQuota = contract.getTotalValue() / months;
    for (int i = 1; i <= months; i++) {
      LocalDate dueDate = contract.getDate().plusMonths(i);
      double interest = onlinePaymentService.interest(basicQuota, 1);
      double fee = onlinePaymentService.paymentFee(basicQuota + interest);
    }

    contract.getInstallments().add(new Installment(LocalDate.of(2018, 7, 25), 100.0));
  }
}
