package employee.version5;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeRoster {

    public static int MAX=10;
    public static int count = 0;
    private ArrayList<Employee> empList = new ArrayList();

    public EmployeeRoster() {

    }

    public EmployeeRoster(int max) {
        MAX = max;
    }

    public boolean addEmployee(Employee emp) {
        if (count < MAX) {
            empList.add(emp);
            return true;
        } else {
            System.out.println("LIST IS FULL!");
            return false;
        }
    }

    public boolean removeEmployee(int ID) {
        int y, counter = 0;

        for(Employee i : empList) {
            y = i.getEmpID();
            if(y == ID) {
                empList.remove(counter);
                System.out.printf("Employee with ID %d has been removed.",ID);
                return true;
            }
            counter++;
        }
        return false;
    }

    public Employee getEmployee(int ID) {
        int y = 0;

        for(Employee i : empList) {
            y = i.getEmpID();
            if(y == ID) {
                System.out.printf("Employee with ID %d has been obtained",ID);
                return i;
            }
        }
        return null;
    }

    public boolean updateEmployee(int ID) {
        int x = 0, y;
        MyDate newDate = new MyDate(14, 5, 2003);

        for(Employee i : empList) {
            y = i.getEmpID();
            if(ID == y) {
                i.setEmpBirthDate(newDate);
                System.out.printf("Employee with ID %d has been updated.",ID);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    private String getType(Employee emp) {
        if (emp instanceof HourlyEmployee) {
            return "Hourly";
        }
        else if(emp instanceof PieceWorkerEmployee) {
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

        int counter = 0;

        for(Employee i : empList) {
            if (i instanceof HourlyEmployee) {
                counter++;
            }
        }

        return counter;
    }

    public int countPWE() {
        int counter = 0;

        for(Employee i : empList) {
            if (i instanceof PieceWorkerEmployee) {
                counter++;
            }
        }

        return counter;
    }

    public int countCE() {
        int counter = 0;

        for(Employee i : empList) {
            if (i instanceof CommissionEmployee) {
                counter++;
            }
        }

        return counter;
    }

    public int countBPCE() {
        int counter = 0;

        for(Employee i : empList) {
            if (i instanceof BasePlusCommissionEmployee) {
                counter++;
            }
        }

        return counter;
    }

    public void displayHE() {

        for(Employee i : empList) {
            if (i instanceof HourlyEmployee) {
                System.out.println(i);
            }
        }
    }

    public void displayPWE() {

        for(Employee i : empList) {
            if (i instanceof PieceWorkerEmployee) {
                System.out.println(i);
            }
        }
    }

    public void displayCE() {

        for(Employee i : empList) {
            if (i instanceof CommissionEmployee) {
                System.out.println(i);
            }
        }
    }

    public void displayBPCE() {

        for(Employee i : empList) {
            if (i instanceof BasePlusCommissionEmployee) {
                System.out.println(i);
            }
        }
    }

    public void displayAllEmployees() {

        System.out.println("Employee Roster");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-5s | %-32s | %-20s | %-14s | %-28s | \n","ID", "Name", "Type", "Salary", "Remarks");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        for(Employee i : empList) {
            System.out.printf("| %-5s | %-32s | %-20s | Php %-10s | %-28s |\n",
                    i.getEmpID(),
                    i.getEmpName(),
                    this.getType(i),
                    i.computeSalary(),
                    addRemarks(i));
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------");
    }

    public String addRemarks(Employee emp) {
        if (emp instanceof HourlyEmployee) {
            return "Total hours worked: " + ((HourlyEmployee)emp).getTotalHoursWorked();
        }
        else if(emp instanceof PieceWorkerEmployee) {
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
