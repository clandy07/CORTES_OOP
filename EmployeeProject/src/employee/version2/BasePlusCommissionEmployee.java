package employee.version2;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;


    public BasePlusCommissionEmployee() {

    }

    public BasePlusCommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
    }

    public BasePlusCommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate, double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate, totalSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary() {
        double salary = super.computeSalary();

        salary += baseSalary;

        return salary;
    }


    @Override
    public String toString() {
        return super.toString() + "\nBase salary: " + this.baseSalary;
    }
}


