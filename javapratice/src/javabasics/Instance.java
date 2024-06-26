package javabasics;

public class Instance {
    int id = 20;
    int CGPA = 8;
    String Name = "Aravind";

    public static void main(String[] args) {
        Instance Student = new Instance();
        System.out.println(Student.id);
        Student.aravind();
    }

    public void aravind() { 
        System.out.println(CGPA); 
    }
}
