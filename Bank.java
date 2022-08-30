import java.util.*;
class Encapsulation{
private double balance= 30000;
private int pin;
 void deposit(double money) {
    System.out.println("enter the pin");
    Scanner s = new Scanner(System.in);
    pin = s.nextInt();
    if(pin==234) {
        balance = balance + money;
        System.out.println("deposit money" + money);
        System.out.println("Total balance" + balance);
    }
    else {
        System.out.println("wrong password");
    }
}
 void Withdraw(double money) {
    System.out.println("enter the pin");
    Scanner s1 = new Scanner(System.in);
    pin = s1.nextInt();
    if (pin == 234) {
        balance = balance - money;
        System.out.println("d                                                                                                               eposit money" + money);
        System.out.println("Total balance" + balance);
    } else {
        System.out.println("inavalid pin");
    }
}
}
class bank {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        int i;
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("Enter the number");
        Scanner s1 = new Scanner(System.in);
        i = s1.nextInt();
        switch (i) {
            case 1:
                obj.deposit(4000);
                break;
            case 2:
                obj.Withdraw(1000);
                break;
            default:
                System.out.println("invalid");
        }
    }
}

