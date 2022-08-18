public class Leap
{
    public static void main(String []args)
    {
        int year=1969;
        if(year % 400 == 0) {
            System.out.print(year + "leap year");
        }
        else if(year %100==0) {
            System.out.print(year + "not a leap year");
        }
        else if(year%4==0) {
            System.out.print(year + "leap year");
        }
            else
            {
                System.out.print(year+"not a leap year");
        }
        }
    }

