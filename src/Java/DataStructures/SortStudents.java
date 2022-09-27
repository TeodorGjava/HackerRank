package DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
    private final int id;
    private final String fname;
    private final double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
public class SortStudents {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<StudentToSort> studentList = new ArrayList<StudentToSort>();
        while(testCases>0){
            int id = in.nextInt();
            String fName = in.next();
            double cgpa = in.nextDouble();

            StudentToSort st = new StudentToSort(id, fName, cgpa);
            studentList.add(st);

            testCases--;
        }

        for(StudentToSort st: studentList){
            System.out.println(st.getFname());
        }
    }
}
