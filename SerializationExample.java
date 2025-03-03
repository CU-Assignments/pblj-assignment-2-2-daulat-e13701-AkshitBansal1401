import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        try {
            // Serialization
            Student student = new Student("Alice", 101);
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();
            System.out.println("Student object serialized.");

            // Deserialization
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student deserializedStudent = (Student) in.readObject();
            in.close();
            fileIn.close();
            
            System.out.println("Deserialized Student:");
            deserializedStudent.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
