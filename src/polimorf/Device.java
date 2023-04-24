package polimorf;

public class Device {

    public Device() {
        System.out.println("Device constructor");
    }

    public void powerOnDevice(int hours) {
        System.out.println("Device is on for " + hours + " hours");
    }

    public void powerOnDevice(int hours, String who) {
        System.out.println("Device is on for " + hours + " hours by " + who);
    }
}