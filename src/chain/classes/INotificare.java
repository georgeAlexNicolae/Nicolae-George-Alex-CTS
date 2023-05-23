package chain.classes;

public abstract class INotificare {
	private INotificare nextNotif;
	
	public INotificare getNextNotif() {
		return nextNotif;
	}

	public void setNextNotif(INotificare nextNotif) {
		this.nextNotif = nextNotif;
	}

	public INotificare(INotificare nextNotif) {
		super();
		this.nextNotif = nextNotif;
	}

	public abstract void trimiteNotificare(Client client, String mesaj);
}
