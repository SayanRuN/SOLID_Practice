package ISP;

public class Tesla implements RefuelWithElectricity{
    @Override
    public void refuel() {
        System.out.println("Заправиться электричестовом");
    }
}