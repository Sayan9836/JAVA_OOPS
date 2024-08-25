import java.util.Scanner;

/**
 * Main
 */
public class Main {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the tournament");
        String name = sc.next();
        System.out.println("Enter the Location of the Tournament");
        String location = sc.nextLine();

        Tournament tournament = new Tournament(name, location);

        int choice = -1;
        do {

        System.out.println("Enter 1 for ADD TEAM || 2 for Display Team || 3 for delete Team || 4 for Exit");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                tournament.TeamMaker();
            case 2:
                tournament.displayTeams();
            case 3:
             int teamId = tournament.findTeam();
             tournament.deleteTeam(teamId) ;       
             case 4:
               break;
        }

    }while(choice != 4)
        
    }
}