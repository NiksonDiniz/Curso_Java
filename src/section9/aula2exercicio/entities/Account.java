package section9.aula2exercicio.entities;

public class Account {
    private final Double TAX = 5.00;
    private Integer number;
    private String holder;
    private Double balance;

    public Account() {
    }

    public Account(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(Integer number, String holder, Double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= (amount + TAX);
    }

    @Override
    public String toString() {
        return "Account " + getNumber()
                + ", Holder: " + getHolder()
                + ", Balance: $ " + String.format("%.2f", getBalance());
    }
}
