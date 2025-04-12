import java.util.ArrayList;

public class Customer {
    private final String _name;
    private final ArrayList<Rental> _rentals = new ArrayList<>();
    private double totalRentalCost;
    private int totalFrequentRenterPoints;

    public Customer (String name) {
        _name = name;
    }

    public void addRental(Rental rental) {
        _rentals.add(rental);
    }

    public String getName() {
        return _name;
    }



    public String statement() {
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for ").append(getName()).append("\n");

        for (Rental currentRental : _rentals) {
            result.append(currentRental.getStatement());
        }

        // add footer lines
        result.append(getFooter());
        return result.toString();
    }

    private String getFooter() {
        return "Amount owed is " + totalRentalCost + "\n" +
                "You earned " + totalFrequentRenterPoints +
                " frequent renter points\n\n";
    }

    private double getTotalRentalCost() {
        double totalRentalCost = 0;
        for (Rental currentRental : _rentals) {
            totalRentalCost += currentRental.getRentalCost();
        }
        return totalRentalCost;
    }

    private int getTotalFrequentRenterPoints() {
        int totalFrequentRenterPoints = 0;
        for (Rental currentRental : _rentals) {
            totalFrequentRenterPoints += currentRental.getFrequentRenterPoints();
        }
        return totalFrequentRenterPoints;
    }
}