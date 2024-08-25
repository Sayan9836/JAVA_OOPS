public class Student {
    private int id;
    private int grade;
    private String name;
    private int feespaid;
    private int feestotal;

    /**
     * creates a new student object;
     * 
     * @param id
     * @param name
     * @param grade
     */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feespaid = 0;
        this.feestotal = 30000;
    }

    // name and id will not alter;
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * initially feespaid=0;
     * now new fees will add to feespaid;
     * 
     * @param fees the fees student has pay;
     */
    public void payfees(int fees) {
        feespaid += fees;
        School.updateTotalmoneyEarned(feespaid);

    }

    public int getId() {
        return id;

    }

    public String getName() {
        return name;

    }

    public int getGrade() {
        return grade;

    }

    public int getfeespaid() {
        return feespaid;

    }

    public int getfeestotal() {
        return feestotal;

    }

    public int getRemainingfees() {
        return feestotal - feespaid;
    }

}