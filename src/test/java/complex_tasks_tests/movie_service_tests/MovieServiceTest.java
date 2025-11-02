package complex_tasks_tests.movie_service_tests;

import complex_tasks.rating.Movie;
import complex_tasks.rating.Rating;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MovieServiceTest extends MainMovieServiceTest {

    @Test
    public void canAddValidRatingToStorage() throws Exception {
        service.addRating(movie1, rating1);
        List<Rating<Double>> actualRatingsList = service.getMovieStorage().get(movie1);

        Assertions.assertEquals(rating1, actualRatingsList.getFirst());
        Assertions.assertFalse(service.getMovieStorage().isEmpty());
        Assertions.assertTrue(service.getMovieStorage().containsKey(movie1));
    }

    @Test
    public void cannotAddInvalidRating() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.addRating(movie1, invalidRating));
    }

    @Test
    public void cannotAddNullRating() {
        Rating<Double> nullRating = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.addRating(movie1, nullRating));
    }

    @Test
    public void cannotAddNullMovie() {
        Movie<Double> nullMovie = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.addRating(nullMovie, rating1));
    }

    @Test
    public void canCalculateAverageRating() throws Exception {
        service.addRating(movie1, rating1);
        service.addRating(movie1, rating2);

        double expectedAverageRating = 6.5;
        Assertions.assertEquals(expectedAverageRating, service.averageRating(movie1));
    }

    @Test
    public void cannotCalculateAverageRatingNullMovie() {
        Movie<Double> nullMovie = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.addRating(nullMovie, rating1));
    }

    @Test
    public void cannotCalculateAverageRatingEmptyStorage() {
        Assertions.assertThrows(NullPointerException.class, () -> service.averageRating(movie1));
    }

    @Test
    public void canSortMovieByAverageRating() throws Exception {
        service.addRating(movie2, new Rating<>(8.8, "George", ""));
        service.addRating(movie2, new Rating<>(6.7, "Kate", ""));
        service.addRating(movie2, new Rating<>(8.4, "Lucy", ""));

        service.addRating(movie1, new Rating<>(5.9, "Mike", ""));
        service.addRating(movie1, new Rating<>(9.0, "David", ""));
        service.addRating(movie1, new Rating<>(7.8, "Sam", ""));

        List<Movie<Double>> expectedSortedMovies = List.of(movie1, movie2);
        List<Movie<Double>> actualSortedMovies = service.sortMovieByAverageRating();

        Assertions.assertEquals(expectedSortedMovies, actualSortedMovies);
    }
}
