package chain.main;

import chain.classes.Client;
import chain.classes.INotificare;
import chain.classes.Manager;
import chain.classes.SMSNotificator;
import chain.classes.eMailNotificator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INotificare sms = new SMSNotificator(null);
		INotificare email = new eMailNotificator(null);
		INotificare manager = new Manager(null);
		
		sms.setNextNotif(email);
		email.setNextNotif(manager);
		
		Client client1 = new Client("Gixi", null, "gixi@gmail.com");
		Client client2 = new Client("Ady", "0743405469", null);
		Client client3 = new Client("Alex", null, null);
		Client client4 = new Client("Mihai", "0722839283", "miha@gmail.com");
		
		sms.trimiteNotificare(client1, "mesaj");
		sms.trimiteNotificare(client2, "ceva");
		sms.trimiteNotificare(client3, "vedem");
		sms.trimiteNotificare(client4, "hai");
	
	}

}
