import movie.Movie;

public class Rental {
    private Movie _movie;
    private int   _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie      = movie;
        _daysRented = daysRented;
    }

    public String getStatement() {
        return "\t" + _movie.getTitle() +
                "\t" + _movie.getRentalCost() + "\n";
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double getRentalCost() { return _movie.getRentalCost(_daysRented); }
    public int getFrequentRenterPoints() { return _movie.getFrequentRenterPoints(_daysRented); }
}