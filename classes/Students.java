package classes;

/**
 *  StudentInterface
 */
interface  StudentInterface {
    String SCHOOL_NAMR = "SMKN 14 SAMARINDA";
    String getStudentName();
    void setStudentName(String newStudentName);
}

abstract class StudentAbs implements StudentInterface {
    protected String studentName;
    protected int studentID;
    protected int studentClassID;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String newStudentName) {
        this.studentName = newStudentName;
    }
}

class Student extends StudentAbs {
    public Student(String studentName, int studentClassID) {
        this.studentName = studentName; 
        this.studentClassID = studentClassID;
    }
}

public class Students {
    public static void main(String[] args) {
        Student student = new Student("Dodi", 9);
        Student student2 = new Student("Dobleh", 9);
        Student student3 = new Student("Yudi", 8);
        student3.setStudentName("Yuda");
        System.out.println(student.getStudentName());
        System.out.println(student2.getStudentName());
        System.out.println(student3.getStudentName());
    }
}
