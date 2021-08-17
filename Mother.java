public class Mother {
    void hair(){
        System.out.println("Brown Hair");
    }
}
class Daughter extends Mother{
    void same(){
        System.out.println("Daughter inherit the brown hair");
    }
    public static void main(String args[]) {
        Daughter d=new Daughter();
        d.same();
        d.hair();
    }
}

