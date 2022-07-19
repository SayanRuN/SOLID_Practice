package DIP;

public class TestDrive {
    public static void main(String[] args) {
        Movie movie1 = new Scream("Крик");
        Movie movie2 = new Lalaland("Лалалэнд");
        Movie movie3 = new X_man("Люди икс");

        Cinema cinema = new Kinopark();
        cinema.release(movie1);
        cinema.release(movie2);
        cinema.release(movie3);
    }
}