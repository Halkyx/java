import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Team team = new Team();
        team.getAllPlayer();
        team.buildTeam();    
        
        boolean check = true;
        while (check) {
            System.out.println("Do you want to get a new formation? Type Y or N");
            String option = scanner.nextLine();
            if(option.toUpperCase().equals("Y")){
                check = true;
            }else{
                check = false;
                scanner.close();
                System.exit(0);
            }

        System.out.println("Select formation: ");
            System.out.println(
                    "Hit 1 to select 1-4-4-2 formation. \nHit 2 to select 1-4-3-3 formation. \nHit 3 to select 1-3-5-2 formation.\n");
            int n = scanner.nextInt();
            scanner.nextLine();
            switch (n) {
            case 1:
                team.buildTeam(4, 4, 2);
                break;
            case 2:
                team.buildTeam(4, 3, 3);
                break;
            case 3:
                team.buildTeam(3, 5, 2);
                break;
            default:
                System.out.println("Invalid input");
                break;
            }
        }
    }
}