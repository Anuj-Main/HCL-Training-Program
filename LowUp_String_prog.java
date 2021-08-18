public class LowUp_String_prog {
    public static void main(String args[]) {
        char a[] = { 'W', 'E', 'L', 'C', 'O', 'M', 'E' };
        String s1 = "WELCOME IN HCL TECHNOLOGIES";
        String s1lower = s1.toLowerCase();
        String s2 = new String(a);
        String s3 = new String("Welcome to HCL Training Program");
        String s3upper = s3.toUpperCase();
        System.out.println(s2);
        System.out.println(s1lower);
        System.out.println(s3upper);
    }
}
