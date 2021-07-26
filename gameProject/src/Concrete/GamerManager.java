package Concrete;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	
	GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void Add(Gamer gamer) throws NumberFormatException, RemoteException {
		if(gamerCheckService.CheckIfRealPlayer(gamer)){
			System.out.println(gamer.getFirstName() + " oyuncusu sisteme eklendi.");
		}else {
			System.out.println("Hatalý kullanýcý giriþi");
			Delete(gamer);
		}		
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " oyuncusunun bilgileri güncellendi.");	
		
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " oyuncusu sistemden silindi.");
		
	}

}
