package facadePatternIHS;

class AirConditioning implements HomeService {

    @Override
    public void turnOn() {
        System.out.println("Air conditioning turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Air conditioning turned OFF.");
    }
}