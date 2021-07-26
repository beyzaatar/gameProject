package Concrete;

import Abstract.GameService;
import Entities.GameSale;

public class GameManager implements GameService{

	@Override
	public void Add(GameSale gameSale) {
		System.out.println(gameSale.getGameSaleName() + " oyunu sisteme eklendi.");		
		
	}

	@Override
	public void Update(GameSale gameSale) {
		System.out.println(gameSale.getGameSaleName() + " oyun bilgileri güncellendi.");	
		
	}

	@Override
	public void Delete(GameSale gameSale) {
		System.out.println(gameSale.getGameSaleName() + " oyunu sistemden silindi.");		
		
	}

}
