package animals.bonus;

public class Creator {

    public Device create(String device) {
        if (device.equals("playstation")) {
            return new Playstation();
        } else if (device.equals("Dvd player")) {
            return new DvdPlayer();
        }
        return null;
    }
}
