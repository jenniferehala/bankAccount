public class BankMain {


    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.deposit("checking",1000);
        account1.deposit("savings",2000);
        account1.withdraw("checking",1050);
        account1.withdraw("savings",20);
        System.out.println("Checking balance of " + account1.getBalanceChecking());
        System.out.println("Savings balance of " + account1.getBalanceSavings());
        System.out.println("Total accounts are " + account1.getTotalAccts());
        System.out.println("Total balance is " + account1.getTotalBalance());
        // System.out.println("Bank Account " + account.getNumOfAccts());
        // System.out.println("Has a balance of " + account.getBalance());

        

    }


}