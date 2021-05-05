public class GameManager implements GameService {

    public GameManager(){

    }


    @Override
    public void add(Game game) {
        System.out.println("Oyun eklendi : " + game.getGameId() + " " + game.getGameName()
                + " " + game.getGameDetail() + " " +game.getGamePrice());
    }

    @Override
    public void update(Game game) {
        System.out.println("Oyun güncellendi : " + game.getGameId() + " " + game.getGameName()
                + " " + game.getGameDetail() + " " +game.getGamePrice());
    }

    @Override
    public void delete(Game game) {
        System.out.println("Oyun silindi : " + game.getGameId() + " " + game.getGameName()
                + " " + game.getGameDetail() + " " +game.getGamePrice());
    }

    @Override
    public void sell(Game game,User user) {
        System.out.println(user.getFirstName() + " "+ user.getLastName() + " tarafından oyun satın alındı : "
                + game.getGameId() + " " + game.getGameName() + " " + game.getGameDetail() + " " +game.getGamePrice());
    }

    @Override
    public void save(Game game, Campaign campaign, User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adlı oyuncu için "+
                game.getGameName() + " adlı oyuna " + campaign.getCampaignName() + " tanımlandı.");
    }

}
