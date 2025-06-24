package summerpep2.Interfaces;

public class phone implements PlayMedia, MakeCalls, ConnectToWifi {
	public void PlayMedia() {
		System.out.println("Playing the tv");
	}
	public void MakeCalls() {
		System.out.println("Calling");
	}
	public void ConnectToWifi() {
		System.out.println("Successfully Connected");
	}

}
