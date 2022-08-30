import java.util.*;
class BankEncapsulation {
    private double balance = 30000;
    private int pin;

    void deposit(double money)
    {
        System.out.println("enter the pin");
        Scanner s = new Scanner(System.in);
        pin = s.nextInt();
        if (pin == 234) {
            balance = balance + money;
            System.out.println("deposit money" + money);
            System.out.println("Total balance" + balance);
        }
        else
        {
            System.out.println("wrong password");
        }
    }

    void Withdraws(double money) {
        System.out.println("enter the pin");
        Scanner s1 = new Scanner(System.in);
        pin = s1.nextInt();
        if (pin == 234) {
            System.out.println("Enter the withdrawl money");
            Scanner mn = new Scanner(System.in);
            money = mn.nextDouble();
            if (balance <= money) {
                balance = balance - money;
                System.out.print("withdraw Money" + " " + money);
                System.out.print("total money" + " " + balance);
            } else {
                System.out.print("The amount is less in your account");
            }
        }
    }
}
class Withdraw {
    public static void main(String[] args) {
        BankEncapsulation obj = new BankEncapsulation();
        int k;
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("Enter the number");
        Scanner s1 = new Scanner(System.in);
        k = s1.nextInt();
        switch (k)
        {
            case 1: obj.deposit(k);
                break;
            case 2: obj.Withdraws(k);
                break;
            default:System.out.println("invalid");
        }
    }
}


