
public class Account {
    private int accountNumber;
    private float accountBalance;
    private float amount;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    

    public void depositFunds(float amount) {
        this.accountBalance += amount;
        System.out.println("\nThank you for depositing!\nAmount deposited: " + amount +
                            "\nCURRENT BALANCE: Php " + this.accountBalance + "\n");
        
    }
    
    public void withdrawFunds(float amount) {
        if(this.accountBalance >= amount) {
            this.accountBalance -= amount;
            System.out.println("Thank you for withdrawing!\nAmount withdrawn: " + amount +
                              "\nREMAINING BALANCE: Php " + this.accountBalance + "\n");
        }
        else {
            System.out.println("TRANSACTION FAILED. YOU HAVE INSUFFICIENT FUNDS\n");
        }
    }

    @Override
    public String toString() {
        return String.format("\nAccount Number: " + this.accountNumber 
                          + "\nName: " + this.customerName
                          + "\nEmail: " + this.email
                          + "\nPhone number: " + this.phoneNumber
                          + "\nAccount balance: Php " + this.accountBalance);
    }   
        
    }

    

