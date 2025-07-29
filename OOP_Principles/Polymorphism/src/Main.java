import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie theMovie = Movie.getMovie("Sucker", "Star Wars");
        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print(
                    "Enter Type: \n(A) for Adventure \n(C) for Comedy \n(S) " +
                            "for Science Fiction \n(Q) to quit\n");
            String type = s.nextLine();

            if(type.equalsIgnoreCase("q")) break;

            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
