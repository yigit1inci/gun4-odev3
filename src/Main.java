import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        UserManager userManager = new UserManager(new MernisServiceAdapter());
        User user = new User(1, "İnci", "Yiğit", "11395471428", LocalDate.of(1993, 7, 17));

        try {
            userManager.add(user);
            userManager.update(user);
            userManager.delete(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        GameManager gameManager = new GameManager();
        Game game = new Game(1,"A","Aksiyon", 70);
        gameManager.add(game);
        gameManager.update(game);
        gameManager.delete(game);
        gameManager.sell(game,user);

        CampaignManager campaignManager = new CampaignManager();
        Campaign campaign=new Campaign(1,"BAHAR25","Bahar Kampanyası",
                " Bahar Ayına Özel İndirim",25);
        campaignManager.add(campaign);
        campaignManager.update(campaign);
        campaignManager.delete(campaign);
        campaignManager.sell(campaign,game);

        gameManager.save(game,campaign,user);


    }








}

