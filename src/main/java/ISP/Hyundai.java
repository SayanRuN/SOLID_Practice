package ISP;

public class Hyundai implements RefuelWithDiesel, RefuelWithGas, RefuelWithPetrol {
    @Override
    public void refuel() {
        System.out.println("Заправиться дизелем, газом, бензином");
    }
}