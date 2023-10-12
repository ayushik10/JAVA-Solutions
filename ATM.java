import java.util.HashMap;
import java.util.Scanner;

class Data {
    float balance;
}

class ATMop {

    Scanner sc = new Scanner(System.in);

    HashMap<Integer, Data> mp = new HashMap<>();

    ATMop() {
        System.out.println("\n______________________________________________________");
        System.out.println("\n                   Welcome to our ATM         ");
        System.out.println("______________________________________________________");
        op();
    }

    public void op() {
        System.out.print("\nEnter your pincode : ");
        int pincode = sc.nextInt();

        if(mp.containsKey(pincode) == true) {
            Data obj = mp.get(pincode);
            menu(obj);
        }

        else {
            System.out.println("\n******* Please create account first *******");
            System.out.print("\nSet your pincode : ");
            int pin = sc.nextInt();

            Data obj = new Data();
            mp.put(pin, obj);
            menu(obj);
        }
    }

    public void menu(Data obj) {

        int x=0;
        while(x!=5) {

            System.out.println("\n\n______________________________________________________");
            System.out.println("                Choose From the given menu");
            System.out.println("______________________________________________________\n");
            System.out.println("                1. Check Balance");
            System.out.println("                2. Deposit Money");
            System.out.println("                3. Withdraw Money");
            System.out.println("                4. Check another account");
            System.out.println("                5. Exit");
            System.out.println("______________________________________________________");

            System.out.print("\nPlease enter valid number : ");
            x = sc.nextInt();
            System.out.println("______________________________________________________");


            if(x==1) {
                checkBalance(obj);
            }

            else if(x==2) {
                deposit(obj);
            }

            else if(x==3) {
                withdraw(obj);
            }

            else if(x==4) {
                op();
            }

            else if(x==5) {
                System.out.println("\n\n            Thank You For Using This ATM!\n");
            }

            else {
                System.out.println("\nPlease enter valid number!");
                menu(obj);
            }
        
        }
    }

    public void checkBalance(Data obj) {
        System.out.print("\nYour Balance : " +obj.balance);
    }

    public void deposit(Data obj) {
        System.out.print("\nEnter your amount : ");
        float a = sc.nextFloat();

        obj.balance += a;

        System.out.println("\nAmount deposited successfully!");
    }

    public void withdraw(Data obj) {
        System.out.print("\nEnter your amount to withdraw : ");
        float a = sc.nextInt();

        obj.balance -= a;

        System.out.println("\nAmount withdrawn successfully!");
    }
}

public class ATM {
    public static void main(String[] args) {
        ATMop obj = new ATMop();
    }
}
