public class week_11_5 {
    public static void main(String[] args) {
        SmartPhoneDevice5 sp = new SmartPhoneDevice5();
        sp.powerOn();
        sp.connectWiFi();
    }
}

interface Device5 {
    void powerOn();
}

interface SmartDevice5 extends Device5 {
    void connectWiFi();
}

class SmartPhoneDevice5 implements SmartDevice5 {
    public void powerOn() {
        System.out.println("SmartPhoneDevice5 powered ON");
    }

    public void connectWiFi() {
        System.out.println("SmartPhoneDevice5 connected to WiFi");
    }
}
