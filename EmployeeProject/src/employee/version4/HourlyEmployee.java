/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version4;

/**
 *
 * @author User
 */
public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private float ratePerHour;
    
     public HourlyEmployee() {

    }

    public HourlyEmployee(int empID, Name empName, MyDate empDateHired, MyDate empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
    }

    public HourlyEmployee(int empID, Name empName, MyDate empDateHired, MyDate empBirthDate, int totalHoursWorked, float ratePerHour) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    public double computeSalary() {

         double retVal;
           
            if(this.totalHoursWorked > 40) {
                retVal = (40 * this.ratePerHour) + ((this.totalHoursWorked - 40)*(this.ratePerHour + (this.ratePerHour * 0.50)));
            }
            else {
                retVal = this.totalHoursWorked * this.ratePerHour;
            }
            
            return retVal;
    }
    
    public void displayInfo() {
        System.out.printf("Hours worked for this week: %.2f\nRate per hour: Php %.2f \nTotal income for the week: Php %.2f",totalHoursWorked,ratePerHour,computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal hours worked: " + this.totalHoursWorked + "\nRate per hour: " + this.ratePerHour;
    }
    
}
