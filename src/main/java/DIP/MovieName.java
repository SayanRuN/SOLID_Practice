package DIP;

public class MovieName implements Movie {
    String name;

    public MovieName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int boxOffice() {
        return 0;
    }
}