package main;

import java.rmi.RemoteException;

public interface Authenticator {
	public boolean authenticate(Account account) throws RemoteException;
}
