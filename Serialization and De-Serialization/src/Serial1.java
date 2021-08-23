import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class Serial1 implements Serializable{
    String name;
    int EnrollmentNo;
    transient float CGPA;
    Serial1(String name, int EnrollmentNo, double d){
        this.name=name;
        this.EnrollmentNo=EnrollmentNo;
        this.CGPA =CGPA;
    }
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Enrollment Number: " + this.EnrollmentNo);
        System.out.println("CGPA: " + this.CGPA);
    }
}
class TestSerial{
    public static void main(String args[]) throws IOException, ClassNotFoundException{
        Serial1 s1= new Serial1("Anuj Dwivedi", 0533171016, 7.8);
        System.out.println("Before De-Serialization:");
        s1.display();
        FileOutputStream fos = new FileOutputStream("Test Serial");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
        FileInputStream fis = new FileInputStream("demo.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Serial1 deserializedSerial1 = (Serial1) ois.readObject();

        System.out.println("\nAfter De-Serialization:");
        deserializedSerial1.display();
        ois.close();
        fis.close();
    }
}
