package Concrete;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean CheckIfRealPlayer(Gamer gamer) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}
