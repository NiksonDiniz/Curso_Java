package section14.aula04classeabstrata;

import section14.aula04classeabstrata.Account;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        super.withdraw(amount); // realiza o saque com a regra da super classe
        balance -= 2.0; // adiciona um desconto de 2
    }
}
