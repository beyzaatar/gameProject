package Adapter;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
	
	@Override
	public boolean CheckIfRealPlayer(Gamer gamer) throws NumberFormatException, RemoteException {
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getBirthYear());
		if(result == true)
		{
			System.out.println("Baþarýlý");
			return true;
			
		}else {
			System.out.println("Baþarýsýz");
			return false;
		}
	}


}
