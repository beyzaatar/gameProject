package Abstract;

import Entities.Campaign;
import Entities.GameSale;
import Entities.Gamer;

public interface GameSaleService {
	void Sell(Gamer gamer, GameSale gameSale,Campaign campaign);

}
