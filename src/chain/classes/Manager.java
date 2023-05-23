package chain.classes;

public class Manager extends INotificare{

	public Manager(INotificare nextNotif) {
		super(nextNotif);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trimiteNotificare(Client client, String mesaj) {
		// TODO Auto-generated method stub
		System.out.println("clientul" +client.getNume()+ " nu are nr de tel sau email");
	}

}
