package Abstract;

import Entities.GameSale;

public interface GameService {
	void Add(GameSale gameSale);
	void Update(GameSale gameSale);
	void Delete(GameSale gameSale);
}
