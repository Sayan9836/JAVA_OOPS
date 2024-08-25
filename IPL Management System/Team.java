import java.util.Scanner;

public class Team {
    private String name;
    private int teamId;
    private Player[] players;

    private int playerCount = 0;

    public Team() {

    }
    
    public Team(String name, int teamId) {
        this.name = name;
        this.teamId = teamId;
        players = new Player[20];
        playerCount = 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTeamId() {
        return teamId;
    }
    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public void AddPlayer() {

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter 1 for Batsman || 2 for Bowler || 3 for wicketkeeper");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                 players[playerCount++] = new Batsman();

                 case 2:
                 players[playerCount++] = new Bowler();

                 case 3:
                 players[playerCount++] = new Wicketkeeper();

                 case 4:
                 break;
            }
            
        } while (choice != 3);

    }


    
}
