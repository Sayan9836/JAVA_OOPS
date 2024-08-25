import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalmoneyEarned;
    private int totalmoneyspent;

    public School(List<Teacher> teachers, List<Student> students) {

        this.teachers = teachers;
        this.students = students;
        totalmoneyEarned = 0;
        totalmoneyspent = 0;
    }

    /**
     * @return List<Teacher> return the list of teachers
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * @param teachers add the teacher to the school
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * @return List<Student> return the list of students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @param students add the student to the school;
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     * @return int return the totalmoneyEarned
     */
    public int getTotalmoneyEarned() {
        return totalmoneyEarned;
    }

    /**
     * @param totalmoneyEarned the totalmoneyEarned to set
     */
    public static void updateTotalmoneyEarned(int moneyEarned) {
        totalmoneyEarned += moneyEarned;
    }

    /**
     * @return int return the totalmoneyspent
     */
    public int getTotalmoneyspent() {
        return totalmoneyspent;
    }

    /**
     * @param totalmoneyspent the totalmoneyspent to set
     */
    public static void updateTotalmoneyspent(int moneyspent) {
        totalmoneyEarned -= moneyspent;
    }

}
