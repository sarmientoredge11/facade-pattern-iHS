package facadePatternIHS;

class Light implements HomeService {

    @Override
    public void turnOn() {
        System.out.println("Lights turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Lights turned OFF.");
    }
}
