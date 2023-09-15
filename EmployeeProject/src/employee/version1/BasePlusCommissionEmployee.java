package employee.version1;

public class BasePlusCommissionEmployee {
    private int empID;
    private String empName;
    private MyDate empDateHired;
    private MyDate empBirthDate;
    private double totalSales;
    private double baseSalary;
    private String saleType;



    public BasePlusCommissionEmployee() {

    }

    public BasePlusCommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate, double totalSales, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public MyDate getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(MyDate empDateHired) {
        this.empDateHired = empDateHired;
    }

    public MyDate getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(MyDate empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double computeSalary() {
        double salary = 0;

        if (totalSales < 50000) {
            salary = (totalSales * 0.05) + baseSalary;
            saleType = "low sales";
        } else if (totalSales >= 50000 && totalSales < 100000) {
            salary = (totalSales * 0.20) + baseSalary;
            saleType = "typical sales";
        } else if (totalSales >= 100000 && totalSales < 500000) {
            salary = (totalSales * 0.30) + baseSalary;
            saleType = "typical sales";
        } else if (totalSales >= 500000) {
            salary = (totalSales * 0.50) + baseSalary;
            saleType = "high sales";
        }

        return salary;
    }

    public void displayInfo() {
        double catcher = computeSalary();
        System.out.printf("You have accumulated a total of Php %.2f which means you have %s for this quarter.\nYour total salary after further computation (including your base salary of Php %.2f) is: Php %.2f", totalSales, saleType, baseSalary, catcher);
    }


    @Override
    public String toString() {
        return "\n\n\nID: " + this.empID + "\nName: " + this.empName + "\nDate Hired: " + this.empDateHired + "\nBirth Date: " + this.empBirthDate + "\nTotal sales: " + this.totalSales + "\nBase salary: " + this.baseSalary;
    }
}


