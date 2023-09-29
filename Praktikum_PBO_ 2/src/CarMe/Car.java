package CarMe;
public class Car {
    int throttle;
    int speed;
    int gear;
    String info;
    
    void changeCadence (int pedal) {
        throttle = pedal;
    }

    void speedUp (int power) {
        speed = power;
    }

    void changeGear (int handle) {
        gear = handle;
    }

    void printInfo() {
        System.out.println(
            "pedal gas : " + throttle + "\n" +
            "kecepatan : " + speed + "\n" +
            "Gigi : " + gear);
    }
}