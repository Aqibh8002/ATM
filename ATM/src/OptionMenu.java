
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;
public class OptionMenu extends Account {
    Scanner menusc = new Scanner(System.in);
    DecimalFormat moneyFormet = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<>();

    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                data.put(252525, 232323);
                data.put(858585, 959595);
                System.out.println("Welcome to the ATM Project!");
                System.out.println("Enter your Customer Number");
                setCustomerNumber(menusc.nextInt());
                System.out.println("Enter your PIN");
                setPinNumber(menusc.nextInt());
            } catch (Exception e) {
                System.out.println("\n" + "Invalid Character(s).Only Numbers. " + "|\n");
                x = 2;
            }
            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if (data.containsKey(cn) && data.get(cn) == pn) {
                getAccountType();
            } else {
                System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
            }
        }while (x==1);
    }

    public void getAccountType(){
        System.out.println("Select the Account you Want to Access:");
        System.out.println("Type 1 - Current Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");
        int selection = menusc.nextInt();
        switch (selection){
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank You for using this ATM, Have a Good Day. \n");
                break;
            default:
                System.out.println("\n" + "Invalid Choice." + "\n");
                getAccountType();
        }
    }
    public void getChecking(){
        System.out.println("Current Account: ");
        System.out.println("Type 1- View Balance");
        System.out.println("Type 2- Withdraw Funds");
        System.out.println("Type 3- Deposit Funds");
        System.out.println("Type 4- Exit");
        System.out.println("Choice:");
        int selection = menusc.nextInt();;

        switch (selection) {
            case 1:
                System.out.println("Current Account Balance:" + moneyFormet.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrauInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using this ATM, Have a Good Day.");
                break;
            default:
                System.out.println("\n" + "Invalid Choice." + "\n");
                getChecking();
        }
    }
    public void getSaving(){
        System.out.println("Saving Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");
        int selection = menusc.nextInt();
        switch (selection){
            case 1:
                System.out.println("Saving Account Balance: " + moneyFormet.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getsavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using this ATM, Have a Good Day.");
                break;
            default:
                System.out.println("\n"+"Invalid Choice." + "\n");
                getChecking();
        }
    }
}



