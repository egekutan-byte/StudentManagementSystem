import java.util.*;

public class EnrollmentDemo {
    public static void main(String[] args) {
        Student stu1=new Student("1","Ege",3.37f);
        Student stu2=new Student("2","Kuzey",3.32f);
        Student stu3=new Student("3","Yiğit",3.90f);
        Student stu4=new Student("4","Deniz",3.13f);
        Student stu5=new Student("5","Mustafa",1.9f);
        Student stu6=new Student("6","Ege",1.7f);
        Student stu7=new Student("7","Ege",2.0f);
        Student stu8=new Student("8","Ege",1.5f);
        Student stu9=new Student("9","Ege",1.3f);






        Course c1=new Course(116,"Intro to Programming ||");

        c1.addStudent(stu1);
        c1.addStudent(stu2);
        c1.addStudent(stu3);
        c1.addStudent(stu4);
        c1.addStudent(stu5);
        c1.addStudent(stu6);
        c1.addStudent(stu7);
        c1.addStudent(stu8);
        c1.addStudent(stu9);

       // c1.displayEnrolledStudents();
        System.out.println(c1.getEnrolledStudents().size());
        //c1.filterProbation(c1.getEnrolledStudents());
        System.out.println("-------------------------------------------------");
        System.out.println(c1.getEnrolledStudents().size());

        Collections.sort(c1.getEnrolledStudents(),new GpaComparator());

        System.out.println("--------------------------------------------");
        Collections.sort(c1.getEnrolledStudents());
        //c1.displayEnrolledStudents();

        //c1.removeStudentByID("20250602216");

        c1.searchByName("ege");
        //stu1.printInfo();
        //stu2.printInfo();
        //stu3.printInfo();

    }
}
