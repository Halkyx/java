import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    ArrayList<Player> allPlayers;
    ArrayList<Player> selectedTeam;

    public List<Player> getAllPlayer(){
        allPlayers = new ArrayList<Player>();
        allPlayers.add(new Player(1,"Marc-André ter Stegen",Position.GK));
        allPlayers.add(new Player(2,"Sergiño Dest",Position.DF));
        allPlayers.add( new Player(3,"Gerard Piqué",Position.DF));
        allPlayers.add(new Player(4,"Ronald Araújo",Position.DF));
        allPlayers.add(new Player(5,"Sergio Busquets",Position.MF));
        allPlayers.add(new Player(6,"Antoine Griezmann",Position.FW));
        allPlayers.add(new Player(7,"Miralem Pjanić",Position.MF));
        allPlayers.add(new Player(8,"Martin Braithwaite",Position.FW));
        allPlayers.add(new Player(9,"Lionel Messi",Position.FW));
        allPlayers.add(new Player(10,"Ousmane Dembélé",Position.FW));
        allPlayers.add(new Player(11,"Riqui Puig",Position.MF));
        allPlayers.add(new Player(12,"Neto",Position.GK));
        allPlayers.add(new Player(13,"Clément Lenglet",Position.DF));
        allPlayers.add(new Player(14,"Pedri",Position.MF));
        allPlayers.add(new Player(15,"Francisco Trincão",Position.FW));
        allPlayers.add(new Player(16,"Jordi Alba",Position.DF));
        allPlayers.add(new Player(17,"Matheus Fernandes",Position.MF));
        allPlayers.add(new Player(18,"Sergi Roberto",Position.DF));
        allPlayers.add(new Player(19,"Frenkie de Jong",Position.MF));
        allPlayers.add(new Player(20,"Ansu Fati",Position.FW));
        allPlayers.add(new Player(21,"Samuel Umtiti",Position.DF));
        allPlayers.add(new Player(22,"Junior Firpo",Position.DF));
        return allPlayers;
    }

    public List<Player> buildTeam(){
        selectedTeam = new ArrayList<Player>();
        Random general = new Random();
        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwaderSize = 0;
        System.out.println("List of all players: " + allPlayers);
        System.out.println("List player:");
        while (gateKeeperSize < 1) {
            int rdGateKeeper = general.nextInt(22);
            if (allPlayers.get(rdGateKeeper).getPosition().equals(Position.GK)) {
                selectedTeam.add(allPlayers.get(rdGateKeeper));
                gateKeeperSize++;
            }
        }

        while (defenderSize < 4) {
            int rdDefender = general.nextInt(22);
            if (allPlayers.get(rdDefender).getPosition().equals(Position.DF)
                    && !selectedTeam.contains(allPlayers.get(rdDefender))) {
                selectedTeam.add(allPlayers.get(rdDefender));
                defenderSize++;
            }

        }

        while (midFieldSize < 4) {
            int rdMidField = general.nextInt(22);
            if (allPlayers.get(rdMidField).getPosition().equals(Position.MF)
                    && !selectedTeam.contains(allPlayers.get(rdMidField))) {
                selectedTeam.add(allPlayers.get(rdMidField));
                midFieldSize++;
            }
        }

        while (forwaderSize < 2) {
            int rdForwader = general.nextInt(22);
            if (allPlayers.get(rdForwader).getPosition().equals(Position.FW)
                    && !selectedTeam.contains(allPlayers.get(rdForwader))) {
                selectedTeam.add(allPlayers.get(rdForwader));
                forwaderSize++;
            }
        }

        selectedTeam.forEach(System.out::println);

        return null;
    }

    public List<Player> buildTeam(int defender, int midfielder, int forwarder ){
        selectedTeam = new ArrayList<Player>();
        Random general = new Random();
        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwaderSize = 0;
        System.out.println("List player: ");
        while (gateKeeperSize < 1) {
            int rdGateKeeper = general.nextInt(22);
            if (allPlayers.get(rdGateKeeper).getPosition().equals(Position.GK)) {
                selectedTeam.add(allPlayers.get(rdGateKeeper));
                gateKeeperSize++;
            }
        }

        while (defenderSize < defender) {
            int rdDefender = general.nextInt(22);
            if (allPlayers.get(rdDefender).getPosition().equals(Position.DF)
                    && !selectedTeam.contains(allPlayers.get(rdDefender))) {
                selectedTeam.add(allPlayers.get(rdDefender));
                defenderSize++;
            }

        }

        while (midFieldSize < midfielder) {
            int rdMidField = general.nextInt(22);
            if (allPlayers.get(rdMidField).getPosition().equals(Position.MF)
                    && !selectedTeam.contains(allPlayers.get(rdMidField))) {
                selectedTeam.add(allPlayers.get(rdMidField));
                midFieldSize++;
            }
        }

        while (forwaderSize < forwarder) {
            int rdForwader = general.nextInt(22);
            if (allPlayers.get(rdForwader).getPosition().equals(Position.FW)
                    && !selectedTeam.contains(allPlayers.get(rdForwader))) {
                selectedTeam.add(allPlayers.get(rdForwader));
                forwaderSize++;
            }
        }

        selectedTeam.forEach(System.out::println);

        return null;
    }
    
}