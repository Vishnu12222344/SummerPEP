package summerpep2.Interfaces;

public class SmartTv implements PlayMedia, ConnectToWifi {
	public void PlayMedia() {
		System.out.println("Playing the tv");
	}
	public void ConnectToWifi() {
		System.out.println("Successfully Connected");
	}
}
