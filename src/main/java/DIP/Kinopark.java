package DIP;

public class Kinopark implements Cinema {


    @Override
    public void release(Movie movie) {
        System.out.println("Общие сборы фильма " + "\"" + movie.toString() + "\" - " + movie.boxOffice() + " $");
    }
}