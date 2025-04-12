package movie;

public abstract class Movie {
    public static enum PriceCode {
        CHILDREN,
        REGULAR,
        NEW_RELEASE
    };

    private final String _title;

    protected Movie(String title) {
        _title = title;
    }

    public static Movie createMovie(String title, PriceCode priceCode) {
        return switch (priceCode) {
            case CHILDREN -> new ChildrenMovie(title);
            case REGULAR -> new RegularMovie(title);
            case NEW_RELEASE -> new NewReleaseMovie(title);
            default -> throw new IllegalArgumentException("Invalid price code: " + priceCode);
        };
    }

    public String getTitle() {
        return _title;
    }

    public int getFrequentRenterPoints(int daysRented) { return 1; }

    abstract public double getOriginalCost();
    abstract public double getRentDayLimit();
    abstract public double getLatePenalty();
    abstract public double getRentalCost(int daysRented);

    abstract public PriceCode getPriceCode();

}