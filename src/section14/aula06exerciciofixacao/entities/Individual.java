package section14.aula06exerciciofixacao.entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if (getAnnualIncome() >= 20000.0) {
            return (getAnnualIncome() * 0.25) - (healthExpenditures * 0.5);
        } else {
            return (getAnnualIncome() * 0.15) - (healthExpenditures * 0.5);
        }
    }
}
