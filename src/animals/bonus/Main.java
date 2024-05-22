package animals.bonus;

public class Main {

    public static void main(String[] args) {
        Creator creator = new Creator();

        Device device = creator.create("playstation");
        device.play();
        device.stop();

        Device device2 = creator.create("Dvd player");
        device2.play();
        device2.stop();

    }
}
