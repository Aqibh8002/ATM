import java.text.DecimalFormat;
import java.util.*;
public class Account {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance =0;
    private double savingBalance =0;
    Scanner sc = new Scanner(System.in);
    DecimalFormat moneyFormet = new DecimalFormat("'$'###,##0.00");
    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }
    public int getCustomerNumber(){
        return customerNumber;
    }
    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }
    public int getPinNumber(){
        return pinNumber;
    }
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingBalance(){
        return savingBalance;
    }
    public double calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }
    public double calcSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }
    public double calcCheckingDeposit(double anount){
        checkingBalance = (checkingBalance + anount);
        return checkingBalance;
    }
    public double calcSavingDeposit(double amount){
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }
    public void getCheckingWithdrauInput(){
        System.out.println("Checking Account Balance: " + moneyFormet.format(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = sc.nextDouble();

        if ((checkingBalance - amount) >=0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: "+ moneyFormet.format(checkingBalance));
        }else{
            System.out.println("Balance cannot be Negative. " + "\n");
        }
    }
    public  void getsavingWithdrawInput(){
        System.out.println("Saving Account Balance: " + moneyFormet.format(savingBalance));
        System.out.println("Amount you want to withdraw from saving Account:");
        double amount = sc.nextDouble();
        if ((savingBalance-amount)>=0){
            calcSavingWithdraw(amount);
            System.out.println("New saving Account Balance:" + moneyFormet.format(savingBalance));
        }else {
            System.out.println("Balance Cannot be Negative." +"\n");
        }
    }
    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " +moneyFormet.format(checkingBalance));
        System.out.println("Amount you want to deposit from Checking Account: ");
        double amount = sc.nextDouble();

        if ((checkingBalance + amount) >=0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account Balance: " + moneyFormet.format(checkingBalance));
        }else{
            System.out.println("Balance Cannot be Negative: "+"\n");
        }
    }
    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: " + moneyFormet.format(savingBalance));
        System.out.println("Amount you want to Deposit from saving Account: ");
        double amount = sc.nextDouble();

        if ((savingBalance + amount)>=0){
            calcSavingDeposit(amount);
            System.out.println("New Saving Account Balance: " +moneyFormet.format(savingBalance));
        }else{
            System.out.println("Balance Cannot be Negative: " +"\n");

        }
    }

}

