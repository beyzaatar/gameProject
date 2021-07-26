package gameProject;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GameSaleManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.GameSale;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		//add gamer
		Gamer gamer1 = new Gamer(1,"Beyza","atar","12345678912",1998);
		
		//add game
		GameSale gameSale1 = new GameSale(1,"Mario",400);
		
		//add campaign
		Campaign campaign1 = new Campaign(1,"Christmas",15);
				
				
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.Add(gamer1);			
				
				
		GameManager gameManager = new GameManager();
		gameManager.Add(gameSale1);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.Add(campaign1);
				
		GamerCheckService gamerCheckService = new MernisServiceAdapter(); 

				
		GameSaleManager gameSaleManager = new GameSaleManager();
		if( gamerCheckService.CheckIfRealPlayer(gamer1) == true) {
			gameSaleManager.Sell(gamer1, gameSale1, campaign1);
		}else {
				System.out.println("Kullanýcý doðrýlanamadýðýndan oyun satýþý yapýlamadý.");
			}
					

	}

}
