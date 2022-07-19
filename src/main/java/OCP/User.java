package OCP;

public class User {
    String name;
    int age;
    MediaCompany mediaCompany;
    int month;

    public int getMonth() {
        return month;
    }

    public double pay(MediaCompany mediaCompany, int month) {
        double a = mediaCompany.payToUse(new User());
        return a + month;
    }
}