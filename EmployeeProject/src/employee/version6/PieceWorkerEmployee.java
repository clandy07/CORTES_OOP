/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version6;

/**
 *
 * @author User
 */
public class PieceWorkerEmployee extends Employee {
    private int totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee() {

    }


    public PieceWorkerEmployee(int empID, Name empName, MyDate empDateHired, MyDate empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
    }

    public PieceWorkerEmployee(int empID, Name empName, MyDate empDateHired, MyDate empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public double computeSalary() {
        double retVal;

        if(this.totalPiecesFinished < 100) {
            retVal = this.totalPiecesFinished * this.ratePerPiece;
        }
        else {
            int temp = this.totalPiecesFinished / 100;
            retVal = (this.totalPiecesFinished * this.ratePerPiece) + (temp * (this.ratePerPiece * 10));
           
        }
       
        
        return retVal;
    }
    
    public void displayInfo() {
        System.out.printf("Pieces finished: %d\nRate per piece: Php %.2f\nTotal income: Php %.2f",totalPiecesFinished,ratePerPiece,computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal pieces finished: " + this.totalPiecesFinished + "\nRate per piece: " + this.ratePerPiece;
    }

}
