package Concrete;

import Abstract.GameSaleService;
import Entities.Campaign;
import Entities.GameSale;
import Entities.Gamer;

public class GameSaleManager implements GameSaleService {

	@Override
	public void Sell(Gamer gamer, GameSale gameSale, Campaign campaign) {
double price = gameSale.getGameSalePrice() - (gameSale.getGameSalePrice() * campaign.getCampaignDiscount() / 100 ); 
		
		System.out.println(gamer.getFirstName() + " oyuncusuna " + gameSale.getGameSalePrice() + " deðerindeki " + gameSale.getGameSaleName() + " isimli oyun " + campaign.getCampaignName() + " kampanyası ile yüzde " + 
		campaign.getCampaignDiscount() + " indirimle " + price + " fiyatına satılmıştır.");		
	}

}
