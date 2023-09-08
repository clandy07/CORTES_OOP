
public class ClassChallenge {

    public static void main(String[] args) {
        Account person1 = new Account();
        person1.setAccountNumber(20101102);
        person1.setAccountBalance(2000);
        person1.setCustomerName("Eduardo Miguel Cortes");
        person1.setPhoneNumber("0917704403");
        person1.setEmail("edelcortes3@gmail.com");

        System.out.println(person1);

        person1.depositFunds(4000);
        person1.withdrawFunds(4000);
        person1.withdrawFunds(500);
        person1.withdrawFunds(1500);
        person1.withdrawFunds(1500);
    }
}
