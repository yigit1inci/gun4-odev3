public class CampaignManager implements CampaignService {

    @Override
    public void add(Campaign campaign) {
        System.out.println("Kampanya eklendi : "+ campaign.getCampaignId() + " "+ campaign.getCampaignCode() + " "+
                campaign.getCampaignName() + " " + campaign.getDiscountPercent() + " " + campaign.getDiscountPercent() );
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Kampanya güncellendi : "+ campaign.getCampaignId() + " "+ campaign.getCampaignCode() + " "+
                campaign.getCampaignName() + " " + campaign.getDiscountPercent() + " " + campaign.getDiscountPercent());
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Kampanya silindi: "+ campaign.getCampaignId() + " "+ campaign.getCampaignCode() + " "+
                campaign.getCampaignName() + " " + campaign.getDiscountPercent() + " " + campaign.getDiscountPercent());

    }

    @Override
    public void sell(Campaign campaign, Game game) {

        System.out.println(game.getGameName() + " adlı oyun için kampanya tanımlandı : " + campaign.getCampaignId() + " " +
                campaign.getCampaignCode() + " " + campaign.getCampaignName() + " " + campaign.getDiscountPercent() + " " +
                campaign.getDiscountPercent() + " Ürün Fiyatı : " + game.getGamePrice() +
                " Kampanyalı Fiyatı : " + (game.getGamePrice() - (game.getGamePrice() * campaign.getDiscountPercent()/100)));


    }
}
