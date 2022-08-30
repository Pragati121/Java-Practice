public class Overloading3 {
    void display(String i, int j)
    {
        System.out.println(i+ " " + j+" ");
    }
    void display(int i, String j, int k)
    {
        System.out.println(i+ " " + j+" "+i +" ");
    }
}
class Main
{
    public static void main(String[] args){
    Overloading3 Obj= new Overloading3();
    Obj.display("Pragati",90);
    Obj.display(80,"ria",50);
    }
}