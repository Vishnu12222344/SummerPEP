package SOLID;
interface USBTypeC {
    void chargePhone();
}
class OldCharger {
    public void chargeWithRoundPin() {
        System.out.println("Charging phone with old round pin charger");
    }
}
class ChargerAdapter implements USBTypeC {
    OldCharger oldCharger;

    public ChargerAdapter(OldCharger oldCharger) {
        this.oldCharger = oldCharger;
    }
    @Override
    public void chargePhone() {
        oldCharger.chargeWithRoundPin();
    }
}
public class AdapterDemo {
    public static void main(String[] args) {
        OldCharger oldCharger = new OldCharger();
        USBTypeC adapter = new ChargerAdapter(oldCharger);
        adapter.chargePhone();
    }
}

