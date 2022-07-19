package OCP;

public class Netflix implements MediaCompany {
    @Override
    public double payToUse(User user) {
        int a = user.getMonth();
        if (a > 12) {
            return 500;
        } else {
            return 50;
        }
    }
}
