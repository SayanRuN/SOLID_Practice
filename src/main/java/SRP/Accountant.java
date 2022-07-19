package SRP;

import SRP.BusDriver;

public class Accountant {

    public void bonus(BusDriver busDriver) {
        int a = busDriver.salary(0, 0);
        if (a > 1500) {
            System.out.println("Прибавка 5000");
        } else if (a > 1000) {
            System.out.println("Прибавка 3000");
        } else {
            System.out.println("Бонуса нет");
        }
    }
}