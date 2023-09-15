/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;
/**
 *
 * @author User
 */
public class HourlyEmployee {
    private int empID;
    private String empName;
    private MyDate empDateHired;
    private MyDate empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;
    private double retVal;
    
     public HourlyEmployee() {
         
    }

    public HourlyEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate) {
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
           
            if(this.totalHoursWorked > 40) {
                retVal = (40 * this.ratePerHour) + ((this.totalHoursWorked - 40)*(this.ratePerHour + (this.ratePerHour * 0.50)));
            }
            else {
                retVal = this.totalHoursWorked * this.ratePerHour;
            }
            
            return retVal;
    }
    
    public void displayInfo() {
        System.out.printf("Hours worked for this week: %.2f\nRate per hour: Php %.2f \nTotal income for the week: Php %.2f",totalHoursWorked,ratePerHour,retVal);
    }

    @Override
    public String toString() {
        return "\n\nID: " + this.empID + "\nName: " + this.empName + "\nDate Hired: " + this.empDateHired + "\nBirth Date: " + this.empBirthDate;
    }
    
}
