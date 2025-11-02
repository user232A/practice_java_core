package complex_tasks.rating;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MovieService<T extends Number> {

    private Map<Movie<T>, List<Rating<T>>> movieStorage;

    public MovieService() {
        this.movieStorage = new ConcurrentHashMap<>();
    }

    public Map<Movie<T>, List<Rating<T>>> getMovieStorage() {
        return movieStorage;
    }

    public void addMovie(Movie<T> movie) {
        if (movie == null) {
            throw new IllegalArgumentException("Movie is null");
        }
        movieStorage.putIfAbsent(movie, new ArrayList<>());
    }

    public void addRating(Movie<T> movie, Rating<T> rating) throws Exception {
        if (movie == null || rating == null || !rating.isValidRating()) {
            throw new IllegalArgumentException("Argument is incorrect");
        }
        movieStorage.computeIfAbsent(movie, m -> new ArrayList<>()).add(rating);
    }

    public double averageRating(Movie<T> movie) throws RuntimeException {
        if (movie == null) {
            throw new IllegalArgumentException("Argument is incorrect");
        }
        if (movieStorage.get(movie).isEmpty()) {
            throw new NullPointerException();
        }
        return movieStorage.get(movie).stream().mapToDouble(
                rating -> rating.getValue().doubleValue()).average().getAsDouble();
    }

    public List<Movie<T>> sortMovieByAverageRating() {
        return movieStorage.keySet().stream().sorted(Comparator.comparing(this::averageRating)).toList();
    }
}
