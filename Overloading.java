class Man
{
    public void functions()
    {

        System.out.print("young");
    }
}
class N extends Man{
    public  void functions()
    {
        System.out.print("old");
    }

        }
        class Main {
            public static void main(String[] args) {
                Man M = new N();
                M.functions();
            }
        }
