package section18.aula04interfacecomparable;

public class Employee implements Comparable<Employee> {
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        // compara por nome
        //return name.compareTo(other.getName());
        // compara por salario, ordem crescente, com - ordem decrescente
        return -salary.compareTo(other.getSalary());
    }
}
