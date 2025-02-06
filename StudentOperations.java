//StudentOperations.java // CRUD operations on ArrayList

import java.util.ArrayList;

class StudentOperations {
    ArrayList <Student> students;

    public StudentOperations(){
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student added");
    }
    public void displayStudents(){
        for(Student student : students){
            student.display();
        }
    }
}
