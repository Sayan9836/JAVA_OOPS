public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned = 0;

    /**
     * //creates a new teacher object;
     * 
     * @param id
     * @param name
     * @param salary
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getsalary() {
        return salary;
    }

    // public void setsalary(int salary) {
    // this.salary = salary;
    // }

    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalmoneyspent(salaryEarned);

    }
}
