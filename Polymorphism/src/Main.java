import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie theMovie = new Movie("Star wars");
//        theMovie.watchMovie();
//
//        Adventure theAdventureMovie = new Adventure("Indiana Jones");
//        theAdventureMovie.watchMovie();
//
//        Comedy theComedyMovie = new Comedy("American Pie");
//        theComedyMovie.watchMovie();
//
//        ScienceFiction theScienceFictionMovie = new ScienceFiction("Star Trek");
//        theScienceFictionMovie.watchMovie();
//
//        Movie newMovie = Movie.getMovie("Adventure", "Tomb raider");
//        newMovie.watchMovie();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, S for Science Fiction, or Q to Quit): ");
            String type = scanner.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}