package NewLearningsJava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Movie {
    String title;
    int year;
    double rating;

    public Movie(String title, int year, double rating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public void display() {
        System.out.println(title + " (" + year + ") - Rating: " + rating);
    }
}

public class MovieSorter {
    public static void sortMovies(List<Movie> movies) {
        int n = movies.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (movies.get(j).rating < movies.get(j + 1).rating) { // Sorting in descending order
                    Movie temp = movies.get(j);
                    movies.set(j, movies.get(j + 1));
                    movies.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 2010, 8.8));
        movies.add(new Movie("The Dark Knight", 2008, 9.0));
        movies.add(new Movie("Interstellar", 2014, 8.6));
        movies.add(new Movie("Parasite", 2019, 8.6));
        movies.add(new Movie("Fight Club", 1999, 8.8));

        System.out.println("Before Sorting:");
        for (Movie movie : movies) {
            movie.display();
        }
      //  movies.sort(Comparator.comparing(e->e.rating));        
        sortMovies(movies);
        
        System.out.println("\nAfter Sorting:");
        for (Movie movie : movies) {
            movie.display();
        }
    }
}

