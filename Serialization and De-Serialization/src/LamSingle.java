interface LamSingle {
   String s(String name);
}
class LamSingle1{
    public static void main(String[] args) {
        LamSingle ls=(name)->{
            return name;
        };
        System.out.println(ls.s("Anuj"));
    }
}
