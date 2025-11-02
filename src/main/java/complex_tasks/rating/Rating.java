package complex_tasks.rating;

public class Rating<T extends Number> {

    private T value;
    private String userName;
    private String comment;

    public Rating(T value, String userName, String comment) {
        this.value = value;
        this.userName = userName;
        this.comment = comment;
    }

    public T getValue() {
        return this.value;
    }

    public String getUserName() {
        return userName;
    }

    public String getComment() {
        return comment;
    }

    public boolean isValidRating() {
        if (this.value.doubleValue() > 0 && this.value.doubleValue() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Rating{" +
                "value=" + value +
                ", userName='" + userName + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
