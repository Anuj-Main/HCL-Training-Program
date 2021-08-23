interface LamMultiExp {
    int add(int a, int b);
}
class LamMultiExp1{
    public static void main(String[] args) {
        LamMultiExp lme=(a,b)->(a+b);
        System.out.println(lme.add(15, 30));
        LamMultiExp lme1=(a,b)->(a-b);
        System.out.println(lme1.add(30, 20));
    }
}
