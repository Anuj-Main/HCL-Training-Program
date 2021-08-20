import java.util.ArrayList;
import java.util.List;

abstract class GenWild {
    abstract void add(); 
        int a = 10;
        int b = 10;
}
class Addition extends GenWild{
        void add(){
            int c=a+b;
        System.out.println("Addition of a+b="+c);
        }
    }
class GenResult{
    public static void addGenWild(List<?extends GenWild>lst){
        for(GenWild gw: lst){
            gw.add();
        }
    }
    public static void main(String args[]){
        List<Addition> lst1=new ArrayList<Addition>();
        lst1.add(new Addition());
        addGenWild(lst1);
    }
}