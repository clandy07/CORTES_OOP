package employee.version3;

public class TestMain {
    public static void main(String[] args) {
        // TODO code application logic here
        MyDate date1 = new MyDate(13,1,2012);
        MyDate date2 = new MyDate(14,7,2003);

        Name name1 = new Name("Eduardo Miguel", "Mellina", "Cortes");
        Name name2 = new Name("Franco Nino", "Mellina", "Cortes");
        Name name3 = new Name("Marco Antonio", "Abella", "Cortes");


//        ----------------------------HOURLY EMPLOYEE----------------------------

        System.out.println("\n\n\nHOURLY EMPLOYEES:");

        HourlyEmployee Emp1 = new HourlyEmployee();
        HourlyEmployee Emp2 = new HourlyEmployee(17283049, name2, date1, date2, 50, 1000);
        HourlyEmployee Emp3 = new HourlyEmployee(22102293, name3, date1, date2);

        Emp1.setEmpID(20101102);
        Emp1.setEmpName(name1);
        Emp1.setEmpDateHired(date1);
        Emp1.setEmpBirthDate(date2);
        Emp1.setTotalHoursWorked(40);
        Emp1.setRatePerHour(1000);

        System.out.println(Emp1);
        System.out.println("\nComputation:");
        Emp1.displayInfo();

        System.out.println("\n.......................................");

//        --------------------------------------------------------------

        System.out.println(Emp2);
        System.out.println("\nComputation:");
        Emp2.displayInfo();

        System.out.println("\n.......................................");

//        --------------------------------------------------------------
        Emp3.setTotalHoursWorked(30);
        Emp3.setRatePerHour(1000);

        System.out.println(Emp3);

        System.out.println("\nComputation:");
        Emp3.displayInfo();

        System.out.println("\n.......................................");

//        ----------------------------PIECE WORKER EMPLOYEE----------------------------

        System.out.println("\n\n\n\nPIECE WORKER EMPLOYEES:");


        PieceWorkerEmployee EmpA = new PieceWorkerEmployee();
        PieceWorkerEmployee EmpB = new PieceWorkerEmployee(17283049, name2, date1, date2, 50, 1000);
        PieceWorkerEmployee EmpC = new PieceWorkerEmployee(22102293, name3, date1, date2);

        EmpA.setEmpID(20101102);
        EmpA.setEmpName(name1);
        EmpA.setEmpDateHired(date1);
        EmpA.setEmpBirthDate(date2);
        EmpA.setTotalPiecesFinished(100);
        EmpA.setRatePerPiece(1000);

        System.out.println(EmpA);
        System.out.println("\nComputation:");
        EmpA.displayInfo();

        System.out.println("\n.......................................");

//        --------------------------------------------------------------

        System.out.println(EmpB);
        System.out.println("\nComputation:");
        EmpB.displayInfo();

        System.out.println("\n.......................................");

//        --------------------------------------------------------------
        EmpC.setTotalPiecesFinished(200);
        EmpC.setRatePerPiece(1000);

        System.out.println(EmpC);

        System.out.println("\nComputation:");
        EmpC.displayInfo();

        System.out.println("\n.......................................");

        //        ----------------------------COMMISSION EMPLOYEE----------------------------

        System.out.println("\n\n\n\nCOMMISSION EMPLOYEES:");


        CommissionEmployee EmpA1 = new CommissionEmployee();
        CommissionEmployee EmpB1 = new CommissionEmployee(17283049, name2, date1, date2, 50000);
        CommissionEmployee EmpC1 = new CommissionEmployee(22102293, name3, date1, date2);

        EmpA1.setEmpID(20101102);
        EmpA1.setEmpName(name1);
        EmpA1.setEmpDateHired(date1);
        EmpA1.setEmpBirthDate(date2);
        EmpA1.setTotalSales(20000);

        System.out.println(EmpA1);
        System.out.println("\nComputation:");
        EmpA1.displayInfo();

        System.out.println("\n.......................................");

//        --------------------------------------------------------------

        System.out.println(EmpB1);
        System.out.println("\nComputation:");
        EmpB1.displayInfo();

        System.out.println("\n.......................................");

//        --------------------------------------------------------------
        EmpC1.setTotalSales(500000);

        System.out.println(EmpC1);

        System.out.println("\nComputation:");
        EmpC1.displayInfo();

        System.out.println("\n.......................................");

        //        ----------------------------BASE PLUS COMMISSION EMPLOYEE----------------------------

        System.out.println("\n\n\n\nBASE PLUS COMMISSION EMPLOYEES:");

        BasePlusCommissionEmployee EmpA2 = new BasePlusCommissionEmployee();
        BasePlusCommissionEmployee EmpB2 = new BasePlusCommissionEmployee(17283049, name2, date1, date2, 50000, 25000);
        BasePlusCommissionEmployee EmpC2 = new BasePlusCommissionEmployee(22102293, name3, date1, date2);

        EmpA2.setEmpID(20101102);
        EmpA2.setEmpName(name1);
        EmpA2.setEmpDateHired(date1);
        EmpA2.setEmpBirthDate(date2);
        EmpA2.setTotalSales(1000);
        EmpA2.setBaseSalary(250000);

        System.out.println(EmpA2);
        System.out.println("\nComputation:");
        EmpA2.displayInfo();

        System.out.println("\n.......................................");

//        --------------------------------------------------------------

        System.out.println(EmpB2);
        System.out.println("\nComputation:");
        EmpB2.displayInfo();

        System.out.println("\n.......................................");

//        --------------------------------------------------------------

        EmpC2.setTotalSales(600000);
        EmpC2.setBaseSalary(250000);

        System.out.println(EmpC2);
        System.out.println("\nComputation:");
        EmpC2.displayInfo();

        System.out.println("\n.......................................");


    }
}
