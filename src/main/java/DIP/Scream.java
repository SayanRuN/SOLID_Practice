package DIP;

public class Scream extends MovieName {
    public Scream(String name) {
        super(name);
    }

    @Override
    public int boxOffice() {
        return 305600;
    }
}