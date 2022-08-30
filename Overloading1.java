class Overloading1 {
    void Function1(int i) {
        System.out.println(i + " ");
    }

    void Function1(int i,int j) {
        System.out.print(i + " "+j+" ");
    }
}
class overloading2
{
    public static void main(String[] args) {
        Overloading1 O = new Overloading1();
        O.Function1(90);
        O.Function1(90, 80);
    }

}

