import java.util.Scanner;

public class Tournament {

    private String name;
    private String location;
    private Team[] teams;

    private int teamCount = 0;

    public Tournament() {

    }


    public Tournament(String name, String location) {
        this.name = name;
        this.location = location;
        teams = new Team[20];
        teamCount = 0;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }


    public void TeamMaker() {
        Scanner sc = new Scanner(System.in);
        Team team = new Team();
        System.out.print("Enter your Team name: ");
        Team.setName(sc.next());
        System.out.print("Enter your Team id: ");
        Team.setId(sc.nextInt());
        
    }

    
}
