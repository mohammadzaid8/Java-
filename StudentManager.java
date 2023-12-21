import java.io.*;

class Student implements Serializable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class StudentManager {
    private static final String FILE_PATH = "student_data.dat";

    public static void main(String[] args) {
        // Write student information to a file
        Student student1 = new Student("John Doe", 20);
        Student student2 = new Student("Jane Smith", 19);

        writeToFile(student1);
        writeToFile(student2);

        // Read student information from the file
        readFromFile();
    }

    public static void writeToFile(Student student) {
        try (FileOutputStream fileOut = new FileOutputStream(FILE_PATH, true);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(student);
            System.out.println("Student information written to file: " + student);
        } catch (IOException e) {
            System.out.println("Error writing student information to file: " + e.getMessage());
        }
    }

    public static void readFromFile() {
        try (FileInputStream fileIn = new FileInputStream(FILE_PATH);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            System.out.println("Student information retrieved from file:");

            while (true) {
                Student student = (Student) objectIn.readObject();
                System.out.println(student);
            }
        } catch (EOFException e) {
            System.out.println("End of file reached.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading student information from file: " + e.getMessage());
        }
    }
}
