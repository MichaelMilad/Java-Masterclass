package InheritanceChallenge1;

public class HourlyEmployee extends Employee {
    public double hourlyPayRate;

    public HourlyEmployee(
            String name, String birthDate, String hireDate, double hourlyPayRate
    ) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay() {
        return this.hourlyPayRate;
    }
}
