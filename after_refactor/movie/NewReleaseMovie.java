package movie;

public class NewReleaseMovie extends Movie{
    protected NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    public double getOriginalCost() {
        return 3;
    }

    @Override
    public double getRentDayLimit() {
        return 0;
    }

    @Override
    public double getLatePenalty() {
        return 3;
    }

    @Override
    public double getRentalCost(int daysRented) {
        return daysRented * getLatePenalty();
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        if (daysRented > 1) return 2;
        return 1;
    }

    @Override
    public PriceCode getPriceCode() {
        return PriceCode.NEW_RELEASE;
    }
}
