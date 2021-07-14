import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Player> allPlayers = Player.getPlayerList();
        Team Team = new Team(allPlayers);
        
        System.out.println("List of all players: " + allPlayers);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Select formation: ");
        System.out.println("Press 1 to select 1-4-3-3 formation.\nPress 2 to select 1-4-4-2 formation.\nPress 3 to select 1-3-5-2 formation.");
        int formationType = sc.nextInt();
        switch (formationType) {
            case 1 -> Team.getFormation(4, 3, 3);
            case 2 -> Team.getFormation(4, 4, 2);
            case 3 -> Team.getFormation(3, 5, 2);
            default -> System.out.println("invalid input");
        }

        List<Player> outputFormation = Team.getOutputFormation();

        for (Player player: outputFormation) {
            System.out.println(player);
        }
        sc.close();
    }
}