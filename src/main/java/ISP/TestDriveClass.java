package ISP;

import java.util.ArrayList;

public class TestDriveClass {
    public static void main(String[] args) {
        ArrayList<AllRefuel> allRefuels = new ArrayList<>();
        allRefuels.add(new Boeing());
        allRefuels.add(new Hyundai());
        allRefuels.add(new Kamaz());
        allRefuels.add(new Tesla());
        allref(allRefuels);
    }
    public static void allref(ArrayList<AllRefuel> a){
        for(AllRefuel allRefuel:a){
            allRefuel.refuel();
        }
    }
}