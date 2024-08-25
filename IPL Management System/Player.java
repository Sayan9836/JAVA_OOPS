public abstract class Player {

    private String name;
    private int playerId;

    public Player() {

    }

    public Player(String name, int playerId) {
        this.name = name;
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }



    
}
