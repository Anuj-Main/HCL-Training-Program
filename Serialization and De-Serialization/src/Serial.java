import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serial implements Serializable{
    public static void main(String[] args){
        Bank bnk=new Bank();
        bnk.bnkName = "HDFC";
        bnk.bnkBranch = "Bhopal";
    }
    try {
        FileOutputStream fos=new FileOutputStream("Serialization ");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(bnk);
        oos.close();
        fos.close();
        System.out.println("Serialization is Created");
    } catch (Exception e) {
        System.out.println(e);
    }
}
