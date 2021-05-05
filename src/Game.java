public class Game  {
   private int gameId;
    private String gameName;
    private String gameDetail;
    private double gamePrice;

    public Game(int gameId, String gameName, String gameDetail, double gamePrice) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.gameDetail = gameDetail;
        this.gamePrice = gamePrice;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameDetail() {
        return gameDetail;
    }

    public void setGameDetail(String gameDetail) {
        this.gameDetail = gameDetail;
    }

    public double getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }



}
