public class BankAccount {


    private double checking;
    private double savings;
    private static int totalAccts = 0;
    private static double totalBalance = 0;


    public BankAccount(){
        checking = 0.0;
        totalAccts++;
    }


    public void deposit(String acctType, double depositAmt){
        if(acctType == "checking"){
            checking += depositAmt;
            totalBalance += depositAmt;
        }
        else if(acctType == "savings"){
            savings += depositAmt;
            totalBalance += depositAmt;
        }
    }

    public void withdraw(String acctType, double withdrawAmt){
        if(acctType == "checking"){
            checking -= withdrawAmt;
            totalBalance -= withdrawAmt;
        }
        else if(acctType == "savings"){
            if(savings > withdrawAmt ){
                System.out.println("Can't do that");
                return;
            }
            savings -= withdrawAmt;
            totalBalance -= withdrawAmt;

        }

    }

    public int getTotalAccts(){
        return totalAccts;
    }

    public double getBalanceChecking(){
        return checking;
    }

    public double getBalanceSavings(){
        return savings;
    }

        public double getTotalBalance(){
        return totalBalance;
    }

}
