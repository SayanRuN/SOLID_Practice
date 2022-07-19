package ISP;

public class Kamaz implements RefuelWithKerosene, RefuelWithDieselFuel{
    @Override
    public void refuel() {
        System.out.println("Заправиться соляркой или керосином");
    }
}