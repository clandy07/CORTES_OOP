package employee.version4;

import java.util.Scanner;

public class EmployeeRoster {

    public static int MAX=10;
    public static int count = 0;
    private Employee[] empList = new Employee[MAX];

    public EmployeeRoster() {

    }

    public EmployeeRoster(int max) {
        MAX = max;
    }

    public boolean addEmployee(Employee emp) {
        if (count < MAX) {
            empList[count] = emp;
            count++;
            return true;
        } else {
            System.out.println("LIST IS FULL!");
            return false;
        }
    }

    public boolean removeEmployee(int ID) {
        Employee[] newList = new Employee[count];
        int y, x=0, k=0;

        for(;x < count;x++) {
            y = empList[x].getEmpID();
            if(ID != y) {
                newList[k] = empList[x];
                k++;
            }
        }
        if(k != x) {
            count--;
            empList = newList;
            System.out.printf("Employee with ID %d has been removed from the roster.",ID);
            return true;
        }
        else {
            return false;
        }
    }

    public Employee getEmployee(int ID) {
        int x=0, y;

        for(; x < count; x++) {
            y = empList[x].getEmpID();
            if(ID == y) {
                System.out.printf("Employee with ID %d has been obtained.",ID);
                return empList[x];
            }
            }
        return null;
    }

    public boolean updateEmployee(int ID) {
        int x = 0, y;
        MyDate newDate = new MyDate(14, 5, 2003);

        for(;x < count; x++) {
            y = empList[x].getEmpID();
            if(ID == y) {
                empList[x].setEmpBirthDate(newDate);
                System.out.printf("Employee with ID %d has been updated.",ID);
                return true;
            }
        }
        return false;
    }

    public Employee[] getEmpList() {
        return empList;
    }

    private String getType(Employee emp) {
        if (emp instanceof HourlyEmployee) {
            return "Hourly";
        }
        else if(emp instanceof employee.version4.PieceWorkerEmployee) {
            return "Piece Worker";
        }
        else if(emp instanceof CommissionEmployee) {
            return "Commission";
        }
        else if(emp instanceof BasePlusCommissionEmployee) {
            return "Base Plus Commission";
        }
        else {
            return "N/A";
        }
    }

    public int countHE() {
        Employee[] LIST = this.getEmpList();
        int counter = 0;

        for(int x = 0;x < count;x++) {
            if (LIST[x] instanceof HourlyEmployee) {
                counter++;
            }
        }

        return counter;
    }

    public int countPWE() {
        Employee[] LIST = this.getEmpList();
        int counter = 0;

        for(int x = 0;x < count;x++) {
            if (LIST[x] instanceof PieceWorkerEmployee) {
                counter++;
            }
        }

        return counter;
    }

    public int countCE() {
        Employee[] LIST = this.getEmpList();
        int counter = 0;

        for(int x = 0;x < count;x++) {
            if (LIST[x] instanceof CommissionEmployee) {
                counter++;
            }
        }

        return counter;
    }

    public int countBPCE() {
        Employee[] LIST = this.getEmpList();
        int counter = 0;

        for(int x = 0;x < count;x++) {
            if (LIST[x] instanceof BasePlusCommissionEmployee) {
                counter++;
            }
        }

        return counter;
    }

    public void displayHE() {
        Employee[] LIST = this.getEmpList();

        for(int x = 0;x < count;x++) {
            if (LIST[x] instanceof HourlyEmployee) {
                System.out.println(LIST[x]);
            }
        }
    }

    public void displayPWE() {
        Employee[] LIST = this.getEmpList();

        for(int x = 0;x < count;x++) {
            if (LIST[x] instanceof PieceWorkerEmployee) {
                System.out.println(LIST[x]);
            }
        }
    }

    public void displayCE() {
        Employee[] LIST = this.getEmpList();

        for(int x = 0;x < count;x++) {
            if (LIST[x] instanceof CommissionEmployee) {
                System.out.println(LIST[x]);
            }
        }
    }

    public void displayBPCE() {
        Employee[] LIST = this.getEmpList();

        for(int x = 0;x < count;x++) {
            if (LIST[x] instanceof BasePlusCommissionEmployee) {
                System.out.println(LIST[x]);
            }
        }
    }

    public void displayAllEmployees() {
        Employee[] LIST = this.getEmpList();

        System.out.println("Employee Roster");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-5s | %-32s | %-20s | %-14s | %-28s | \n","ID", "Name", "Type", "Salary", "Remarks");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        for(int x = 0; x < count ; x++) {
            System.out.printf("| %-5s | %-32s | %-20s | Php %-10s | %-28s |\n",
                    LIST[x].getEmpID(),
                    LIST[x].getEmpName(),
                    this.getType(LIST[x]),
                    LIST[x].computeSalary(),
                    addRemarks(LIST[x]));
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------");
    }

    public String addRemarks(Employee emp) {
        if (emp instanceof HourlyEmployee) {
            return "Total hours worked: " + ((HourlyEmployee)emp).getTotalHoursWorked();
        }
        else if(emp instanceof employee.version4.PieceWorkerEmployee) {
            return "Total pieces finished: " + ((PieceWorkerEmployee)emp).getTotalPiecesFinished();
        }
        else if(emp instanceof CommissionEmployee) {
            return "Total sales: " + ((CommissionEmployee)emp).getTotalSales();
        }
        else if(emp instanceof BasePlusCommissionEmployee) {
            return "Base salary: " + ((BasePlusCommissionEmployee)emp).getBaseSalary();
        }
        else {
            return "N/A";
        }
    }
}
