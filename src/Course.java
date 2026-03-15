import java.util.*;

public class Course {
    private int courseCode;
    private String courseName;
    private ArrayList<Student> enrolledStudents;
    private ArrayList<Student> probationList;


    public Course(int courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.enrolledStudents =new ArrayList();
        this.probationList=new ArrayList<>();
    }

    public int getCourseCode() {return courseCode;}
    public void setCourseCode(int courseCode) {this.courseCode = courseCode;}
    public String getCourseName() {return courseName;}
    public void setCourseName(String courseName) {this.courseName = courseName;}
    public ArrayList<Student> getEnrolledStudents() {return enrolledStudents;}
    public void setEnrolledStudents(ArrayList enrolledStudents) {this.enrolledStudents = enrolledStudents;}

    public void addStudent(Student s){
        enrolledStudents.add(s);
        //System.err.println("Course Full: Cannot enroll more than 3 students.");
    }

    public void removeStudentByID(String id){
        for (int i = 0; i < enrolledStudents.size(); i++) {
            if(enrolledStudents.get(i).getStudentID().equals(id)){
                enrolledStudents.remove(i);
                System.out.println("Student[ID] has been removed!");
                return;
            }
        }
        System.err.println("Error:Student not found in this course!");
    }

    public void displayEnrolledStudents(){
        for(int i=0;i<enrolledStudents.size();i++){
            enrolledStudents.get(i).printInfo();
        }
    }

    public void filterProbation(ArrayList<Student> enrolledStudents){
        for (int i = 0; i < enrolledStudents.size(); i++) {
            if(enrolledStudents.get(i).getGpa()<2.0){
                enrolledStudents.remove(enrolledStudents.get(i));
                probationList.add(enrolledStudents.get(i));
            }
        }
    }

    public ArrayList<Student> searchByName(String keyword){
        ArrayList<Student> results=new ArrayList<>();
        ArrayList<Student> emptyList=new ArrayList<>();
        for (int i = 0; i <enrolledStudents.size(); i++) {
            if(enrolledStudents.get(i).getName().equalsIgnoreCase(keyword)){
                results.add(enrolledStudents.get(i));
            }
        }
        for (int i = 0; i <probationList.size(); i++) {
            if(probationList.get(i).getName().equalsIgnoreCase(keyword)){//contains yazınca çalışmadı kod
                results.add(probationList.get(i));
            }
        }
        if(!results.isEmpty()){
            for (int i = 0; i < results.size(); i++) {
                System.out.println(results.get(i));
            }
            return results;
        }else{
            return emptyList;
        }
    }
}
