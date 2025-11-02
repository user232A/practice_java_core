package complex_tasks.rating;

import java.util.Objects;

public class Movie<T extends Number> {

    private String name;
    private String genre;
    private double duration;

    public Movie(String name, String genre, double duration) {
        this.name = name;
        this.genre = genre;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie<?> movie = (Movie<?>) o;
        return Double.compare(duration, movie.duration) == 0 && Objects.equals(name, movie.name)
                && Objects.equals(genre, movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genre, duration);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", duration=" + duration +
                '}';
    }
}
