abstract class AbstractOverride{
    public abstract void method();
}
class AbstractOverride1 extends AbstractOverride{
    public void method(){
        System.out.println("This is AbstractOverride1");
    }
}
class AbstractOverride2 extends AbstractOverride1{
    public void method(){
        System.out.println("This is AbstractOverride2");
    }
}
class TestAbstractOverride{
    public static void main(String[] args) {
        AbstractOverride1 AbsOr = new AbstractOverride1();
        AbsOr.method();
        AbstractOverride2 AbsOr2 = new AbstractOverride2();
        AbsOr2.method();
    }
}