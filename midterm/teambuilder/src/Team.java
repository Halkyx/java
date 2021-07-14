import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    private List<Player> allPlayers;
    private Random random = new Random();
    private List<Player> outputFormation = new ArrayList<Player>();

    public Team(List<Player> allPlayers) {
        this.allPlayers = allPlayers;
    }

    public void getFormation(int DFs, int MFs, int FWs) {
        int GKcount = 0;
        int DFcount = 0;
        int MFcount = 0;
        int FWcount = 0;
        int GKs = 1;
        while (GKcount < GKs) {
            int randomNumber = random.nextInt(22);
            if (allPlayers.get(randomNumber).position.equals(Position.GK)) {
                outputFormation.add(allPlayers.get(randomNumber));
                GKcount++;
            }
        }
        while (DFcount < DFs) {
            int randomNumber = random.nextInt(22);
            if ((allPlayers.get(randomNumber).position.equals(Position.DF))
                    && !outputFormation.contains(allPlayers.get(randomNumber))) {
                outputFormation.add(allPlayers.get(randomNumber));
                DFcount++;
            }
        }

        while (MFcount < MFs) {
            int randomNumber = random.nextInt(22);
            if ((allPlayers.get(randomNumber).position.equals(Position.MF))
                    && !outputFormation.contains(allPlayers.get(randomNumber))) {
                outputFormation.add(allPlayers.get(randomNumber));
                MFcount++;
            }
        }

        while (FWcount < FWs) {
            int randomNumber = random.nextInt(22);
            if ((allPlayers.get(randomNumber).position.equals(Position.FW))
                    && !outputFormation.contains(allPlayers.get(randomNumber))) {
                outputFormation.add(allPlayers.get(randomNumber));
                FWcount++;
            }
        }
    }

    public List<Player> getOutputFormation() {
        return outputFormation;
    }

}
