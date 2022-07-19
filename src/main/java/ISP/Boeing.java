package ISP;

public class Boeing implements RefuelWithKerosene{
    @Override
    public void refuel() {
        System.out.println("Заправиться керосином");
    }
}