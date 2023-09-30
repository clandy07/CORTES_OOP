package employee.version4;

public class TestMain {
    public static void main(String[] args) {
        // TODO code application logic here
        MyDate date1 = new MyDate(14,7,1975);

        MyDate dateA = new MyDate(13,1,2012);
        MyDate dateB = new MyDate(14,7,1994);
        MyDate dateC = new MyDate(26,8,2008);
        MyDate dateD = new MyDate(10,9,2009);
        MyDate dateE = new MyDate(16,2,2015);

        Name name1 = new Name("Eduardo Miguel", "Mellina", "Cortes");
        Name name2 = new Name("Leubary Jose", "Poncardas", "Lapitan");
        Name name3 = new Name("Matthew Dane", "Lopez", "Compuesto");
        Name name4 = new Name("Dan Lius", "Maloloy-on", "Monsales");
        Name name5 = new Name("Nino Jan", "Roz", "Cabatas");

        Employee emp1 = new HourlyEmployee(10, name1, dateA, date1, 40, 2000);
        Employee emp2 = new PieceWorkerEmployee(20, name2, dateB, date1, 100, 10000);
        Employee emp3 = new CommissionEmployee(30, name3, dateC, date1, 500000);
        Employee emp4 = new BasePlusCommissionEmployee(40, name4, dateD, date1, 150000, 30000);
        Employee emp5 = new PieceWorkerEmployee(50, name5, dateE, date1, 90, 10000);

        EmployeeRoster list = new EmployeeRoster(10);

        list.addEmployee(emp1);
        list.addEmployee(emp2);
        list.addEmployee(emp3);
        list.addEmployee(emp4);
        list.addEmployee(emp5);

        list.displayAllEmployees();


        System.out.println("\nCurrent no. of Hourly Employees: " + list.countHE());
        System.out.println("\nCURRENT HOURLY EMPLOYEES: ");
        list.displayHE();

        System.out.println("\n-------------------------------------------------------------------------------------------------------------------");

        System.out.println("\nCurrent no. of Piece Worker Employees: " + list.countPWE());
        System.out.println("\nCURRENT PIECE WORKER EMPLOYEES: ");
        list.displayPWE();

        System.out.println("\n-------------------------------------------------------------------------------------------------------------------");

        System.out.println("\nCurrent no. of Commission Employees: " + list.countCE());
        System.out.println("\nCURRENT COMMISSION EMPLOYEES: ");
        list.displayCE();

        System.out.println("\n-------------------------------------------------------------------------------------------------------------------");

        System.out.println("\nCurrent no. of Base Plus Commission Employees: " + list.countBPCE());
        System.out.println("\nCURRENT BASE PLUS COMMISSION EMPLOYEES: ");
        list.displayBPCE();

        System.out.println("\n-------------------------------------------------------------------------------------------------------------------");

        list.removeEmployee(30);
        System.out.println("\n");
        list.displayAllEmployees();
        System.out.println("\n");

        Employee catcher = list.getEmployee(50);

        System.out.println(catcher);
        System.out.println("\n");


//        changing birthdate without requiring user input
        list.updateEmployee(50);

        System.out.println(catcher);

    }
}
