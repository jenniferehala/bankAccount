public class BankAccount {


    public double checking;
    public double savings;


// Static Member Variable | Attribute
public static int numOfAccts;
public static double totalAmt;


// Constructor //
    public BankAccount () {
        numOfAccts++;
    }

    public BankAccount(double checking, double savings){
        this.checking = checking;
        this.savings = savings;
        numOfAccts++;

    }


// Static Method //
    public static int getNumOfAccts(){
        return numOfAccts;
    }

// Getter Methods //
    public double getCheckingAcctBal(){
        return checking;
    }

    public double getSavingsAcctBal(){
        return savings;
    }

// Setter Methods //
    public void depositChecking(double checking){
        this.checking = checking;
        System.out.println("This is my current checking " + checking);
        return checking;
    }

}