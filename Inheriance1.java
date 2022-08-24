class Gender {
    public void display() {
        System.out.print("girl");
    }
}
    class Pragati extends Gender {
        public void function() {
            System.out.print("boy");
        }
    }
    class state {
        public static void main(String[] args) {
            Pragati P= new Pragati();
            P.function();
        }
    }
