import java.util.concurrent.ThreadLocalRandom;

public class Robot implements Comparable<Robot> {

    private String name;
    private int id;
    private static int cntId = 10;
    private static final int MIN_LENGTH = 3;
    private static final int MAX_LENGTH = 15;
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private int batteryLevel;
    private boolean status;

    public Robot() {
        this.name = generateName();
        this.id = cntId++;
        this.batteryLevel = 100;
        this.status = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void dischargeBattery() {
        int amount = ThreadLocalRandom.current().nextInt(0,100);
        this.batteryLevel -= amount;
    }

    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    private String generateName() {
        String name = "";
        int num_characters = (int) (Math.random() * (MAX_LENGTH - MIN_LENGTH)) + MIN_LENGTH;
        for (int i = 0; i < num_characters; i++) {
            int pos = (int) (Math.random() * ALPHABET.length());
            name += ALPHABET.charAt(pos);
        }
        return name;
    }

    @Override
    public String toString() {
        String representation = "";
        if (status) {
            representation = String.format("%-15s", batteryLevel + "%");
        } else {
            representation = String.format("%-15s", name);
        }
        return representation;
    }

    @Override
    public int compareTo(Robot o2) {
        if (this.getName().length() > o2.getName().length())
            return 1;
        else if (this.getName().length() < o2.getName().length())
            return -1;
        else {
            return 0;
        }
    }
}