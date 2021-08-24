interface LamExp {
    abstract void Student();
}
class Lam1{
    public static void main(String[] args) {
        String s="Anuj";
        LamExp le=()->{
            System.out.println("Name: "+s);
        };
        le.Student();
    }
}
