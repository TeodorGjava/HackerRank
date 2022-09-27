package DataStructures;

import java.util.*;

public class Sorting {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<StudentToSort> studentList = new ArrayList<>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            StudentToSort st = new StudentToSort(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        studentList.sort(
                Comparator.comparingDouble(StudentToSort::getCgpa)
                        .reversed()
                        .thenComparing(StudentToSort::getFname)
                        .thenComparing(StudentToSort::getId)
        );
        for(StudentToSort st: studentList){
            System.out.println(st.getFname());
        }
    }
}
class StudentToSort {
    private int id;
    private String fname;
    private double cgpa;
    public StudentToSort(int id, String fname, double cgpa) {
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

