package chain.classes;

public class eMailNotificator extends INotificare{

	public eMailNotificator(INotificare nextNotif) {
		super(nextNotif);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trimiteNotificare(Client client, String mesaj) {
		// TODO Auto-generated method stub
		if(client.getEmail()!=null)
		{
			System.out.println("clientul "+client.getNume() + " ai primit email-ul: "+mesaj);
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
