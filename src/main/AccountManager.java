package main;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Locale;

public class AccountManager {
	Authenticator authenticator = new IdentityAuthenticator();
	void add(Account account, ArrayList<Account> database, Logger[] loggers) throws RemoteException {
		
		String message = account.owner.getCustomerType() && authenticator.authenticate(account) ? 
		"A new customer has been added to DB as an individual customer --> " + account.owner.getName() + " " + 
	account.owner.getSurname() + ", " + account.getId() : 
		"A new customer has been added to DB as a corporate customer --> " + account.owner.getName() + " " + 
			account.owner.getSurname() + ", " + account.getId();
		
		
		
			if(authenticator.authenticate(account)){
				database.add(account);
				for(Logger logger : loggers) 
				logger.log(message);
					}
			else
				for(Logger logger : loggers) 
				logger.log(account.owner.getName().toUpperCase(new Locale("tr")) + " " + account.owner.getSurname().toUpperCase(new Locale("tr")) + " named owner could not be verified.");
		
		
	
			
				
				
		
	}
	void delete(Account account, ArrayList<Account> database, Logger[] loggers) {
		String message = "A customer has been deleted from DB --> " + account.owner.getName() + " " + 
	account.owner.getSurname() + ", " + account.getId();
					
		database.remove(account.getId()-1);
					
		for(Logger logger : loggers)
			logger.log(message);
	}
	void edit(Account account, ArrayList<Account> database, Logger[] loggers) {
		String message = "A customer changed its preferences --> " + account.owner.getName() + " " + 
				account.owner.getSurname() + ", " + account.getId();
					
		for(Logger logger : loggers)
			logger.log(message);
	}

}
