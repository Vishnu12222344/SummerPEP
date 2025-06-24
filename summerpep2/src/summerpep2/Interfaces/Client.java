package summerpep2.Interfaces;

public class Client {
    public static void main(String[] args) {
        phone myPhone = new phone();
        System.out.println("PHONE \n");
        myPhone.PlayMedia();
        myPhone.MakeCalls();
        myPhone.ConnectToWifi();
        
        SmartTv s=new SmartTv();
        System.out.println("\nSMART TV\n");
        s.ConnectToWifi();
        s.PlayMedia();
    }
}
