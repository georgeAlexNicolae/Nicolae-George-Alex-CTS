package chain.classes;

public class SMSNotificator extends INotificare {

	public SMSNotificator(INotificare nextNotif) {
		super(nextNotif);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trimiteNotificare(Client client, String mesaj) {
		// TODO Auto-generated method stub
		if(client.getNrTelefon()!=null)
		{
			System.out.println("clientul "+client.getNume() + " ai primit mesajul: "+mesaj);
		}
		else if(super.getNextNotif()!=null) {
			super.getNextNotif().trimiteNotificare(client, mesaj);
		}
		else
		{
			System.out.println("Nu se poate trimite notifcarea");
		}
	}
	
	
}
