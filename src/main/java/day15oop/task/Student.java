package day15oop.task;

public class Student extends Person {

    private int studentId;
    private String fieldOfStudy;

    private String grade ;

    private String schoolName;

    public Student(String name, int age, String gender, int studentId, String fieldOfStudy, String grade, String schoolName) {
        super(name, age, gender);
        this.studentId = studentId;
        this.fieldOfStudy = fieldOfStudy;
        this.grade = grade;
        this.schoolName = schoolName;
    }

    public void study (){
        System.out.println( "Study Method" );
    } // INSTANCE - ÖRNEK METHOD

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade='" + grade + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    // GETTER METHOD
    public int getStudentId() {
        return studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public String getGrade() {
        return grade;
    }

    public String getSchoolName() {
        return schoolName;
    }


    // SETTER METHOD

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /*
    2. Create a subclass of Person named Student:
				Extra variables:
						studentId, fieldOfStudy, grade, schoolName

				Encapsulate all the fields

				Add a constructor that can set all the fields

							Condition:
									1. filedOfStudy and schoolName should not be set to null
									2. filedOfStudy and schoolName should not be empty
									3. grade must be valid (A, B, C, D, F)


				Extra methods:
					study()
					toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included


     */

}
