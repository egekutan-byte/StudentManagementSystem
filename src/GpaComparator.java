import java.util.Comparator;

public class GpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Float.compare(s2.getGpa(),s1.getGpa());
    }
}