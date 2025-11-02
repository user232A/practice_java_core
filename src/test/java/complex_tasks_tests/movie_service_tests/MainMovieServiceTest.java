package complex_tasks_tests.movie_service_tests;

import complex_tasks.rating.Movie;
import complex_tasks.rating.MovieService;
import complex_tasks.rating.Rating;
import org.junit.jupiter.api.BeforeEach;

public class MainMovieServiceTest {

    protected MovieService<Double> service;
    protected Movie<Double> movie1;
    protected Movie<Double> movie2;
    protected Rating<Double> rating1;
    protected Rating<Double> rating2;
    Rating<Double> invalidRating;

    @BeforeEach
    public void setUp() {
        service = new MovieService<>();
        movie1 = new Movie<>("Street", "action", 1.9);
        movie2 = new Movie<>("Road", "drama", 1.7);
        rating1 = new Rating<>(6.0, "John", "");
        rating2 = new Rating<>(7.0, "John", "");
        invalidRating = new Rating<>(-6.0, "John", "");
    }
}
