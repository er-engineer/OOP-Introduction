package main;

import java.rmi.RemoteException;
import java.util.Locale;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class IdentityAuthenticator implements Authenticator {
	
	KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

	@Override
	public boolean authenticate(Account account) throws RemoteException{

			return kpsPublicSoapProxy.TCKimlikNoDogrula
							 (
							account.owner.getIdentityNumber(), 
							account.owner.getName().toUpperCase(new Locale("tr")), 
							account.owner.getSurname().toUpperCase(new Locale("tr")), 
							account.owner.getBirthDate().getYear()
							);
	}
}
