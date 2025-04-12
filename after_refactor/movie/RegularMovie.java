package movie;

public class RegularMovie extends Movie {
    private String title;

    protected RegularMovie(String title) {
        super(title);
    }

    @Override
    public double getOriginalCost() { return 2; }

    @Override
    public double getRentDayLimit() { return 2; }

    @Override
    public double getLatePenalty() { return 1.5; }

    @Override
    public double getRentalCost(int daysRented) {
        double cost = getOriginalCost();
        if (daysRented > getRentDayLimit()) {
            cost += (daysRented - getRentDayLimit()) * getLatePenalty();
        }
        return cost;
    }

    @Override
    public PriceCode getPriceCode() { return PriceCode.REGULAR; }
}
