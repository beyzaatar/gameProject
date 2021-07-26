package Abstract;

import java.rmi.RemoteException;

import Entities.Gamer;

public interface GamerCheckService {
	boolean CheckIfRealPlayer(Gamer gamer) throws NumberFormatException, RemoteException;

}
