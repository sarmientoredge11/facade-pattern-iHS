package facadePatternIHS;

class TV implements HomeService {

    @Override
    public void turnOn() {
        System.out.println("TV turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turned OFF.");
    }
}