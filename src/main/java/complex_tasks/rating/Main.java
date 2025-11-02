package complex_tasks.rating;

public class Main {
    public static void main(String[] args) throws Exception {

        MovieService<Double> service = new MovieService<>();

        Movie<Double> movie1 = new Movie<>("Sun", "drama", 1.5);
        Movie<Double> movie2 = new Movie<>("Voice", "comedy", 1.6);
        Movie<Double> movie3 = new Movie<>("Street", "action", 1.9);

        Rating<Double> rating1 = new Rating<>(6.0, "John", "");
        Rating<Double> rating2 = new Rating<>(7.2, "Monica", "");
        Rating<Double> rating4 = new Rating<>(7.8, "Sam", "");
        Rating<Double> rating5 = new Rating<>(9.0, "David", "");
        Rating<Double> rating6 = new Rating<>(5.9, "Mike", "");
        Rating<Double> rating8 = new Rating<>(8.4, "Lucy", "");
        Rating<Double> rating9 = new Rating<>(6.7, "Kate", "");
        Rating<Double> rating11 = new Rating<>(8.8, "George", "");
        Rating<Double> rating12 = new Rating<>(-8.8, "Paul", "");

        service.addMovie(movie1);
        service.addRating(movie1, rating1);

        service.addRating(movie1, rating2);
        service.addRating(movie1, rating6);

        service.addRating(movie2, rating5);
        service.addRating(movie2, rating4);
        service.addRating(movie2, rating11);

        service.addRating(movie3, rating8);
        service.addRating(movie3, rating9);
        try {
            service.addRating(movie3, rating12);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(service.getMovieStorage());

        try {
            System.out.println(service.averageRating(movie3));
        } catch (Exception e) {
            System.out.println("Error");
        }

        System.out.println(service.sortMovieByAverageRating());
    }
}
