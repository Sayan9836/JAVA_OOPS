import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher ramkrishna = new Teacher(1, "ramkrishna", 100);
        Teacher bairi = new Teacher(2, "bairi", 200);
        Teacher moumita = new Teacher(3, "moumita", 300);
        Teacher soumen = new Teacher(4, "soumen", 1200);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(ramkrishna);
        teacherList.add(bairi);
        teacherList.add(moumita);
        teacherList.add(soumen);

        Student sayan = new Student(1, "sayan", 2);
        Student jishu = new Student(1, "jishu", 3);
        Student somnath = new Student(1, "somnath", 4);
        Student nandi = new Student(1, "nand", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(sayan);
        studentList.add(jishu);
        studentList.add(somnath);
        studentList.add(nandi);

        School dps = new School(teacherList, studentList);

        sayan.payfees(10000);
        somnath.payfees(2000);
        System.out.print("dps has earned: " + dps.getTotalmoneyEarned());
        System.out.println();

        System.out.println("*****************AFTER SCHOOL PAYING SALARY**************");
        // System.out.println();
        ramkrishna.receiveSalary(ramkrishna.getsalary());
        soumen.receiveSalary(soumen.getsalary());
        // System.out.print(dps.getTotalmoneyEarned());
        // System.out.println(moumita.getsalary());
        // System.out.println(sayan);

        System.out.println(dps.getTotalmoneyEarned());

    }
}
