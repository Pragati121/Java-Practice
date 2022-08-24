class Animal{
    public  void function() {
        System.out.print("eat");
    }
        }
        class features extends Animal{
    public void function()
    {
        System.out.print("dog");
    }
        }
        class Inheritance1
        {
            public static void main(String [] args)
            {
                Animal a=new features();
                a.function();
            }
        }