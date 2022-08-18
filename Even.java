import java.util.Scanner;


public class Even {
    public static void main(String args[])
    {
        int no;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter any number");
        no=obj.nextInt();
        for (int i = 1; i <= no; i++) {
            if (i%2!= 0) {
                System.out.println(i+ " ");
            }
        }
    }
}
