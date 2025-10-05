package practice_1;

public class GameSettings {

    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int players) {
        maxPlayers = players;
    }

    public void addPlayer() {
        if ((currentPlayers + 1) <= maxPlayers) {
            currentPlayers++;
        } else {
            System.out.println("Превышено максимальное кол-во игроков");
        }
    }

    public void printGameStatus() {
        System.out.println("Game name " + this.gameName + " Current players " + this.currentPlayers +
                " Max players " + maxPlayers);
    }
}
