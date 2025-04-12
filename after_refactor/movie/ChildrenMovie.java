package movie;

public class ChildrenMovie extends Movie {


    protected ChildrenMovie(String title) {
        super(title);
    }

    @Override
    public double getOriginalCost() { return 1.5; }

    @Override
    public double getRentDayLimit() { return 3; }

    @Override
    public double getLatePenalty() { return 1.5; }

    @Override
    public double getRentalCost(int daysRented) {
        double fee = getOriginalCost();
        if (daysRented > getRentDayLimit()) {
            fee += (daysRented - getRentDayLimit()) * getLatePenalty();
        }
        return fee;
    }

    @Override
    public PriceCode getPriceCode() { return PriceCode.CHILDREN; }
}
