//Main.java

import java.util.*;


class Main{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter PRN:");
            long prn = sc.nextLong();
            System.out.println("Enter branch:");
            String branch = sc.next();
            System.out.println("Enter CGPA:");
            float cgpa = sc.nextFloat();
            StudentOperations operations = new StudentOperations();
            Student student = new Student(name, prn, branch, cgpa);

            
            operations.addStudent(student);

            operations.displayStudents();
        }
    }
}
            
        
