package Abstract;

import java.rmi.RemoteException;

import Entities.Gamer;

public interface GamerService {
	void Add(Gamer gamer) throws NumberFormatException, RemoteException;
	void Update(Gamer gamer);
	void Delete(Gamer gamer);
}
