import java.util.ArrayList;
import java.util.List;

public class Player {
    Integer number;
    String name;
    Position position;

    public Player(Integer number, String name, Position position) {
        this.number = number;
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return number + " - "+ name +" - "+ position; }

    public static List<Player> getPlayerList() {
        List<Player> allPlayers = new ArrayList<>();
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
}