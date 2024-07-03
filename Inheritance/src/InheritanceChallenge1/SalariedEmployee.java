package InheritanceChallenge1;

public class SalariedEmployee extends Employee {
    public double annualSalary;
    public boolean isRetired;

    public SalariedEmployee(
            String name, String birthDate, String hireDate, double annualSalary
    ) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire() {
        System.out.println("Employee " + this.name + " Has retired !");
    }
}
