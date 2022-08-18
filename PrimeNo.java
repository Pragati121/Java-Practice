public class PrimeNo {
    public static void main(String args[]) {
        int no = 4;
        int count=0;
        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                count++;
            }
            if(count==0) {
                System.out.print("number is not prime number");
            }
            else{
                System.out.println("number is prime");
            }
        }
    }
}

